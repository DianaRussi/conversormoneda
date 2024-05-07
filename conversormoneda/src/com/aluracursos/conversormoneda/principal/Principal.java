package com.aluracursos.conversormoneda.principal;

import com.aluracursos.conversormoneda.calculos.MonedasPaises;
import com.aluracursos.conversormoneda.consultas.Conversion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
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
            Conversion conversion = new Conversion();
            MonedasPaises moneda = new MonedasPaises();
        }
    }
}
