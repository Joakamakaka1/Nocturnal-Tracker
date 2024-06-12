/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Service.NivelesInterface;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import conexion.ConexionAPI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import model.Niveles;
/**
 *
 * @author Joakamakaka
 */
public class NivelesController implements NivelesInterface {

    private ConexionAPI url;
    
    public NivelesController(){
        url = new ConexionAPI();
    }
    
    @Override
    public Niveles buscarPorId(Integer id) {
        String ruta = url.ruta() + "/api/v1/niveles" + id;
        Niveles niveles = null;

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
            JsonObject nivelesJson = jsonObject.getAsJsonObject("objeto");

            // Convertir el objeto JSON en un objeto Usuario
            niveles = gson.fromJson(nivelesJson, Niveles.class);

            con.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return niveles;
    }

    @Override
    public ArrayList<Niveles> listarNiveles() {
        
        String ruta = url.ruta() + "/api/v1/niveles";
        ArrayList<Niveles> niveles = new ArrayList<>();

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
                JsonObject nivelesJson = objetoArray.get(i).getAsJsonObject();
                Niveles nv = gson.fromJson(nivelesJson, Niveles.class);
               niveles.add(nv);
            }

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return niveles;
    }
    
}
