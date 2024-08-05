package ClasesObjetos;

public class Empresa {
    public static void main(String[] args) {
        //crear instancia Empleado
        Empleado empleado = new Empleado();

        empleado.setNombre("Rebeca");
        empleado.setPrimerApellido("Velasco");
        empleado.setSegundoApellido("Gonzalez");
        empleado.setDni("654654654");
        empleado.setAntiguedad(13);
        empleado.setEdad(12);
        empleado.setSalario(4900);
        System.out.println(empleado.getSalario());
        empleado.actualizarSalario(300);
        System.out.println(empleado.getSalario());




    }
    

}
