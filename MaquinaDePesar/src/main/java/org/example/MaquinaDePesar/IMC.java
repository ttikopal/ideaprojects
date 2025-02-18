package org.example.MaquinaDePesar;

public enum IMC {
    BAJO("Bajo peso"),
    RANGO_NORMAL("Rango normal"),
    SOBREPESO("Sobrepeso"),
    OBESO("Obeso");

    private String descripcion;

    IMC(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return descripcion;
    }

}