package EjerciciosHerencia;

public class Perecedero extends Producto {

	// Atributo
	private int diasACaducar;

	// Constructor vacio
	public Perecedero() {

	}

	// Constructor de copia
	public Perecedero(Perecedero p) {
		super(p);
		diasACaducar = p.diasACaducar;
	}

	//Constructor de parametros
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	//Getters & setters
	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Perecedero [diasACaducar=" + diasACaducar + "]";
	}
	
	/**
	 * Metodo que calcula el importe total de un n�mero de productos que le pasemos, es decir, 
	 * multiplicar el precio del producto por la cantidad de productos pasados. 
	 * Adem�s, aplicar� el descuento correspondiente seg�n los dias a caducar.
	 * o	Si le queda 1 d�a para caducar, se reducir� un 50% el precio final
	 * o	Si le quedan 2 d�as para caducar, se reducir� un 25% el precio final.
	 * o	Si le quedan m�s de 2 d�as para caducar, se reducir� un 10% el precio final
	 * 
	 * @param cantidad - cantidad de productos
	 * @return importe total para ese numero de productos
	 */
	@Override
	public double calcularImporteTotal(int cantidad) {
		double importe = 0;
		
		importe = super.getPrecio() * cantidad;
		
		if (diasACaducar == 1) {
			importe = importe - (importe * 0.50); 
		} else if (diasACaducar == 2) {
			importe = importe - (importe * 0.25);
		} else if (diasACaducar > 2) {
			importe = importe - (importe * 0.10);
		}
		
		return importe;
	}
}
