package es.ieslavereda.map;

import es.ieslavereda.set.Usuario;

import java.util.*;

public class Main {
    public static void main(String[] args) {


//        Map<String,Integer> almacen = new HashMap<>();
//
//        almacen.put("Tornillos",27);
//        almacen.put("Arandelas",100);
//        almacen.put("Tuercas",66);
//        almacen.put("Calvos",0);


        //      K       V
        Map<Vendedor,Usuario> relacion = new TreeMap<>();



        relacion.put(new Vendedor("Juan"), new Usuario("1234567","alejandro"));
        relacion.put(new Vendedor("Juanjo"), new Usuario("123456","asier"));
        relacion.put(new Vendedor("JuanAlberto"), new Usuario("12345","ariel"));
        relacion.put(new Vendedor("JuanAbel"), new Usuario("1234","almendra"));
        relacion.put(new Vendedor("JuanDrea"), new Usuario("123","asterisco"));

        for (Vendedor v : relacion.keySet())
            System.out.println(v.getNombre() + " -> " + relacion.get(v).getDni());


    }
}
