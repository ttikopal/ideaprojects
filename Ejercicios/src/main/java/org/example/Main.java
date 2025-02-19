package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Directivo d = new Directivo("4817273S","MANUEL","LORENZO",46,Grado.SMR_SEGUNDO,"Jefe");
        Profesor p = new Profesor("4817273S","MANUEL","LORENZO",46,Grado.SMR_SEGUNDO,Grado.DAM_SEGUNDO);


        System.out.println(p);


//        System.out.println(d);
//        System.out.println(Grado.SMR_PRIMERO);

    }
}