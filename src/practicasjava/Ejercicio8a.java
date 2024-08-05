package practicasjava;

import java.util.Scanner;

public class Ejercicio8a {
    public static void  main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String dia;
        System.out.println("Dia?");
        dia = teclado.nextLine();
        dia.toLowerCase();
        switch (dia) {
            case ("lunes"):
                System.out.println("Laborable");
                break;
            case ("martes"):
                System.out.println("Laborable");
                break;
            case ("miercoles"):
                System.out.println("Laborable");
                break;
            case ("jueves"):
                System.out.println("Laborable");
                break;
            case ("viernes"):
                System.out.println("Laborable");
                break;
            default:
            System.err.println("No laborable");
                break;
        }
        teclado.close();

       
    }

}
