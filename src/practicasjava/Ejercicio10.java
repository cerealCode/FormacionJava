package practicasjava;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] nums = new int[100]; // Initialize the array with 100 positions
        int suma = 0; // Make sure this line is correctly typed and free of errors
        
        // Fill the array with numbers from 1 to 100 and calculate the sum
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            suma += nums[i];
        }
        
        // Calculate the average
        double media = (double) suma / nums.length;
        
        // Print the results
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
        System.out.println("La media de los números del 1 al 100 es: " + media);
    }
}
