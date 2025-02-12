package es.ieslavereda.poo_avanzada.EjercicioHerencia1;

public class Directivo extends Profesor{

    private String cargo;

    public Directivo(String DNI, String nombre, String apellidos, int edad, String cargo, Grado... gradosImparte) {
        super(DNI, nombre, apellidos, edad, gradosImparte);
        this.cargo = cargo;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    @Override
    public void imprimirDNI(){
        System.out.println("Directivo DNI: " + getDNI());
    }

    @Override
    public String toString(){
        return super.toString() +
                ", cargo: " +cargo;
    }

}
