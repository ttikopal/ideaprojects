package Ejercicio4;

public class Bicicleta extends  Vehiculo{

    private Tipo tipo;

    public Bicicleta(float velocidad, Tipo tipo){
        super(velocidad);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean reducirVelocidad(float v) {
        boolean n = false;

        if (v <=4 &&  v>0){
            return super.reducirVelocidad(v);
        }
        return n;
    }

    @Override
    public boolean aumentarVelocidad(float v) {
        boolean n = false;

        if (v <=4 && v>0){
            return super.aumentarVelocidad(v);
        }
        return n;
    }

    public enum Tipo{
        MONTAÑA,CARRETERA,BMX,ENDURO,TRAIL,DOWNHILL,FATBIKES;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de bicicleta: " + tipo;
    }
}
