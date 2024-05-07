package com.aluracursos.conversormoneda.calculos;

public class MonedasPaises {
    //tributos
    public int opcionConversion;
    public double valor;
    String monedaDe;
    String monedaA;

    //Metodo para el menu de opciones
    public String convertir(){
        switch (opcionConversion){
            case 1:
                System.out.println("USD/ARS");
                break;
            case 2:
                System.out.println("ARS/USD");
                break;
            case 3:
                System.out.println("USD/BRL");
                break;
            case 4:
                System.out.println("BRL/USD");
                break;
            case 5:
                System.out.println("USD/COP");
                break;
            case 6:
                System.out.println("COP/USD");
                break;
            case 0:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opción invalida");
        }
        return null;
    }
}
