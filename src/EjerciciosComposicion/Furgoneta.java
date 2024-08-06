package EjerciciosComposicion;

public class Furgoneta extends Vehiculo {
    private Integer carga;

    public Furgoneta(String marca, String modelo, String matricula, Integer carga) {
        super(marca, modelo, matricula);
        this.carga = carga;
    }

    public Furgoneta(Integer carga) {
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Furgoneta [carga=" + carga + "]";
    }

   
    

}
