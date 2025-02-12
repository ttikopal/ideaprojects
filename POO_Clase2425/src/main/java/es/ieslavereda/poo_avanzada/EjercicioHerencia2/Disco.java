package es.ieslavereda.poo_avanzada.EjercicioHerencia2;

public class Disco extends Multimedia{

    private String genero;

    public Disco(String titulo, String autor, Formato formato, int duracion, String genero){
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Género: " + genero;
    }
}
