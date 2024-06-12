/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Service.EnemigosInterface;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import conexion.ConexionAPI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import model.Enemigos;

/**
 *
 * @author Joakamakaka
 */
public class EnemigosController implements EnemigosInterface{
    
    private ConexionAPI url;

    public EnemigosController() {
        url = new ConexionAPI();
    }
    
    
    @Override
    public Enemigos buscarPorId(Integer id) {
         String ruta = url.ruta() + "/api/v1/enemigos" + id;
         Enemigos enemigos = null;

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
            JsonObject enemigosJson = jsonObject.getAsJsonObject("objeto");

            // Convertir el objeto JSON en un objeto Usuario
            enemigos = gson.fromJson(enemigosJson, Enemigos.class);

            con.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return enemigos;
    }

    @Override
    public ArrayList<Enemigos> listarEnemigos() {
       
        String ruta = url.ruta() + "/api/v1/enemigos";
        ArrayList<Enemigos> enemigos = new ArrayList<>();

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
                JsonObject enemigosJson = objetoArray.get(i).getAsJsonObject();
                Enemigos en = gson.fromJson(enemigosJson, Enemigos.class);
                enemigos.add(en);
            }
            
            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return enemigos; 
    }
    
    
}
