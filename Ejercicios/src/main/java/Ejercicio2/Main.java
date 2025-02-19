package Ejercicio2;

public class Main {
    public static void main(String[] args) {


        Disco d = new Disco("Hola ola","Garcia asud", Multimedia.Formato.CDAUDIO,4234.34534f, Disco.Genero.OPERA);

        Pelicula p = new Pelicula("Hola","SISI", Multimedia.Formato.DVD,4059);

        System.out.println(p);

        System.out.println(d);
    }
}
