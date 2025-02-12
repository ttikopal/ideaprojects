package es.ieslavereda.poo_avanzada.Pruebas;

public abstract class Figura {

    protected int lados;

    public Figura(int lados) {
        this.lados = lados;
    }

    public abstract float obtenerArea();

    @Override
    public String toString(){
        return "Figura\n"+
                "Lados: "  + lados;
    }

}