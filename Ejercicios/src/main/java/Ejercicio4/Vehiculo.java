package Ejercicio4;

public abstract class Vehiculo {

    private float velocidad;

    public Vehiculo(float velocidad){
        this.velocidad = velocidad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void aumentarVelocidad(){
        velocidad = velocidad+1;
    }

    public void reducirVelocidad(){
        velocidad = velocidad-1;
    }

    public boolean aumentarVelocidad(float v){
        boolean n = false;


        if (velocidad + v < 300){
            n = true;
            velocidad = velocidad + v;
        }

        return n;
    }

    public boolean reducirVelocidad(float v){
        boolean n = false;
        if (velocidad-v >= 0){
            n = true;
            velocidad = velocidad - v;
        }
        return n;
    }


    @Override
    public String toString() {
        return "Vehiculo" +
                "velocidad=" + velocidad +
                "Kms/H";
    }
}
