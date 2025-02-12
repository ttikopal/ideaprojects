package es.ieslavereda.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {

        List<Usuario> usuarios = List.of(
                new Usuario("1234", "Manolo"),
                new Usuario("1111", "Juan"),
                new Usuario("5678", "Pedro")
        );


        Set<Usuario> conjunto = new HashSet<>(usuarios);

        System.out.println(new Usuario("1234", "Manolo").hashCode());
        System.out.println(usuarios.get(0).hashCode());

        System.out.println(usuarios.contains(new Usuario("1234", "Manolo")));

    }
}
