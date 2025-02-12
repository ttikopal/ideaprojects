package es.ieslavereda.poo_avanzada.EjercicioHerencia4;


public class Main {
    public static void main(String[] args) {

        Coche c1 = new Coche(150, "Diesel", 5, "7384DJN");

        System.out.println(c1);
        System.out.println("------------------------------");
        c1.incrementarVel(20);

        System.out.println(c1);

        System.out.println("\n******************************\n");

        Bicicleta b1 = new Bicicleta(15, "Mountain bike");
        System.out.println(b1);
        System.out.println("------------------------------");

        b1.incrementarVel(4);
        System.out.println(b1);


    }
}
