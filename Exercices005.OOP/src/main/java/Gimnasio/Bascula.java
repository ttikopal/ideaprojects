package Gimnasio;

import java.time.LocalDate;

public class Bascula {

    private Cliente cliente;
    private float peso;
    private LocalDate fechaPesaje;
    private float[] historico;

    public Bascula(){
        fechaPesaje = LocalDate.now();
    }


}
