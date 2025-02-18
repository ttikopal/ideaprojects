package org.example.MaquinaDePesar;

public enum Sexo {
    HOMBRE("Masculino")
    , MUJER("Femenino");

    private String sexo;

    Sexo(String sexo){
        this.sexo=sexo;
    }

    @Override
    public String toString(){
        return sexo;
    }

}