package practicasjava;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero?");
        int  numero = teclado.nextInt();
        boolean esDivisible = numero % 2 == 0? true : false; 
        // Print the result
        if (esDivisible) {
            System.out.println("El número " + numero + " es divisible entre 2.");
        } else {
            System.out.println("El número " + numero + " no es divisible entre 2.");
        }

        teclado.close();

    }

    
}
