package herencia;

public class Producto {
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(Producto producto) {
        this.nombre = producto.nombre;
        this.precio = producto.precio;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double calcularImporteTotal(double cantidad) {
        return this.precio * cantidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nPrecio: " + precio;
    }
}
