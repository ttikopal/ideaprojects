package es.ieslavereda.EjercicioHerencia5ConListas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Coche c = new Coche("1234fvz", "Citroen", "C3");
//        String[] clientes = new String[0];
//        Secretario Manuel = null;
//        JefeZona Carlos = null;
//        JefeZona Antonio = new JefeZona("Antonio", "Pastor", "12435681Z", "sdfadsf", 456789123, 4531.05f, Carlos, "asdkfasdf", Manuel);
//        JefeZona Manolo = new JefeZona("Manolo", "Gómez", "98765432J", "sdfadsf", 456789123, 4531.05f, Antonio, "asdkfasdf", Manuel);
//        Vendedor v1 = new Vendedor("Maria", "Anez", "12345678A", "sfasdasdf", 694154326, 1300.15f, Manolo, c, 123456789, "asdfasdfasd", clientes, 123);
//        Vendedor v2 = new Vendedor("Juan", "Lopez", "35415564J", "sfasdasdf", 694154326, 1300.15f, Manolo, c, 123456789, "asdfasdfasd", clientes, 123);
//        Vendedor v3 = new Vendedor("Mario", "Martinez", "73246981M", "sfasdasdf", 694154326, 1300.15f, Manolo, c, 123456789, "asdfasdfasd", clientes, 123);
//        Vendedor v4 = new Vendedor("Sandra", "Sanchez", "34548176C", "sfasdasdf", 694154326, 1300.15f, Manolo, c, 123456789, "asdfasdfasd", clientes, 123);
//        Vendedor v5 = new Vendedor("Pepe", "Faubel", "76413248N", "sfasdasdf", 694154326, 1300.15f, Manolo, c, 123456789, "asdfasdfasd", clientes, 123);
//        Vendedor v6 = new Vendedor("Tomás", "Navarro", "98134560X", "sfasdasdf", 694154326, 1300.15f, Manolo, c, 123456789, "asdfasdfasd", clientes, 123);
//        Vendedor v7 = new Vendedor("Andrea", "Diaz", "15643560B", "sfasdasdf", 694154326, 1300.15f, Manolo, c, 123456789, "asdfasdfasd", clientes, 123);
//
//
//        Vendedor pruebas = new Vendedor("Carlos", "Lopez", "35415564J", "sfasdasdf", 694154326, 1300.15f, Manolo, c, 123456789, "asdfasdfasd", clientes, 123);
//
//        ListaVendedores listaV = new ListaVendedores();
//        listaV.addHeadVendedor(v1);
//        listaV.addHeadVendedor(v2);
//        listaV.addHeadVendedor(v3);
//        listaV.addHeadVendedor(v4);
//        listaV.addHeadVendedor(v5);
//
//        System.out.println(listaV);
//
//        System.out.println();
//
//        System.out.println(listaV.contains(pruebas));
//
//        System.out.println(v1.calcularIRPF());
//        System.out.println(v1.calcularContComunes());
//        System.out.println(v1.salario);
//        v1.mostrarEtiquetaID();


        List<String> lista = new ArrayList<>();

        lista.add("Coche");
        lista.add("Moto");
        lista.add("Arbol");
        lista.add("Coche");
        lista.add("Moto");

        lista.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(lista);

    }
}
