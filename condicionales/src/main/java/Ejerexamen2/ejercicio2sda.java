package Ejerexamen2;

public class ejercicio2sda {
    public static void main(String[] args) {
        int numeroEstudiantes = entrada.getInt("Número de estudiantes?: ");
        int numeroMaterias = entrada.getInt("Número de materias?: ");

        String[][] notas = new String[numeroMaterias+1][numeroEstudiantes+1];
        rellenaEstudiantes(notas);
        rellenaMaterias(notas);
        rellenarNotas(notas);
        displayNotas(notas);

        double[] mediaNotasMaterias=new double[numeroMaterias+1];
        mediaNotasMaterias(notas, mediaNotasMaterias);
        displayMedias(mediaNotasMaterias,notas,false);
        double[] mediaNotasEstudiantes=new double[numeroEstudiantes+1];
        mediaNotasEstudiantes(notas, mediaNotasEstudiantes);
        displayMedias(mediaNotasEstudiantes,notas,true);

        int posEstudiante = entrada.getInt("Posición del estudiante");
        printStars(posEstudiante,notas);

    }

    private static void rellenaEstudiantes(String[][] notas){
        for (int i = 1; i < notas[0].length; i++) {
            notas[0][i] = entrada.getTexto("Nombre del estudiante?: ");
        }
    }

    private static void rellenaMaterias(String[][] notas){
        for (int i = 1; i < notas.length; i++) {
            notas[i][0] = entrada.getTexto("Nombre de la materia?: ");
        }
    }

    private static void rellenarNotas(String[][] notas){
        for (int i = 1; i < notas.length; i++) {
            for (int j = 1; j < notas[0].length; j++) {
                double nota = Math.random()*10;
                notas[i][j] = String.format("%.2f",nota);
            }
        }
    }

    public static void displayNotas(String[][] notas){
        for(String[] array:notas) {
            for (String nota : array) {
                System.out.print(nota + "\t");
            }
            System.out.println();
        }

    }

    public static void mediaNotasMaterias(String[][] notas, double[] medias){
        for (int i = 1; i < medias.length; i++) {
            double suma = 0;
            for (int j = 1; j < notas[0].length; j++) {
                suma += Double.parseDouble(notas[i][j].replaceAll(",","."));
            }
            medias[i] = suma/ (notas[0].length-1);
        }

    }

    public static void mediaNotasEstudiantes(String[][] notas, double[] medias){
        for (int i = 1; i < medias.length; i++) {
            double suma = 0;
            for (int j = 1; j < notas.length; j++) {
                suma += Double.parseDouble(notas[j][i].replaceAll(",","."));
            }
            medias[i] = suma/ (notas.length-1);
        }
    }

    public static void displayMedias(double[] medias, String[][] notas,boolean estudiante){
        if(estudiante)
            System.out.println("Media de los estudiantes");
        else
            System.out.println("Media de las notas");
        for (int i = 1; i < medias.length; i++) {
            if(estudiante)
                System.out.println("Media estudiante " + notas[0][i] + "= " + medias[i]);
            else
                System.out.println("Media materia " + notas[i][0] + "= " + medias[i]);
        }
    }

    public static void printStars(int posicion, String[][] notas){
        for (int i = 1; i < notas.length; i++) {
            System.out.print("Materia: " + notas[i][0]);
            String star="";
            int nota = (int)(Math.round(Double.parseDouble(notas[i][posicion].replaceAll(",","."))));
            for (int j = 0; j < nota; j++) {
                star+="*";
            }
            System.out.println(star);
        }
    }
}
