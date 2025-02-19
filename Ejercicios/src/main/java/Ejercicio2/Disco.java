package Ejercicio2;

public class Disco extends Multimedia{

    public Genero genero;


    public Disco(String titulo, String autor, Formato formato, float duracion, Genero genero) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public enum Genero{
        ROCK,POP,OPERA,TRAP,RAP,KPOP;
    }

    public Genero getGenero(){
        return genero;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenero: " + getGenero();
    }
}
