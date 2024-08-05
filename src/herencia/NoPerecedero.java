package herencia;

public class NoPerecedero extends Producto {
    private String tipo;

    public NoPerecedero() {
        super();
    }

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + tipo;
    }
}
