package com.aluracursos.conversormoneda.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
         /*String direccion = "";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        String json = response.body();
        System.out.println(json);*/

        int entradaUsuario;
        String opcion;
        Scanner lectura = new Scanner(System.in);
        while (true) {
            System.out.println("""
                     \nCONVERSOR DE MONEDAS:
                     
                     Ingrese el numero de la opcion que desea realizar:
                     1) Dolar a peso Argentino
                     2) Peso Argentino a Dolar
                     3) Dolar a Real Brasileño
                     4) Real Brasileño a dolar
                     5) Dolar a peso Colombiano
                     6) Peso Colombiano a Dolar
                     0) Salir.
                     Ingrese el numero: 
                    """);
            opcion = lectura.nextLine();
        }
    }
}
