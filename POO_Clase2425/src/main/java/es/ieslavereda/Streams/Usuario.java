package es.ieslavereda.Streams;

public class Usuario {

    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String   toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
