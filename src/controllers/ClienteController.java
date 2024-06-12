/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Service.ClienteInterface;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import conexion.ConexionAPI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author Joakamakaka
 */
public class ClienteController implements ClienteInterface {

    private ConexionAPI url;

    public ClienteController() {
        url = new ConexionAPI();
    }

    @Override
    public Cliente buscarPorId(Integer id) {
        String ruta = url.ruta() + "/api/v1/cliente/" + id;
        Cliente cliente = null;

        try {
            URL url = new URL(ruta);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();

            // Verificar la respuesta JSON completa
            String jsonResponse = response.toString();

            // Parsear el JSON como un objeto
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(jsonResponse, JsonObject.class);

            // Convertir el objeto JSON en un objeto Cliente
            cliente = gson.fromJson(jsonObject, Cliente.class);

            con.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cliente;
    }

    @Override
    public void eliminar(Cliente cliente) {
        String ruta = url.ruta() + "/api/v1/cliente/" + cliente.getId();

        try {
            URL url = new URL(ruta);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("DELETE");

            // Verificar la respuesta del servidor
            int responseCode = con.getResponseCode();
            switch (responseCode) {
                case HttpURLConnection.HTTP_OK:
                case HttpURLConnection.HTTP_NO_CONTENT:
                    System.out.println("Cliente eliminado exitosamente.");
                    break;
                case HttpURLConnection.HTTP_NOT_FOUND:
                    System.out.println("Cliente no encontrado.");
                    break;
                default:
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                    StringBuilder response = new StringBuilder();
                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();
                    System.out.println("Error al eliminar cliente: " + response.toString());
                    break;
            }

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Cliente> listarUsuarios() {
        String ruta = url.ruta() + "/api/v1/clientes";
        ArrayList<Cliente> clientes = new ArrayList<>();

        try {
            URL url = new URL(ruta);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();

            // Parsear el JSON como un objeto
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(response.toString(), JsonObject.class);

            // Obtener el array 
            JsonArray objetoArray = jsonObject.getAsJsonArray("objeto");

            // Iterar sobre los elementos del array
            for (int i = 0; i < objetoArray.size(); i++) {
                JsonObject clientesJson = objetoArray.get(i).getAsJsonObject();
                Cliente cli = gson.fromJson(clientesJson, Cliente.class);
                clientes.add(cli);
            }

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return clientes;
    }

    @Override
    public void guardarUsuario(Cliente cliente) {
        String ruta = url.ruta() + "/api/v1/cliente";
        try {
            URL url = new URL(ruta);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);

            // Convertir el objeto Usuario a JSON
            Gson gson = new Gson();
            String usuarioJson = gson.toJson(cliente);

            // Enviar los datos JSON al servidor
            con.getOutputStream().write(usuarioJson.getBytes());

            // Verificar la respuesta del servidor
            if (con.getResponseCode() == HttpURLConnection.HTTP_CREATED) {
                System.out.println("Usuario creado exitosamente.");
            } else {
                System.out.println("Error al crear usuario: " + con.getResponseMessage());
            }

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editarCliente(Cliente cliente) {
        String ruta = url.ruta() + "/api/v1/cliente/" + cliente.getId();
        
        try {
            URL url = new URL(ruta);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("PUT");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);

            Gson gson = new Gson();
            String sesionJson = gson.toJson(cliente);

            // Enviar los datos JSON al servidor
            con.getOutputStream().write(sesionJson.getBytes());

            // Verificar la respuesta del servidor
            if (con.getResponseCode() == HttpURLConnection.HTTP_CREATED) {
                System.out.println("Cliente modificada exitosamente.");
            } else {
                System.out.println("Error al modificar la cliente: " + con.getResponseMessage());
            }

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
