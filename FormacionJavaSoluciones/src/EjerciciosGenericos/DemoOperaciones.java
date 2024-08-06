package EjerciciosGenericos;

public class DemoOperaciones {

	public static void main(String[] args) {
		// Creamos la instancia pasando de tipo Integer
		Operaciones<Integer> iOb = new Operaciones<Integer>();
		System.out.println("La suma es: " + iOb.suma(5));
		System.out.println("La resta es: " + iOb.resta(5));
		System.out.println("La multiplicaci�n es: " + iOb.producto(5));
		System.out.println("La divisi�n es: " + iOb.division(5));
		System.out.println();

		// Creamos la instancia pasando de tipo Double
		Operaciones<Double> dOb = new Operaciones<Double>();
		System.out.println("El suma es: " + dOb.suma(12.34));
		System.out.println("La resta es: " + dOb.resta(12.34));
		System.out.println("La multiplicaci�n es: " + dOb.producto(12.34));
		System.out.println("La divisi�n es: " + dOb.division(12.34));

	}

}
