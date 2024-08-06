package EjerciciosClasesAbstractas;

public class Calculo {

	// Constante
	public static final double LONG_LADO_CUADRADO = 2.0;
	
	
	public static void main(String[] args) {
		
		//Creamos la instancia de tipo Cuadrado.
		Cuadrado cuadrado = new Cuadrado();

		//Asignamos valor al atributo lado haciendo uso de la constante anterior.
		cuadrado.setLado(LONG_LADO_CUADRADO);

		//Calculamos el �rea del cuadrado y lo mostramos por consola.
		System.out.println("El area del cuadrado es " + cuadrado.calcularArea());
		
		//Por �ltimo, calculamos el per�metro del cuadrado y lo mostramos por consola.
		System.out.println("El perimetro del cuadrado es " + cuadrado.calcularPerimetro());

	}

}
