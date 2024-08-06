package EjerciciosComposicion;

public class Alquiler {
    private Persona cliente;
    private Vehiculo vehiculo;
    private String fechaAlquiler;

    public Alquiler(Persona cliente, Vehiculo vehiculo, String fechaAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaAlquiler = fechaAlquiler;
    }

    public Alquiler(){

    }

    public Alquiler(Alquiler other){
        this.cliente = other.cliente;
        this.vehiculo = other.vehiculo;
        this.fechaAlquiler = other.fechaAlquiler;

    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void mostrarAlquiler() {
        System.out.println("Persona: " + cliente.toString());
        System.out.println("Vehículo: " + vehiculo.toString());
        System.out.println("Fecha alquiler: " + fechaAlquiler);
    }

    @Override
    public String toString() {
        return "Alquiler [cliente=" + cliente + ", vehiculo=" + vehiculo + ", fechaAlquiler=" + fechaAlquiler + "]";
    }


}
