package Ejercicio2;

public abstract class Multimedia {

    private String titulo;
    private String autor;
    private Formato formato;
    private float duracion;


    public Multimedia(String titulo, String autor, Formato formato, float duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public enum Formato{
        WAV,MP3,MIDI,AVI,MOV,MPG,CDAUDIO,DVD;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public float getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Formato: " + getFormato() +
                "\nTitulo: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nDuracion: " + getDuracion();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Multimedia m = (Multimedia) obj;
        return getAutor().equals(m.getAutor()) && getTitulo().equals(m.getTitulo());
    }
}
