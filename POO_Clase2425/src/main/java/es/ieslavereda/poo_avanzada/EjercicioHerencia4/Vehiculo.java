package es.ieslavereda.poo_avanzada.EjercicioHerencia4;

public abstract class Vehiculo {

    private int velocidad;

    public Vehiculo(int velocidad){
        if(velocidad < 0){
            this.velocidad = 0;
        }else{
            this.velocidad = velocidad;
        }
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    public void incrementarVelocidad(){
        this.velocidad++;
    }

    public void decrementarVelocidad(){
       this.velocidad--;
    }

    public boolean incrementarVel(int unidades){
        return false;
    }

    public boolean decrementarVel(int unidades){
        return false;
    }

    @Override

    public String toString(){
        return "Velocidad: " + velocidad;
    }

}
