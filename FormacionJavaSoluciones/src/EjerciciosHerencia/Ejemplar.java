package EjerciciosHerencia;

public class Ejemplar {

	//Atributos
	private String titulo;
	private String genero;
	private boolean disponible;
	
	//Constructor vacio
	public Ejemplar() {
		
	}

	//Constructor de copia
	public Ejemplar(Ejemplar e) {
		this.titulo = e.titulo;
		this.genero = e.genero;
		this.disponible = e.disponible;
	}
	
	//Constructor de parametros
	public Ejemplar(String titulo, String genero, boolean disponible) {
		this.titulo = titulo;
		this.genero = genero;
		this.disponible = disponible;
	}

	//Getters & setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Datos del alquiler" + 
			"\n ------------------" + 
			"\n Titulo" + titulo + 
			"\n Genero=" + genero;
	}

	
	/**
	 * Consiste en entregar una serie o pel�cula, es decir, s�lo debe modificar el atributo disponible 
	 * con el valor false y mostrar un mensaje si se ha podido realizar la operaci�n o no, 
	 * teniendo en cuenta que no se podr�n alquilar series o pel�culas que no est�n disponibles. 
	 *
	 */
	public void entregar() {
		
		if (disponible) {
			disponible = false;
			System.out.println("Se ha prestado " + titulo);
		} else {
			System.out.println("No est� disponible " + titulo + " para prestar");
		}
	}
	
	/**
	 * Consiste en devolver una serie o pel�cula, es decir, s�lo debe modificare el atributo disponible 
	 * con el valor true y mostrar un mensaje si se ha podido realizar la operaci�n o no,   
	 * teniendo en cuenta que no se podr�n devolver series o pel�culas que no est�n alquiladas. 
	 * 
	 */
	public void devolver() {
		if (!disponible) {
			disponible = true;
			System.out.println("Se ha devuelto " + titulo);
		} else {
			System.out.println("No estaba alquilada " + titulo + " para devolver");
		}
	}

}
