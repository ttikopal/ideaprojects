package Gimnasio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente jose = new Cliente("Jose Palomo",LocalDate.of(2000, 12, 28),"48713946S",Sexo.Hombre,178);

        System.out.println(jose);
        jose.pesarse(new Medicion(LocalDate.of(2023, 6, 17),69,1.78f,jose));
        jose.pesarse(new Medicion(LocalDate.now(),82,1.78f,jose));
        System.out.println(jose);


    }
}
