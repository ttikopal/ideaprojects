package es.ieslavereda.poo_avanzada.EjercicioHerencia1;

public enum Grado {

    ASIR_PRIMERO(1, Tipo.SUPERIOR),
    ASIR_SEGUNDO(2, Tipo.SUPERIOR),
    DAW_PRIMERO(1, Tipo.SUPERIOR),
    DAW_SEGUNDO(2, Tipo.SUPERIOR),
    SMR_PRIMERO(1, Tipo.MEDIO),
    SMR_SEGUNDO(2, Tipo.MEDIO),
    DAM_PRIMERO(1, Tipo.SUPERIOR),
    DAM_SEGUNDO(2, Tipo.SUPERIOR);

    private int curso;
    private Tipo tipo;

    Grado(int curso, Tipo tipo){
        this.curso = curso;
        this.tipo = tipo;
    }

    public int getCurso(){
        return curso;
    }

    public Tipo getTipo(){
        return tipo;
    }


    public enum Tipo {
        SUPERIOR, MEDIO;
    }

    @Override
    public String toString() {
        return curso +
                ((getTipo().equals(Tipo.MEDIO))?"CFGM":"CFGS") +
                super.toString().split("_")[0];
    }


}
