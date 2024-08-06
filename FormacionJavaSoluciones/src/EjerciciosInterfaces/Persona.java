package EjerciciosInterfaces;

public class Persona implements Comportamientos {
	
	//Atributos
	private String nombre;
	private String genero;

	//Getters & setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public void respirar() {
		System.out.println(nombre + " est� respirando");
	}

	@Override
	public void dormir() {
		System.out.println(nombre + " est� durmiendo en la cama");
	}

	@Override
	public void comer() {
		System.out.println(nombre + "est� comiendo en la mesa");
	}

}
