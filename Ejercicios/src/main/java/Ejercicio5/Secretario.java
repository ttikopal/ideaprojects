package Ejercicio5;

public class Secretario extends Empleado {

    private String despacho;
    private int fax;

    public Secretario(String nombre, String apellidos, String dni, int telefono, String direccion, float salario, String despacho, int fax) {
        super(nombre, apellidos, dni, telefono, direccion, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    @Override
    public void cambiarSupervisor(Empleado empleado) {
        if (empleado instanceof Secretario) this.supervisa = empleado;
    }

    @Override
    public void incrementarSalario() {
        salario = salario + (salario * 0.15f);
    }

    @Override
    public String toString() {
        return super.toString() + "\n Secretario{" +
                "despacho='" + despacho + '\'' +
                ", fax=" + fax +
                '}';
    }
}
