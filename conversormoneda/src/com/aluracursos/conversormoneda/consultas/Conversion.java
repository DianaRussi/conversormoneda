package com.aluracursos.conversormoneda.consultas;
import com.aluracursos.conversormoneda.modelos.Moneda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversion {
    {
        public Moneda convertir(){
            String direccion = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD";
            Gson gson = new GsonBuilder().create();
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                Moneda miMonedaAConvertir = gson.fromJson(json, Moneda.class);
            } catch (Exception e) {
                throw new RuntimeException("No encontre esa conversion.");
            }
        }
    }
}

