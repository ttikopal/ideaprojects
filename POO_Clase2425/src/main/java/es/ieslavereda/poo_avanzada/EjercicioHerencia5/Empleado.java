package es.ieslavereda.poo_avanzada.EjercicioHerencia5;

import es.ieslavereda.poo_avanzada.EjercicioHerencia1.Persona;

public abstract class Empleado {

    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private int anyosAnt;
    private long telf;
    protected float salario;
    protected Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String direccion, long telf, float salario, Empleado supervisor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telf = telf;
        this.salario = salario;
        supervisor = null;
    }

    public abstract void cambiarSupervisor(Empleado empleado);
    public abstract void cambiarSalario();

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Empleado)) return false;

        Empleado e = (Empleado) obj;

        return DNI.equalsIgnoreCase(e.DNI) &&
                nombre.equalsIgnoreCase(e.nombre) &&
                apellidos.equalsIgnoreCase(e.apellidos);

    }

    @Override
    public String toString(){

        return "Empleado: " +
                "\nNombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nDNI: " + DNI +
                "\nDirección: " + direccion +
                "\nTeléfono: " + telf +
                "\nSalario: " + salario;

    }

}
