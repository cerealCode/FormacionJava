package EjerciciosComposicion;

public class Cuenta extends Persona {
    private Persona titularCta;
    private String numeroCta;
    private double saldoCta;

    public Cuenta(String nombreCompleto, String nif, String direccion, Persona titularCta, String numeroCta,
            double saldoCta) {
        super(nombreCompleto, nif, direccion);
        this.titularCta = titularCta;
        this.numeroCta = numeroCta;
        this.saldoCta = saldoCta;
    }

    public Cuenta(){

    }

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

    public boolean ingreso(double cantidad) {
        if (cantidad > 0) {
            saldoCta += cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean reintegro(double cantidad) {
        if (cantidad <= saldoCta) {
            saldoCta -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    // public void transferencia(Cuenta ctaDestino, double cantidad){
    //      Cuenta.saldoCta += cantidad;
    // }


    @Override
    public String toString() {
        return "Cuenta [titularCta=" + titularCta + ", numeroCta=" + numeroCta + ", saldoCta=" + saldoCta + "]";
    }
}
