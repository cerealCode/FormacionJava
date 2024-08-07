package EjercicioColecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ClasesObjetos.Persona;

public class listadoPersonas {
    public static void main(String[] args) {
        Persona alex = new Persona("Alex", "Muñoz", "Velasco", "87635354L", 33);
        Persona juan = new Persona("Juan", "Pere", "Zamora", "5489975K", 89);
        Persona paco = new Persona("Paco", "Mio", "Nuñez", "65467897P", 39);
        Persona juana = new Persona("Juana", "Fer","Velasco", "65465431213J", 53);

        List<Persona> listadoPersonas = new ArrayList<Persona>();
        listadoPersonas.add(alex);
        listadoPersonas.add(juan);
        listadoPersonas.add(paco);
        listadoPersonas.add(juana);

        for (Persona persona : listadoPersonas){
        System.out.println(persona);
        System.out.println();
        }

        Collections.sort(listadoPersonas);

        for (Persona persona : listadoPersonas){
            System.out.println(persona);
        }
    
    }

    
}
