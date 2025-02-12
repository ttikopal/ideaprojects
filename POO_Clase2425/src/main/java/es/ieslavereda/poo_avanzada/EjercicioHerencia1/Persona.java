package es.ieslavereda.poo_avanzada.EjercicioHerencia1;

public class Persona {
    private String DNI;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String DNI, String nombre, String apellidos, int edad){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;

    }

    public void incrementarEdad(){
        this.edad++;
    }

    public void imprimirDNI(){
        System.out.println("Persona DNI: " + DNI);
    }

    public String getDNI(){
        return DNI;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Persona)) return false;

        Persona p = (Persona) obj;

        return DNI.equalsIgnoreCase(p.DNI) &&
                nombre.equalsIgnoreCase(p.nombre) &&
                apellidos.equalsIgnoreCase(p.apellidos);

    }

    @Override
    public String toString() {
        return  "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad;
    }
}
