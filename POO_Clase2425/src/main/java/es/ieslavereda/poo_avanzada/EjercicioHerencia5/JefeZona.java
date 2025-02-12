package es.ieslavereda.poo_avanzada.EjercicioHerencia5;

import java.util.Arrays;

public class JefeZona extends Empleado{

    private String despacho;
    private Secretario secretario;
    private Vendedor[] vendedores;
    private Coche coche;


    public JefeZona(String nombre, String apellidos, String DNI, String direccion, long telf, float salario, Empleado supervisor, String despacho, Secretario secretario) {
        super(nombre, apellidos, DNI, direccion, telf, salario, supervisor);
        this.despacho = despacho;
        this.secretario = secretario;

        this.vendedores = new Vendedor[0];
        coche = null;
    }

    public void cambiarSecretario(Secretario secretario){
        this.secretario = secretario;
    }

    public void cambiarCoche(Coche coche){
        this.coche = coche;
    }

    public void addVendedor(Vendedor vendedor){

        if(!containsClient(vendedor)){

            Vendedor[] aux = Arrays.copyOf(vendedores,vendedores.length+1);
            aux[aux.length-1] = vendedor;

            vendedores=aux;
        }

    }

    public void delVendedor(Vendedor vendedor){

        if(containsClient(vendedor)){

            Vendedor[] aux = new Vendedor[vendedores.length-1];

            int i=0;
            for(Vendedor v : vendedores)
                if(!v.equals(vendedor))
                    aux[i++]=v;

            vendedores = aux;
        }

    }

    private boolean containsClient(Vendedor vededor){

        int i=0;
        boolean encontrado = false;

        while(i<vendedores.length && !encontrado) {

            if (vendedores[i].equals(vededor))
                encontrado=true;

            i++;
        }

        return encontrado;

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
    public String toString() {
        return super.toString();
    }
}
