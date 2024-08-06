package EjerciciosComposicion;

public class Turismo extends Vehiculo {
    
    // Empty Constructor
    public Turismo() {
        super();
    }

    // Copy Constructor
    public Turismo(Turismo other) {
        super(other.getMatricula(), other.getMarca(), other.getModelo());
    }

    // Parameterized Constructor
    public Turismo(String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
    }
}
