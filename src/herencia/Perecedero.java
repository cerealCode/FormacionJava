package herencia;

public class Perecedero extends Producto {
    private int diasACaducar;

    public Perecedero() {
        super();
    }

    public Perecedero(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    public Perecedero(Producto producto, int diasACaducar) {
        super(producto);
        this.diasACaducar = diasACaducar;
    }

    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    @Override
    public double calcularImporteTotal(double cantidad) {
        double precioConDescuento = getPrecioConDescuento();
        return precioConDescuento * cantidad; 
    }

    private double getPrecioConDescuento() {
        double precioConDescuento = super.getPrecio();
        if (diasACaducar == 1) {
            precioConDescuento *= 0.50;
        } else if (diasACaducar == 2) {
            precioConDescuento *= 0.75;
        } else if (diasACaducar > 2) {
            precioConDescuento *= 0.90;
        }
        return precioConDescuento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDías a caducar: " + diasACaducar;
    }
}
