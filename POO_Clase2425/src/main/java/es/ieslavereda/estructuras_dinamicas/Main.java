package es.ieslavereda.estructuras_dinamicas;

public class Main {
    public static void main(String[] args) {
        ListaSE lista = new ListaSE();

        lista.addHead(3);
        lista.addHead(4);
        lista.addHead(8);
        lista.addHead(10);
        lista.addHead(15);


        lista.addTail(0);
        lista.addTail(20);

        System.out.println(lista);

        System.out.println(lista.contains(20));

    }

}
