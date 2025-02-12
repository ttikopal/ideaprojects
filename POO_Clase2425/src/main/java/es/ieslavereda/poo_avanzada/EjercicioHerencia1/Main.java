package es.ieslavereda.poo_avanzada.EjercicioHerencia1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Alumno a1 = new Alumno("1234567L","Manolo","Lopez Sanz",4,Grado.ASIR_PRIMERO);
        Persona p1 = new Persona("111111D","N_Desconocido","A_Desconocido",0);
        Profesor p2 = new Profesor("222222J","Luis","Garcia Lopez",33,Grado.ASIR_PRIMERO,Grado.DAM_PRIMERO,Grado.DAW_PRIMERO);
        Directivo d1 = new Directivo("121111","Carmen","Lopez Lopez",31,"Directora",Grado.DAW_SEGUNDO,Grado.SMR_SEGUNDO);


        System.out.println(a1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(d1);


        a1.imprimirDNI();
        p1.imprimirDNI();
        p2.imprimirDNI();
        d1.imprimirDNI();



    }
}
