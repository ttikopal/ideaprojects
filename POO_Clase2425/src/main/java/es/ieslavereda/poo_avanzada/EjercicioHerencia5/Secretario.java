package es.ieslavereda.poo_avanzada.EjercicioHerencia5;

public class Secretario extends Empleado{

    private String despacho;
    private int numFax;

    public Secretario(String nombre, String apellidos, String DNI, String direccion, long telf, float salario, Empleado supervisor, String despacho, int numFax){
        super(nombre, apellidos, DNI, direccion, telf, salario, supervisor);

        this.despacho = despacho;
        this.numFax = numFax;
    }

    @Override
    public void cambiarSupervisor(Empleado empleado) {
        if(empleado instanceof Secretario || empleado instanceof JefeZona){
            this.supervisor = empleado;
        }
    }

    @Override
    public void cambiarSalario() {
        salario *= 1.15f;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nDespacho: " + despacho +
                "\nNumFax: " + numFax;
    }

}
