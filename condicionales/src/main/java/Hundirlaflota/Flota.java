package Hundirlaflota;

import Ejerexamen2.entrada;

public class Flota {
    public static void main(String[] args) {

        System.out.println("========================\n\tHUNDIR LA FLOTA!\n\tV1.0 Jose Palomo\n\tDAW 2024-2025\n========================");
        String nombreJugador = entrada.getTexto("Introduce tu nombre: ");
        borrarPantalla();

        int[] barcos = new int[cantidadBarcos()];


        char[][] tableroJugador = new char[11][11];
        char[][] tableroDisparosJugador = new char[11][11];
        char[][] tableroConsola = new char[11][11];
        char[][] tableroDisparosConsola = new char[11][11];


        inicializarTablero(tableroJugador);
        mostrarTablero(tableroJugador);
        rellenarBarcos(barcos);
        elegirPos(tableroJugador,barcos);



    }

    public static void borrarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void inicializarTablero(char[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i == tablero.length - 1 && j > 0) { //Colocar los números
                    tablero[i][j] = (char) ('0' + j - 1);
                } else if (i < tablero.length - 1 && j == 0) { //Colocar las letras
                    tablero[i][j] = (char) ('A' + i);
                } else if (i < tablero.length - 1 && j > 0) { //Colocar los "-"
                    tablero[i][j] = '-';
                } else tablero[i][j] = ' '; // Colocar el espacio en blanco en la esquina
            }

        }
    }

    public static void mostrarTablero(char[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static int cantidadBarcos() {
        int cantidad = entrada.getInt("¿Con cuántos barcos quieres jugar? Entre 0 y 8");
        while (cantidad <= 0 || cantidad > 8) {
            if (cantidad <= 0)
                cantidad = entrada.getInt("Debes introduce al menos un barco: ");
            if (cantidad > 8)
                cantidad = entrada.getInt("Deben ser 8 o menos: ");
        }
        return cantidad;
    }

    public static void rellenarBarcos(int[] array) {

        int longitud;

        for (int i = 0; i < array.length; i++) {

            longitud = entrada.getInt("Introduce la longitud del barco " + (i + 1) + " entre 1 y 5");
            while (longitud < 1 || longitud > 5) {
                if (longitud < 1) {
                    longitud = entrada.getInt("Debe ser al menos longitud 1");
                }
                if (longitud > 5)
                    longitud = entrada.getInt("Debe ser al menos longitud 5");
            }
            array[i] = longitud;
        }
    }

    public static int obtenerFila() {
        char coordenadaY;
        coordenadaY = entrada.getChar("Introduce la coordenada Y (A-J)");
        coordenadaY = Character.toUpperCase(coordenadaY);
        while (coordenadaY < 'A' || coordenadaY > 'J') {
            coordenadaY = entrada.getChar("Debe ser entre A y J");
            coordenadaY = Character.toUpperCase(coordenadaY);
        }
        return coordenadaY - 'A'; //Convertimos 'A' en 0, 'B' en 1...
    }

    public static int obtenerColumna() {
        char coordenadaX;

        coordenadaX = entrada.getChar("Introduce la coordenada X (0-9)");
        while (coordenadaX < '0' || coordenadaX > '9') {
            coordenadaX = entrada.getChar("Debe ser entre 0 y 9");
            coordenadaX = Character.toUpperCase(coordenadaX);
        }

        return coordenadaX - '0';//Convertimos '0' en 0, '1' en 1...

    }

    public static int obtenerOrientacion(char[][] tablero) {

        int orientacion = entrada.getInt("Introduce la orientación (1 - Horizontal 0 - Vertical)");
        while (orientacion != 0 && orientacion != 1)
            orientacion = entrada.getInt("Debes ser 1 Horizontal o 0 Vertical");

        return orientacion;

    }

//    public static boolean comprobarBordesFila(int col, int[] barco,char[][] tablero){
//
//        boolean comprobado = false;
//        for (int i = 0; i < barco.length; i++) {
//            if (col + barco[i] > tablero.length){
//                comprobado = true;
//            }
//        }
//        return  comprobado;
//    }

    public static boolean comprobarCelda1(char[][] tablero, int fila, int col){

        boolean ocupado = false;

        if (tablero[fila][col + 1] == 'B') { // Comprobar si la celda ya está ocupada
            System.out.println("La posición seleccionada ya está ocupada.");
        } else ocupado = true;
        return ocupado;

    }



    public static void elegirPos(char[][] tablero, int[] barco) {




        for (int i = 0; i < barco.length; i++) {
            int fila = obtenerFila();
            int col = obtenerColumna();
            int orientacion = obtenerOrientacion(tablero);
            boolean ocupadoCelda1 = comprobarCelda1(tablero,fila,col);
            System.out.println("Vamos a proceder a colocar el barco de " + barco[i] + " celdas.");

            mostrarTablero(tablero);

            if (barco[i] == 1) {
                if (ocupadoCelda1) { // Comprobar si la celda ya está ocupada
                    System.out.println("La posición seleccionada ya está ocupada.");
                    i--; // Volver a pedir las coordenadas para este barco
                    continue;
                }
                tablero[fila][col + 1] = 'B'; // Colocar el barco
                continue; // Pasar al siguiente barco
            }

            if (orientacion == 1) { // Horizontal

                if (col + barco[i] > tablero.length) {
                    System.out.println("El barco no cabe en la posición seleccionada.");
                    i--; // Volver a pedir las coordenadas para este barco
                    continue;
                }
                for (int k = 0; k < barco[i]; k++) {
                    if (tablero[k][col + 1] == 'B') {
                        System.out.println("La posición seleccionada ya está ocupada");
                        i--;
                        continue;
                    }
                }
                for (int j = 0; j < barco[i]; j++) {
                    tablero[fila][col + (j + 1)] = 'B';
                }

            } else { // Vertical

                if (fila + barco[i] > tablero[0].length - 1) {
                    System.out.println("El barco no cabe en la posición seleccionada.");
                    i--;
                    continue;
                }

                for (int j = 0; j < barco[i]; j++) {
                    tablero[fila + j][col + 1] = 'B';
                }


            }
        mostrarTablero(tablero);
        }
    }
}

//public static boolean disparoJugador (char[][] tableroDisparosJugador, char[][] tableroPC){
//    char disparoY = entrada.getChar("Introduce la coordenada Y (A-J)");
//    char disparoX = entrada.getChar("Introduce la coordenada X (0-9)");
//}
// Metodo que implementa el disparo del PC
//
//    public static boolean disparoPC(char[][] tableroDisparosPC, char[][] tableroJugador){}
//
//


//
//
//
// Este metodo suma todos los valores de un vector
//
//    public static int sumaCeldas(int[] unVector){
//
//    }
//
//
//
////Este metodo coloca los barcos pasados como vector dentro del tablero del Jugador
//
//    public static void colocarBarcosJugador(char[][] tablero, int[] barcos){
//
//    }
//
//
//
////Este metodo coloca los barcos pasados como vector dentro del tablero del PC
//
//    public static void colocarBarcosPC(char[][] tablero,int[] barcos){
//
//    }
//
//
//
////Este metodo comprueba si hay algun barco en la zona del barco a colocar
//
//    public static boolean hayColision(char[][] tablero, int longitudBarco, int fila, int columna, int orientacion){
//
//    }
//
//
//
////Este metodo comprueba si el barco está en los límites del tablero
//
//    public static boolean cabeBarco(char[][] tablero, int longitudBarco, int fila, int columna, int orientacion){
//
//    }
//
//
////Este metodo coloca un barco en una posicion si este cabe en tablero y
// no coincide ninguna posicion con otro barco en la zona
//
//    public static boolean colocarBarco(char[][] tablero, int longitudBarco, int fila, int columna, int orientacion,boolean jugador){
//
//    }
//}
