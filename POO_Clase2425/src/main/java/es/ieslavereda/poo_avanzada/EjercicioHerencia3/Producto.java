package es.ieslavereda.poo_avanzada.EjercicioHerencia3;

import java.time.LocalDate;

public abstract class Producto {
    private LocalDate fechaCad;
    private int numLote;

    public Producto (LocalDate fechaCad, int numLote){
        this.fechaCad = fechaCad;
        this.numLote = numLote;
    }

    public LocalDate getFechaCad(){
        return fechaCad;
    }

    public void setFechaCad(LocalDate fechaCad){
        this.fechaCad = fechaCad;
    }

    public int getNumLote(){
        return numLote;
    }

    public void setNumLote(int numLote){
        this.numLote = numLote;
    }

    @Override

    public boolean equals (Object obj){
        if(obj == null || (obj instanceof Producto)) return false;

        Producto p = (Producto) obj;

        return p.fechaCad.equals(fechaCad) &&
                numLote == p.numLote;
    }

    @Override

    public String toString(){
        return "Fecha de caducidad: " + fechaCad +"\n" +
                "Número de lote: " + numLote;
    }

}
