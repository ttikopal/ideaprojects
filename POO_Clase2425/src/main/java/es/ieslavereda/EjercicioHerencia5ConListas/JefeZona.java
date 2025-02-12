package es.ieslavereda.EjercicioHerencia5ConListas;

import java.util.Arrays;

public class JefeZona extends Empleado {

    private String despacho;
    private Secretario secretario;
    private ListaVendedores vendedores;
    private Coche coche;


    public JefeZona(String nombre, String apellidos, String DNI, String direccion, long telf, float salario, Empleado supervisor, String despacho, Secretario secretario) {
        super(nombre, apellidos, DNI, direccion, telf, salario, supervisor);
        this.despacho = despacho;
        this.secretario = secretario;

        this.vendedores = new ListaVendedores();
        coche = null;
    }

    public void cambiarSecretario(Secretario secretario){
        this.secretario = secretario;
    }

    public void cambiarCoche(Coche coche){
        this.coche = coche;
    }

    public void addVendedor(Vendedor vendedor){

        if(!vendedores.contains(vendedor)){

            vendedores.addHeadVendedor(vendedor);
        }

    }

    public void delVendedor(Vendedor vendedor){

        if(vendedores.contains(vendedor)){

            vendedores.remove(vendedor);
        }

    }

    private boolean containsClient(Vendedor vendedor){

        return vendedores.contains(vendedor);

    }

    @Override
    public void cambiarSalario() {
        salario *= 1.05f;
    }

    @Override
    public void cambiarSupervisor(Empleado empleado) {
        if(empleado instanceof JefeZona){
            this.supervisor = supervisor;
        }
    }

    @Override
    public float calcularIRPF() {
        return salario * 0.30f;
    }

    @Override
    public float calcularContComunes() {
        return salario * 0.05f;
    }

    @Override
    public void mostrarEtiquetaID() {
        System.out.println("Nombre: " + nombre + " Apellidos: " + apellidos);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
