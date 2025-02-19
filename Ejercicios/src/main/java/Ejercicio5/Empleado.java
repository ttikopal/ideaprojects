package Ejercicio5;

import java.util.Objects;

public abstract class Empleado {

    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private int antiguedad;
    private int telefono;
    protected float salario;
    protected Empleado supervisa;

    public Empleado(String nombre, String apellidos, String dni, int telefono, String direccion, float salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.salario = salario;
        antiguedad=0;
    }

    public abstract void cambiarSupervisor(Empleado empleado);

    public abstract void incrementarSalario();

    public int getAntiguedad(){
        return antiguedad;
    }


    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", antiguedad=" + antiguedad +
                ", telefono=" + telefono +
                ", salario=" + salario +
                ", supervisa=" + supervisa +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != getClass()) return false;
        Empleado v = (Empleado) obj;
        return dni == v.dni;


    }
}
