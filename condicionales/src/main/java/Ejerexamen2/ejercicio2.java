package Ejerexamen2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int materias = entrada.getInt("Cuantas materias quieres poner? ");
        int alumnos = entrada.getInt("Cuantos alumnos son?");

        String[][] notas = new String[materias+1][alumnos+1];

        rellenarMaterias(notas);
        rellenarAlumnos(notas);
        rellenarNotas(notas);
        showArray(notas);





    }
    public static void rellenarMaterias(String[][] array){

        for (int i = 1; i<array.length;i++){
            array[i][0] = entrada.getTexto("Introduce la materia: ");
        }

    }

    public static void rellenarAlumnos(String[][] array){

        for (int i = 1; i<array.length;i++){

            array[0][i] = entrada.getTexto("Nombre del alumno " + i);

        }
    }

    public static void rellenarNotas(String[][] array){

        for (int i = 1; i<array.length;i++){
            for (int j = 1;j< array.length;j++){
                array[i][j] = String.valueOf(Math.random()*10);
            }
        }

    }



    public static void showArray(String[][] array){
        for (int i = 0; i< array.length;i++){
            for (int j = 0; j< array[i].length;j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }




}
