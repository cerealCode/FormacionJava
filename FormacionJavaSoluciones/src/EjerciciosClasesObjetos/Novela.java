package EjerciciosClasesObjetos;

import ClasesObjetos.Persona;

public class Novela {
	
	//Atributos
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;
	
	//Constructor vacio
	public Novela() {
	}

	// Constructor de copia
	public Novela(Novela novelaCopia) {
		this.titulo = novelaCopia.titulo;
		this.autor = novelaCopia.autor;
		this.numEjemplares = novelaCopia.numEjemplares;
		this.numEjemplaresPrestados =novelaCopia.numEjemplaresPrestados;
		
	}

	// Constructor de par�metros
	public Novela(String titulo, String autor, int numEjemplares, int numPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numPrestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	@Override
	public String toString() {
		return "Datos de la novela\n" + 
				"T�tulo: " + titulo + "\nAutor: " +autor + 
				"\nN� de ejemplares: " + numEjemplares + "\nN� de ejemplares prestados: " + numEjemplaresPrestados;
		}

	
	// M�todos de la clase
	/**
	 * Debe incrementar el atributo de ejemplares prestados cada vez que se realice un pr�stamo de la novela. 
	 * No se podr�n prestar novelas de los que no queden ejemplares disponibles para prestar (el atributo numEjemplaresPrestados sea igual al atributo numEjemplares). 
	 * Este m�todo no recibe ning�n par�metro de entrada, pero retorna true si se ha realizado la operaci�n o false si no se ha realizado.
	 * 
	 * @return true o false - true si se ha podido realizar la operacion, y false en caso contrario
	 */
	public boolean prestamo() {
		boolean realizado = false;

		if (numEjemplares > numEjemplaresPrestados) {
			numEjemplaresPrestados++; // Esto es lo mismo que poner numEjemplaresPrestados = numEjemplaresPrestados + 1
			realizado = true;
		}
		
		return realizado;
	}

	/**
	 * Consiste en decrementar el atributo correspondiente cuando se produzca la devoluci�n de una novela. 
	 * No se podr�n devolver novelas que no se hayan prestado (el atributo numEjemplaresPrestados sea 0). 
	 * Este m�todo no recibe ning�n par�metro de entrada, pero retorna true si se ha realizado la operaci�n o false si no se ha realizado.
	 * 
	 * @return true o false - true si se ha podido realizar la operacion, y false en caso contrario
	 */
	public boolean devolucion() {
		boolean realizado = false;

		if (numEjemplaresPrestados > 0) {
			numEjemplaresPrestados--; // Esto es lo mismo que poner numEjemplaresPrestados = numEjemplaresPrestados - 1
			realizado = true;
		}

		return realizado;
	}

	
	

}
