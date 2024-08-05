package herencia;

public class Tienda {
    public static void main(String[] args) {
        Producto[] productos = new Producto[5];

        Perecedero yogurt = new Perecedero("Yogurt", 0.50, 1);
        productos[0] = yogurt;

        Perecedero leche = new Perecedero("Leche", 1.20, 2);
        productos[1] = leche;

        Perecedero queso = new Perecedero("Queso", 5.70, 25);
        productos[2] = queso;

        NoPerecedero esponja = new NoPerecedero("Esponja", 0.90, "Limpieza & hogar");
        productos[3] = esponja;

        NoPerecedero jabon = new NoPerecedero("Jabón", 1.90, "Limpieza & hogar");
        productos[4] = jabon;

        double precioTotal = 0;
        for (Producto producto : productos) {
            double precioCalculado = producto.calcularImporteTotal(2);
            System.out.println("Producto:\n" + producto);
            System.out.println("Precio Total: " + precioCalculado + "\n");
            precioTotal += precioCalculado;
        }

        System.out.println("Precio total de todos los productos: " + precioTotal);
    }
}
