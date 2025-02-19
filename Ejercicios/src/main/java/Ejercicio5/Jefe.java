package Ejercicio5;

import java.util.Arrays;

public class Jefe extends Empleado {

    private String despacho;
    private Secretario secretario;
    private Vendedor[] vendedores;
    private Coche coche;


    public Jefe(String nombre, String apellidos, String dni, int telefono, String direccion, float salario, String despacho, Secretario secretario, Vendedor[] vendedores, Coche coche) {
        super(nombre, apellidos, dni, telefono, direccion, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        vendedores = new Vendedor[0];
        this.coche = coche;
    }

    public void setSecretario(Secretario secretario){
        this.secretario = secretario;
    }

    public void cambiarCoche(Coche coche){
        this.coche=coche;
    }

    public void altaVendedor(Vendedor vendedor){

        if (!tieneVendedor(vendedor)){

            Vendedor[] aux = new Vendedor[vendedores.length+1];
            aux[0] = vendedor;

            for (int i = 0; i<vendedores.length;i++){
                aux[i+1]=vendedores[i];
            }
            vendedores = aux;

        }
    }

    public void bajaVendedor(Vendedor vendedor){

        if (tieneVendedor(vendedor)){
            Vendedor[] aux = new Vendedor[vendedores.length-1];
            int i = 0;
            for (Vendedor c : vendedores)
                if (!c.equals(vendedor))
                    aux[i++] = c;

            vendedores = aux;

        }


    }

    private boolean tieneVendedor(Vendedor vendedor){

        for (Vendedor v : vendedores){
            if (v.equals(vendedor)){
                return true;
            }
        }
        return false;
    }


    @Override
    public void incrementarSalario() {
        salario*=1.05f;
    }

    @Override
    public void cambiarSupervisor(Empleado empleado) {
        if (supervisa instanceof Jefe) supervisa = empleado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Jefe{" +
                "despacho='" + despacho + '\'' +
                ", secretario=" + secretario +
                ", vendedores=" + Arrays.toString(vendedores) +
                ", coche=" + coche +
                ", salario=" + salario +
                ", supervisa=" + supervisa +
                '}';
    }
}
