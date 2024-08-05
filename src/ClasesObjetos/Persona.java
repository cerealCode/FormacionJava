package ClasesObjetos;

public class Persona {
    // Atributos
    public String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String primerApellido;
    

    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String segundoApellido;
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String dni;
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public int edad;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //Constructor vacio
    public Persona(){

    }
    public Persona (Persona p){

        this.nombre = p.nombre;
        this.primerApellido = p.primerApellido;
        this.segundoApellido = p.segundoApellido;
        this.dni = p.dni;
        this.edad = p.edad;


    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", primerApellido=" + primerApellido +
                ", segundoApellido=" + segundoApellido + ", dni=" + dni + ", edad=" + edad + "]";
    }
}

    
