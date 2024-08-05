package practicasjava;

import java.util.Scanner;

public class Ejercicio7 {
    public static void  main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero;
        do { 
        System.out.println("Numero?");
        numero = teclado.nextInt();
        }while (numero <= 0);
        teclado.close();

       
    }

}
