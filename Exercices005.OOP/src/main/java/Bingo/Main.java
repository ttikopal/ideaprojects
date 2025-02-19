package Bingo;


import javax.print.attribute.Attribute;

import static Bingo.Color.*;

public class Main {
    public static void main(String[] args) {

        int tamano;

        do {
            tamano = entrada.getInt("Introduce cuántas bolas quieres: ");
        } while (tamano < 50);
        Bombo b = new Bombo(VERDE,tamano);
        Carton c = new Carton(tamano,b);
        Carton m1 = new Carton(tamano,b);
        Carton c2 = new Carton(tamano,b);
        Carton m2 = new Carton(tamano,b);

        Jugador jose = new Jugador("Jose",c);
        Jugador maria = new Jugador("Maria",m1);
        Jugador juanito = new Jugador("Juanito",c2);
        Jugador manuela = new Jugador("Manuela",m2);




        Game g1 = new Game(b,jose,maria,juanito,manuela);

        g1.start();


        while (b.quedanBolas()) {
            int bola = b.getBola().getNumero();
            b.sacarBola();
            c.marcarNumero(bola);
            m1.marcarNumero(bola);
            c2.marcarNumero(bola);
            m2.marcarNumero(bola);
            System.out.println(b);
            System.out.println("El carton de " + jose.getNombre() + ": " + c);
            System.out.println("El carton de " + maria.getNombre() + ": " + m1);
            System.out.println("El carton de " + juanito.getNombre() + ": " + c2);
            System.out.println("El carton de " + manuela.getNombre() + ": " + m2);
            
        }
        }
}
