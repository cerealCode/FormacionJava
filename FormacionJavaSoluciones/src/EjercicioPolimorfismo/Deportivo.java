package EjercicioPolimorfismo;

public class Deportivo extends Turismo {

	// Declaramos sus atributos
	private int cilindrada;
	
	// Constructor vac�o
	public Deportivo() {

	}

	// Constructor de copia
	public Deportivo(Deportivo d) {
		super(d);
		cilindrada = d.cilindrada;
	}
	
	//Constructor de parametros
	public Deportivo(String marca, String modelo, String matricula, int cilindrada) {
		super(marca, modelo, matricula);
		this.cilindrada = cilindrada;
	}

	@Override
	public void mostrarAtributos() {
		String datos = "Datos del deportivo" + 
			 "\n------------------" +
			 "\nMarca: " + super.getMarca() + 
			 "\nModelo: " + super.getModelo() + 
			 "\nMatr�cula: " + super.getMatricula() +
			 "\nCilindrada: " + cilindrada;
		System.out.println(datos);
	}
	
}
