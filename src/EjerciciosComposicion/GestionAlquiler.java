package EjerciciosComposicion;

public class GestionAlquiler {
    public static void main(String[] args) {
        Vehiculo furgoneta = new Furgoneta("Fiat","Ducato","4080 FUR ",1200);
        Vehiculo turismo = new Turismo("Peugeot","307","8917 CFW");
        Persona cliente1 = new Persona("Federico Garcia", "11.111.111-H", "Calle Nueva, 5");
        Persona cliente2 = new Persona("Alfonso de la Calle", "22.222.222-G", "Calle Real, 5");
        Alquiler alquiler1 = new Alquiler(cliente1, turismo, “12/03/2021”);
        Alquiler alquiler2 = new Alquiler(cliente2, furgoneta, “19/05/2021”);
    }

}
