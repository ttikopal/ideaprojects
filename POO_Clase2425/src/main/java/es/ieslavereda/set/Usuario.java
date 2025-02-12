package es.ieslavereda.set;

public class Usuario implements Comparable<Usuario>{

    private String dni;
    private String nombre;

    public Usuario(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override // Me indica que dos objetos son iguales
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Usuario)) return false;
        Usuario u = (Usuario) obj;

        return dni.equals(u.dni);
    }

    @Override //Si dos objetos son iguales, me deben devolver el mismo código HASH (hashcode()). Esto es necesario para que funcione correctamente HASHSET Y LINKEDHASHSET. Para ambos es necesario sobreescribir el Equals y el Hashcode
    public int hashCode() {
        return dni.hashCode();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\n" + "DNI: " + dni;
    }

    @Override
    public int compareTo(Usuario o) {
        if(nombre.compareToIgnoreCase(o.nombre) == 0){
            return dni.compareToIgnoreCase(o.dni);
        }else{
            return nombre.compareToIgnoreCase(o.nombre);
        }
    }
}
