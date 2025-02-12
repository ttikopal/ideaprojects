package es.ieslavereda.EjercicioHerencia5ConListas;

public class Vendedor extends Empleado {

    private Coche coche;
    private int movil;
    private String area;
    private ListaClientes clientes;
    private int comisiones;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, long telf, float salario, Empleado supervisor, Coche coche, int movil, String area, String[] clientes, int comisiones) {
        super(nombre, apellidos, DNI, direccion, telf, salario, supervisor);
        this.coche = coche;
        this.movil = movil;
        this.area = area;
        this.clientes = new ListaClientes();
        this.comisiones = comisiones;
    }

    public void addCliente(String cliente){
        if(!clientes.contains(cliente)){

          clientes.addHeadCliente(cliente);
        }
    }

    public void delCliente(String cliente){
            clientes.remove(cliente);
    }

    private boolean containsCliente(String cliente){

        return clientes.contains(cliente);
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
    public float calcularIRPF() {
        return salario * 0.24f;
    }
    @Override
    public float calcularContComunes() {
        return salario * 0.04f;
    }

    @Override
    public void mostrarEtiquetaID() {
        System.out.println("Nombre: " + nombre + " Apellidos: " + apellidos);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString();
    }

}
