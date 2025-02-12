package es.ieslavereda.set;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {

//        Set<Integer> conjunto = new HashSet<>(List.of(1,5,8,3,111,33));
//
//        Set<Integer> conjuntoTree = new TreeSet<>(conjunto);
//
//
//        System.out.println(conjunto);
//        System.out.println(conjuntoTree);

        List<Usuario> usuarios = List.of(
                new Usuario("1234", "Manolo"),
                new Usuario("1111", "Juan"),
                new Usuario("5678", "Pedro"),
                new Usuario("1234", "Manolo"),
                new Usuario("1111", "Juan"),
                new Usuario("5678", "Pedro")
        );

        Set<Usuario> conjunto = new TreeSet<>(usuarios);
        Set<Usuario> conjunto2 = new TreeSet<>(new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return o1.getDni().compareToIgnoreCase(o2.getDni());
            }
        });

        conjunto2.addAll(conjunto);

        System.out.println(conjunto);

        System.out.println("---------------------------------");

        System.out.println(conjunto2);





    }
}
