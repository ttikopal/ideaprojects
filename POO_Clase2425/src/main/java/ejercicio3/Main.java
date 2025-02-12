package ejercicio3;

public class Main {
    public static void main(String[] args) {

        Contador contador = new Contador();
        Contador contador2 = new Contador();


        System.out.println(Contador.getCantidadContadores()); //Llamamos a la clase Contador porque es un método static

    }
}
