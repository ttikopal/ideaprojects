package Ejercicio5;

import java.util.Arrays;

public class Vendedor extends Empleado {

    private Coche coche;
    private String areaVenta;
    private String[] clientes;
    private int movil;
    private float comisiones;
    private Lista lista;

    public Vendedor(String nombre, int movil, String apellidos, String dni, int telefono, String direccion, float salario, Coche coche, String areaVenta, float comisiones) {
        super(nombre, apellidos, dni, telefono, direccion, salario);
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.comisiones = comisiones;
        clientes = new String[0];
        lista = new Lista();
    }

    public void nuevoCliente(String cliente){

        if (!tieneCliente(cliente)){
            lista.addHead(cliente);

//            String[] aux = new String[clientes.length+1];
//            aux[0] = cliente;
//
//            for (int i = 0; i<clientes.length;i++){
//                aux[i+1]=clientes[i];
//            }
//            clientes = aux;
        }

    }



    public void quitarCliente(String cliente){

        if (tieneCliente(cliente)){
            String[] aux = new String[clientes.length-1];
            int i = 0;
            for (String c : clientes)
                if (!c.equalsIgnoreCase(cliente))
                    aux[i++] = c;

            clientes = aux;

        }

    }

    private boolean tieneCliente(String cliente){
        for (String c : clientes){
            if (c.equalsIgnoreCase(cliente)){
                return true;
            }
        }
        return false;
    }

    public void cambiarCoche(Coche coche){
        this.coche = coche;
    }


    @Override
    public void incrementarSalario() {
        salario = salario*1.1f;

    }

    @Override
    public void cambiarSupervisor(Empleado empleado) {
        if (empleado instanceof Vendedor) this.supervisa = empleado;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Vendedor{" +
                "coche=" + coche +
                ", areaVenta='" + areaVenta + '\'' +
                ", clientes=" + lista.toString() +
                ", comisiones=" + comisiones +
                '}';
    }


}
