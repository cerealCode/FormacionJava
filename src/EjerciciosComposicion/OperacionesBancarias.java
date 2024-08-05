package EjerciciosComposicion;

public class OperacionesBancarias {
    public static void main(String[] args) {
        // Crear instancias de Persona
        Persona pFederico = new Persona("Federico Garcia", "11.111.111-H", "Calle Nueva, 5");
        Persona pAlfonso = new Persona("Alfonso de la Calle", "22.222.222-G", "Calle Real, 5");

        // Crear instancias de Cuenta
        Cuenta cta1 = new Cuenta("Federico Garcia", "11.111.111-H", "Calle Nueva, 5", pFederico, "01012020030340400505",
                2890.00);
        Cuenta cta2 = new Cuenta("Alfonso de la Calle", "22.222.222-G", "Calle Real, 5", pAlfonso,
                "11112222333344445555", 90.00);

        if (cta2.ingreso(100.00)) {
            System.out.println("Ingreso realizado correctamente");
            System.out.println(cta2); // Muestra la información de la cuenta
        } else {
            System.out.println("No se ha podido realizar la operación");
        }

        if (cta2.ingreso(100.00)) {
            System.out.println("Ingreso realizado correctamente");
            System.out.println(cta2);
        } else {
            System.out.println("No se ha podido realizar la operación");
        }

    }
}
