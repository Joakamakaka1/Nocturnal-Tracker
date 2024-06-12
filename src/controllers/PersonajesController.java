/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Service.PersonajesInterface;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import conexion.ConexionAPI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import model.Personajes;

/**
 *
 * @author Joakamakaka
 */
public class PersonajesController implements PersonajesInterface {

    private ConexionAPI url;

    public PersonajesController() {
        url = new ConexionAPI();
    }

    @Override
    public Personajes buscarPorId(Integer id) {
        String ruta = url.ruta() + "/api/v1/personajes" + id;
        Personajes personajes = null;

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

            // Parsear el JSON como un objeto Usuario
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(response.toString(), JsonObject.class);

            // Obtener el objeto "objeto"
            JsonObject personajesJson = jsonObject.getAsJsonObject("objeto");

            // Convertir el objeto JSON en un objeto Usuario
            personajes = gson.fromJson(personajesJson, Personajes.class);

            con.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return personajes;
    }

    @Override
    public ArrayList<Personajes> listarPersonajes() {

        String ruta = url.ruta() + "/api/v1/personajes";
        ArrayList<Personajes> personajes = new ArrayList<>();

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
                JsonObject personajesJson = objetoArray.get(i).getAsJsonObject();
                Personajes pj = gson.fromJson(personajesJson, Personajes.class);
                personajes.add(pj);
            }

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return personajes;
    }
}


