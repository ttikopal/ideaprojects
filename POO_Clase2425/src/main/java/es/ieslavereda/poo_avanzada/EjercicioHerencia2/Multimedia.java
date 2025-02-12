package es.ieslavereda.poo_avanzada.EjercicioHerencia2;

public abstract class Multimedia {

        private String titulo;
        private String autor;
        private Formato formato;
        private int duracion;

        public Multimedia(String titulo, String autor, Formato formato, int duracion){
            this.titulo = titulo;
            this.autor = autor;
            this.formato = formato;
            this.duracion = duracion;
        }

        public enum Formato{
            wav, mp3, midi, avi, mov, mpg, cdAudio, dvd;
        }

        public String getTitulo(){

            return titulo;
        }

        public String getAutor(){

            return autor;
        }

        public Formato getFormato(){

            return formato;
        }

        public float getDuracion(){

            return duracion;
        }

    @Override
    public boolean equals(Object obj) {
        if(obj == null ||(obj instanceof Multimedia)) return false;

        Multimedia m = (Multimedia) obj;

        return m.titulo.equalsIgnoreCase(titulo) &&
                autor.equalsIgnoreCase(m.autor);
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Formato: " + formato + "\n" +
                "Duración: " + duracion;
    }

}
