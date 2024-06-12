/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Service.PartidasInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import conexion.ConexionAPI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import model.Partidas;

/**
 *
 * @author Joakamakaka
 */
public class PartidasController implements PartidasInterface {

    private ConexionAPI url;

    public PartidasController() {
        url = new ConexionAPI();
    }

    @Override
    public ArrayList<Partidas> listarPartidas() {

        String ruta = url.ruta() + "/api/v1/partidas";
        ArrayList<Partidas> partidas = new ArrayList<>();

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

            // Crear una instancia de Gson con el DateAdapter registrado
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(Date.class, new dateAdapter.DateAdapter())
                    .create();

            // Parsear el JSON como un objeto
            JsonObject jsonObject = gson.fromJson(response.toString(), JsonObject.class);

            // Obtener el array 
            JsonArray objetoArray = jsonObject.getAsJsonArray("objeto");

            // Iterar sobre los elementos del array
            for (int i = 0; i < objetoArray.size(); i++) {
                JsonObject partidasJson = objetoArray.get(i).getAsJsonObject();
                Partidas part = gson.fromJson(partidasJson, Partidas.class);
                partidas.add(part);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return partidas;
    }

    @Override
    public ArrayList<Partidas> listarPartidasPorId(Integer clienteId) {
        String ruta = url.ruta() + "/api/v1/partidas/" + clienteId;
        ArrayList<Partidas> partidas = new ArrayList<>();

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

            // Crear una instancia de Gson con el DateAdapter registrado
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(Date.class, new dateAdapter.DateAdapter())
                    .create();

            // Parsear el JSON como un objeto
            JsonObject jsonObject = gson.fromJson(response.toString(), JsonObject.class);

            // Obtener el array 
            if (jsonObject.has("objeto") && jsonObject.get("objeto").isJsonArray()) {
                JsonArray objetoArray = jsonObject.getAsJsonArray("objeto");

                // Iterar sobre los elementos del array
                for (int i = 0; i < objetoArray.size(); i++) {
                    JsonObject partidasJson = objetoArray.get(i).getAsJsonObject();
                    Partidas part = gson.fromJson(partidasJson, Partidas.class);
                    partidas.add(part);
                }
            } else {
                System.err.println("El JSON no contiene un array bajo la clave 'objeto' o la clave es nula.");
            }

            con.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return partidas;
    }
}
