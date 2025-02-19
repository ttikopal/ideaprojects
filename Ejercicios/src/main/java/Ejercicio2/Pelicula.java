package Ejercicio2;

public class Pelicula extends Multimedia{

    private String actor;
    private String actriz;


    public Pelicula(String titulo, String autor, Formato formato, float duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);

        if (actor != null || actriz != null){
            this.actriz = actriz;
            this.actor = actor;
        }

    }
    public Pelicula(String titulo, String autor, Formato formato, float duracion) {
        super(titulo, autor, formato, duracion);
        actor = "Animación";
        actriz = "Animación";
    }

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    @Override
    public String toString() {
        return super.toString() + "\nActor: " + getActor() +
                "\nActriz: " + getActriz();
    }
}
