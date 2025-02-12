package es.ieslavereda.poo_avanzada.Ejercicio4Corregido;

import es.ieslavereda.poo_avanzada.EjercicioHerencia4.VehiculoMotor;

public class Coche extends VehiculoMotor {
    private String matricula;

    public Coche(int velocidad, String tipoMotor, int numMarchas, String matricula){
        super(velocidad, tipoMotor, numMarchas);

        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    @Override
    public boolean incrementarVel(int unidades) {
        if(unidades > 0) {
            for (int i = 0; i < unidades; i++) {
                incrementarVelocidad();
            }
            return true;
        }

        return false;
    }

    public boolean decrementarVel(int unidades){
        if(unidades > 0 && super.getVelocidad()>= unidades){
            for(int i = 0; i < unidades ; i++){
                decrementarVelocidad();
            }

            return true;
        }

        return false;
    }

    @Override

    public String toString(){
        return super.toString() +
                "\nMatrícula: " + matricula;
    }
}
