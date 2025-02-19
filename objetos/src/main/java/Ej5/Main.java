package Ej5;

public class Main {
    public static void main(String[] args) {

        Pistola p = new Pistola();

        p.girarTambor();
        p.recargar(new Bala());
        p.disparar();
        System.out.println(p);


    }
}
