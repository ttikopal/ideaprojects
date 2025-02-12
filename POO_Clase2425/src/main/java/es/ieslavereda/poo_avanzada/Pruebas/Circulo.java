package es.ieslavereda.poo_avanzada.Pruebas;

public class Circulo extends Figura{

    private float radio;

    public Circulo(float radio){
        super(1);
        this.radio=radio;
    }


    @Override
    public float obtenerArea() {
        return (float) (Math.PI*Math.pow(radio,2));
    }
}