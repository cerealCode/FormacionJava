package EjercicioPolimorfismo;

public class Furgoneta extends Turismo {
	// Declaramos sus atributos
	private int carga;
	
	// Constructor vac�o
	public Furgoneta() {

	}

	// Constructor de copia
	public Furgoneta(Furgoneta f) {
		super(f);
		carga = f.carga;
	}
	
	//Constructor de parametros
	public Furgoneta(String marca, String modelo, String matricula, int carga) {
		super(marca, modelo, matricula);
		this.carga = carga;
	}

	@Override
	public void mostrarAtributos() {
		String datos = "Datos de la furgoneta" + 
			 "\n------------------" +
			 "\nMarca: " + super.getMarca() + 
			 "\nModelo: " + super.getModelo() + 
			 "\nMatr�cula: " + super.getMatricula() +
			 "\nCarga: " + carga;
		System.out.println(datos);
	}
	
}
