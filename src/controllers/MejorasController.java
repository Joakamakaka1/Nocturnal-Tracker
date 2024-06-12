/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Service.MejorasInterface;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import conexion.ConexionAPI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import model.Mejoras;

/**
 *
 * @author Joakamakaka
 */
public class MejorasController implements MejorasInterface {

    private ConexionAPI url;

    public MejorasController() {
        url = new ConexionAPI();
    }

    @Override
    public Mejoras buscarPorId(Integer id) {
        String ruta = url.ruta() + "/api/v1/mejoras" + id;
        Mejoras mejoras = null;

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
            JsonObject mejorasJson = jsonObject.getAsJsonObject("objeto");

            // Convertir el objeto JSON en un objeto Usuario
            mejoras = gson.fromJson(mejorasJson, Mejoras.class);

            con.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return mejoras;
    }

    @Override
    public ArrayList<Mejoras> listarMejoras() {
        String ruta = url.ruta() + "/api/v1/mejoras";
        ArrayList<Mejoras> mejoras = new ArrayList<>();

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
                JsonObject mejorasJson = objetoArray.get(i).getAsJsonObject();
                Mejoras mj = gson.fromJson(mejorasJson, Mejoras.class);
                mejoras.add(mj);
            }

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mejoras;
    }

}
