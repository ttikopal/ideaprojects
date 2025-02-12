package es.ieslavereda.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {

        List<Usuario> usuarios = new ArrayList<>(List.of(
                new Usuario("1234", "Manolo"),
                new Usuario("1111", "Juan"),
                new Usuario("5678", "Pedro"),
                new Usuario("1234", "Manolo"),
                new Usuario("1111", "Juan"),
                new Usuario("5678", "Pedro")
        ));
        Usuario u;
        Iterator<Usuario> iterator = usuarios.iterator();
        while (iterator.hasNext()){
            u = iterator.next();
            if (u.getNombre().startsWith("M"))
                iterator.remove();
        }
        System.out.println(usuarios);





    }
}
