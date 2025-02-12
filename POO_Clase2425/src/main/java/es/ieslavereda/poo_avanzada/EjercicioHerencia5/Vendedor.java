package es.ieslavereda.poo_avanzada.EjercicioHerencia5;

import es.ieslavereda.poo_avanzada.EjercicioHerencia1.Persona;

import java.util.Arrays;

public class Vendedor extends Empleado{

    private Coche coche;
    private int movil;
    private String area;
    private String[] clientes;
    private int comisiones;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, long telf, float salario, Empleado supervisor, Coche coche, int movil, String area, String[] clientes, int comisiones) {
        super(nombre, apellidos, DNI, direccion, telf, salario, supervisor);
        this.coche = coche;
        this.movil = movil;
        this.area = area;
        this.clientes = new String[0];
        this.comisiones = comisiones;
    }

    public void addCliente(String cliente){
        if(!containsCliente(cliente)){

            String[] aux = new String[clientes.length+1];
            aux[0] = cliente;

            for(int i = 0; i < clientes.length; i++){
                aux[i+1] = clientes[i];
            }

            clientes = aux;
        }
    }

    public void delCliente(String cliente){
        if(containsCliente(cliente)){

            String[] aux = new String[clientes.length-1];

            int i=0;
            for(String c: clientes){
                if(!c.equalsIgnoreCase(cliente)){
                    aux[i++]= c;
                }
            }

            clientes = aux;
        }
    }

    private boolean containsCliente(String cliente){

        int i = 0;
        boolean encontrado = false;
        while(i < clientes.length && !encontrado){

            if (clientes[i].equalsIgnoreCase(cliente)){
                encontrado = true;
            }

            i++;
        }

        return encontrado;
    }

    public void cambiarCoche(Coche coche){
        this.coche = coche;
    }

    @Override
    public void cambiarSupervisor(Empleado empleado) {
        if(empleado instanceof Vendedor || empleado instanceof JefeZona){
            this.supervisor = empleado;
        }
    }

    @Override
    public void cambiarSalario() {
        salario *= 1.10f;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString();
    }

}
