package EjerciciosComposicion;

public class Cuenta {

	// Atributos
	private Persona titularCta;
	private String numeroCta;
	private double saldoCta;

	// Getters & setters
	public Persona getTitularCta() {
		return titularCta;
	}

	public void setTitularCta(Persona titularCta) {
		this.titularCta = titularCta;
	}

	public String getNumeroCta() {
		return numeroCta;
	}

	public void setNumeroCta(String numeroCta) {
		this.numeroCta = numeroCta;
	}

	public double getSaldoCta() {
		return saldoCta;
	}

	public void setSaldoCta(double saldoCta) {
		this.saldoCta = saldoCta;
	}

	@Override
	public String toString() {
		return "Datos de la cuenta" + "\n-------------------------" + "\nDatos del titular" + titularCta
				+ "\nN�mero de cuenta: " + numeroCta + "\nSaldo: " + saldoCta;
	}

	// M�todos de la clase
	/**
	 * Este m�todo consiste en aumentar el saldo de la cuenta con la cantidad que se
	 * pase. Debemos comprobar que la cantidad no puede ser negativa, si la cantidad
	 * introducida es negativa, no se har� nada. Este m�todo recibe un par�metro de
	 * entrada con la cantidad a ingresar y retorna true si se ha realizado la
	 * operaci�n o false si no se ha realizado.
	 * 
	 * @param cantidad - cantidad a incrementar en el atributo del saldo de la
	 *                 cuenta
	 * @return true o false - true si se ha podido realizar la operacion, y false en
	 *         caso contrario
	 */
	public boolean ingreso(double cantidad) {
		boolean realizado = false;

		if (cantidad > 0) {
			this.saldoCta += cantidad; // Esto es lo mismo que poner this.saldoCta = this.saldoCta + cantidad
			realizado = true;
		}

		return realizado;
	}

	/**
	 * Este m�todo consiste en retirar una cantidad a la cuenta, es decir, debemos
	 * disminuir el saldo de la cuenta. Debemos comprobar que la cantidad no sea
	 * negativa y adem�s que hay saldo suficiente para hacer el reintegro, si la
	 * cantidad es negativa o si no hay saldo suficiente, no se har� nada. Este
	 * m�todo recibe un par�metro de entrada con la cantidad a ingresar y retorna
	 * true si se ha realizado la operaci�n o false si no se ha realizado.
	 * 
	 * @param cantidad - cantidad a descontar en el atributo del saldo de la cuenta
	 * @return true o false - true si se ha podido realizar la operacion, y false en
	 *         caso contrario
	 */
	public boolean reintegro(double cantidad) {
		boolean realizado = false;

		if (cantidad > 0 && this.saldoCta >= cantidad) {
			this.saldoCta -= cantidad; // Esto es lo mismo que poner this.saldoCta = this.saldoCta - cantidad
			realizado = true;
		}

		return realizado;
	}

	/**
	 * Este m�todo nos debe permitir pasar dinero de una cuenta a otra siempre que
	 * en la cuenta de origen haya saldo suficiente. Este m�todo recibe dos
	 * par�metros, uno con una instancia de tipo Cuenta, que ser� la cuenta destino
	 * del importe, y un segundo par�metro con la cantidad a transferir, de tal
	 * forma, que disminuimos el saldo de la cuenta y se lo incrementamos a la otra
	 * cuenta. Debe retorna true si se ha realizado la operaci�n o false si no se ha
	 * realizado.
	 * 
	 * @param ctaDestino - Instancia u objeto de tipo Cuenta donde vamos a ingresar
	 *                   el dinero
	 * @param importe    - cantidad a descontar en el atributo del saldo de la
	 *                   cuenta y a incrementar en el atributo del saldo de la
	 *                   cuenta destino pasada como parametro
	 * @return true o false - true si se ha podido realizar la operacion, y false en
	 *         caso contrario
	 */
	public boolean transferencia(Cuenta ctaDestino, double cantidad) {
		boolean realizado = false;

		// Reutilizamos los m�todos creados anteriormente
		if (this.reintegro(cantidad)) {
			if (ctaDestino.ingreso(cantidad)) {
				realizado = true;
			}
		}

		return realizado;

	}
}
