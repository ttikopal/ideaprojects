package Hundirlaflota;
import java.util.Scanner;
public class FlotaGPT {

    public static void main(String[] args) {
        char[][] tableroJugador = new char[10][10];
        char[][] tableroPC = new char[10][10];
        char[][] tableroDisparosJugador = new char[10][10];
        char[][] tableroDisparosPC = new char[10][10];
        int[] barcos = {5, 4, 3, 3, 2}; // Ejemplo de barcos: 1 de 5, 1 de 4, 2 de 3, y 1 de 2

        inicializarTablero(tableroJugador);
        inicializarTablero(tableroPC);
        inicializarTablero(tableroDisparosJugador);
        inicializarTablero(tableroDisparosPC);

        colocarBarcosJugador(tableroJugador, barcos);
        colocarBarcosPC(tableroPC, barcos);

        boolean juegoTerminado = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido a Hundir la Flota!");

        while (!juegoTerminado) {
            borrarPantalla();
            System.out.println("Tablero del Jugador:");
            visualizarTablero(tableroJugador, tableroDisparosJugador);
            System.out.println("\nTablero de Disparos del Jugador:");
            visualizarTablero(tableroDisparosJugador, tableroDisparosPC);

            System.out.println("\nTurno del jugador:");
            boolean disparoJugadorAcertado = disparoJugador(tableroDisparosJugador, tableroPC);

            if (todosBarcosHundidos(tableroPC)) {
                System.out.println("¡Felicidades! Has hundido todos los barcos del PC. ¡Has ganado!");
                juegoTerminado = true;
                continue;
            }

            System.out.println("\nTurno del PC:");
            boolean disparoPCAcertado = disparoPC(tableroDisparosPC, tableroJugador);

            if (todosBarcosHundidos(tableroJugador)) {
                System.out.println("El PC ha hundido todos tus barcos. ¡Has perdido!");
                juegoTerminado = true;
            }

            // Pausa antes del siguiente turno
            System.out.println("\nPresiona Enter para continuar...");
            sc.nextLine();
        }

        sc.close();
    }

    public static boolean todosBarcosHundidos(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 'P' || tablero[i][j] == 'B') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '~';
            }
        }
    }

    public static void visualizarTablero(char[][] tablero, char[][] tableroDisparos) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        char fila = 'A';
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(fila++ + " ");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void borrarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static int sumaCeldas(int[] unVector) {
        int suma = 0;
        for (int valor : unVector) {
            suma += valor;
        }
        return suma;
    }
    public static void colocarBarcosJugador(char[][] tablero, int[] barcos) {
        for (int longitud : barcos) {
            boolean colocado = false;
            while (!colocado) {
                int fila = (int) (Math.random() * 10);
                int columna = (int) (Math.random() * 10);
                int orientacion = (int) (Math.random() * 2); // 0 = horizontal, 1 = vertical
                if (cabeBarco(tablero, longitud, fila, columna, orientacion) && !hayColision(tablero, longitud, fila, columna, orientacion)) {
                    colocarBarco(tablero, longitud, fila, columna, orientacion, true);
                    colocado = true;
                }
            }
        }
    }
    public static void colocarBarcosPC(char[][] tablero, int[] barcos) {
        colocarBarcosJugador(tablero, barcos); // Similar al método de jugador
    }
    public static boolean hayColision(char[][] tablero, int longitudBarco, int fila, int columna, int orientacion) {
        for (int i = 0; i < longitudBarco; i++) {
            int f = fila + (orientacion == 1 ? i : 0);
            int c = columna + (orientacion == 0 ? i : 0);
            if (tablero[f][c] != '~') {
                return true;
            }
        }
        return false;
    }
    public static boolean cabeBarco(char[][] tablero, int longitudBarco, int fila, int columna, int orientacion) {
        return (orientacion == 0 && columna + longitudBarco <= tablero[0].length) ||
                (orientacion == 1 && fila + longitudBarco <= tablero.length);
    }
    public static boolean colocarBarco(char[][] tablero, int longitudBarco, int fila, int columna, int orientacion, boolean jugador) {
        if (cabeBarco(tablero, longitudBarco, fila, columna, orientacion) && !hayColision(tablero, longitudBarco, fila, columna, orientacion)) {
            for (int i = 0; i < longitudBarco; i++) {
                int f = fila + (orientacion == 1 ? i : 0);
                int c = columna + (orientacion == 0 ? i : 0);
                tablero[f][c] = jugador ? 'B' : 'P'; // 'B' para barco del jugador, 'P' para PC
            }
            return true;
        }
        return false;
    }
    public static boolean disparoJugador(char[][] tableroDisparosJugador, char[][] tableroPC) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce fila (A-J): ");
        char filaChar = sc.next().charAt(0);
        System.out.print("Introduce columna (0-9): ");
        int columna = sc.nextInt();

        int fila = filaChar - 'A';
        if (tableroPC[fila][columna] == 'P') {
            tableroDisparosJugador[fila][columna] = 'X';
            tableroPC[fila][columna] = 'X';
            System.out.println("¡Tocado!");
            return true;
        } else {
            tableroDisparosJugador[fila][columna] = 'O';
            System.out.println("Agua.");
            return false;
        }
    }

    public static boolean disparoPC(char[][] tableroDisparosPC, char[][] tableroJugador) {
        int fila = (int) (Math.random() * 10);
        int columna = (int) (Math.random() * 10);

        if (tableroJugador[fila][columna] == 'B') {
            tableroDisparosPC[fila][columna] = 'X';
            tableroJugador[fila][columna] = 'X';
            System.out.println("¡El PC ha dado en un barco!");
            return true;
        } else {
            tableroDisparosPC[fila][columna] = 'O';
            System.out.println("El PC disparó al agua.");
            return false;
        }
    }

}
