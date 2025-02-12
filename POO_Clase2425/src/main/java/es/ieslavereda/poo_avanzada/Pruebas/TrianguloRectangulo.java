package es.ieslavereda.poo_avanzada.Pruebas;

public class TrianguloRectangulo extends Figura {

    private float longitud;

    public TrianguloRectangulo(float longitud){
        super(3);
        this.longitud=longitud;
    }

    public float obtenerArea(){
        return longitud*longitud/2;
    }

}