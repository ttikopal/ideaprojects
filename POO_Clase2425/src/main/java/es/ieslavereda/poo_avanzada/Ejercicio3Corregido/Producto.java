package es.ieslavereda.poo_avanzada.Ejercicio3Corregido;

import java.time.LocalDate;

public abstract class Producto {

    private LocalDate fechaCad;
    private long numLote;

    public Producto(LocalDate fechaCad, long numLote){
        this.fechaCad = fechaCad;
        this.numLote = numLote;
    }

    public LocalDate getFechaCad(){
        return fechaCad;
    }

    public void setFechaCad(LocalDate fechaCad){
        this.fechaCad = fechaCad;
    }

    public long getNumLote(){
        return numLote;
    }

    public void setNumLote(long numLote){
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
