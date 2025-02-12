package es.ieslavereda.poo_avanzada.EjercicioHerencia4;

public class Bicicleta extends Vehiculo{

    private String tipo;

    public Bicicleta(int velocidad, String tipo){
        super(velocidad);

        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public boolean incrementarVel(int unidades) {
        if(unidades <= 4){
            for(int i = 0; i < unidades; i++){
                incrementarVelocidad();
            }
            return true;
        }

        return false;
    }

    @Override
    public boolean decrementarVel(int unidades){
       if(unidades <= 4 && super.getVelocidad() > 0 && super.getVelocidad() >= unidades){
           for(int i = 0; i < unidades; i++){
               decrementarVelocidad();
           }

           return true;
       }

       return false;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nTipo de bicicleta: " + tipo;
    }
}
