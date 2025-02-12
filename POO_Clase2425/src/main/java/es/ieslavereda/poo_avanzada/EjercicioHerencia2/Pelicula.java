package es.ieslavereda.poo_avanzada.EjercicioHerencia2;

public class Pelicula extends Multimedia{

    private String actor;
    private String actriz;

    public Pelicula(String titulo, String autor, Formato formato, int duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);

        if(actor == null && actriz == null){
            this.actor = "ANIMACION";
            this.actriz = "ANIMACION";
        }else{
            this.actor = actor;
            this.actriz = actriz;
        }
    }

    public String getActor(){
        return actor;
    }

    public String getActriz(){
        return actriz;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                super.toString() +
                "actor= " + actor +
                "actriz= " + actriz;
    }
}

