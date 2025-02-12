package es.ieslavereda.poo_avanzada.Pruebas;

import java.util.Arrays;
import java.util.Comparator;

public class EjemploInterfaz {
    public static void main(String[] args) {
        Persona[] personas = new Persona[]{
                new Persona("Juan", "Garcia Lopez"),
                new Persona("Juan", "Jimenez Sánchez"),
                new Persona("Juan", "Garcia Martinez"),
                new Persona("Juan", "Ruiz Sanz")
        };

        Arrays.sort(personas, new CustomClass());

        System.out.println(Arrays.toString(personas));

    }

    public static class CustomClass implements Comparator<Persona> {

        @Override
        public int compare(Persona o1, Persona o2) {
            return o1.getApellidos().compareToIgnoreCase(o2.getApellidos());
        }
    }



}
