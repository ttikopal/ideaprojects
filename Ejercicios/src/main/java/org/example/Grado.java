package org.example;

public enum Grado {



    ASIR_PRIMERO(1,"SUPERIOR"),
    ASIR_SEGUNDO(2,"SUPERIOR"),
    DAM_PRIMERO(1,"SUPERIOR"),
    DAM_SEGUNDO(2,"SUPERIOR"),
    SMR_PRIMERO(1,"MEDIO"),
    SMR_SEGUNDO(2,"MEDIO"),
    DAW_PRIMERO(1,"SUPERIOR"),
    DAW_SEGUNDO(2,"SUPERIOR");

    private int curso;
    private String tipoGrado;

    private Grado(int curso, String tipoGrado){
        this.curso = curso;
        this.tipoGrado = tipoGrado;
    }

    public int getCurso(){
        return curso;
    }

    public String getTipoGrado(){
        return tipoGrado;
    }


    @Override
    public String toString() {
        return super.toString() + "\nCurso: " + curso +
                "\nTipo de Grado: " + tipoGrado;
    }
}
