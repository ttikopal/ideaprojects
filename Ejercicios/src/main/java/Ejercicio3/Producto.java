package Ejercicio3;

import java.time.LocalDate;

public abstract class Producto {

    private String fechaCaducidad;
    private int numeroLote;
    private String informacion;


    public Producto(String fechaCaducidad, int numeroLote, String informacion) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.informacion = informacion;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public String getInformacion() {
        return informacion;
    }


    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }


    @Override
    public String toString() {
        return "Fecha de caducidad: " + fechaCaducidad +
                "\nNumero de lote: " + numeroLote +
                "\nInformacion: " + informacion;
    }
}
