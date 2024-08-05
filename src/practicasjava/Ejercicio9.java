package practicasjava;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer num;

        System.out.println("Numero?");
        num = teclado.nextInt();

        // Call the calcular method and print the result
        int digitCount = calcular(num);
        System.out.println("The number has " + digitCount + " digits.");

        teclado.close();
    }

    // Method to calculate the number of digits
    public static int calcular(Integer num) {
        char[] digits = num.toString().toCharArray();
        return digits.length;
    }
}
