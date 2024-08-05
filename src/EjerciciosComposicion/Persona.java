package EjerciciosComposicion;

public class Persona {
    private String nombreCompleto;
    private String nif;
    private String direccion;

    // Constructor con parámetros
    public Persona(String nombreCompleto, String nif, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.nif = nif;
        this.direccion = direccion;
    }

    // Constructor vacío
    public Persona() {
    }
 
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }    

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona [nombreCompleto=" + nombreCompleto + ", nif=" + nif + ", direccion=" + direccion + "]";
    }
}
