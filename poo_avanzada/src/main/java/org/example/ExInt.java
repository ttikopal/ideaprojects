package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class ExInt {
    public static void main(String[] args) {


        Persona[] personas = new Persona[]{
                new Persona("Juan","Lopez"),
                new Persona("Asdqwe","Asdasdasd"),
                new Persona("aaaaaaa","Bsdadqw"),
                new Persona("wer4","Cdfwe"),
                new Persona("sdfwe","Dsdver"),
        };

        Arrays.sort(personas,new CustomClass());

        System.out.println(Arrays.toString(personas));


    }

    public static class CustomClass implements Comparator<Persona> {

        @Override
        public int compare(Persona o1, Persona o2) {
            return o1.getApellidos().compareTo(o2.getApellidos());
        }
    }
}
