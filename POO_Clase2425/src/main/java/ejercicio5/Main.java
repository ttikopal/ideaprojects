package ejercicio5;

public class Main {
    public static void main(String[] args) {

        Fraccion f1 = new Fraccion(1,2);
        Fraccion f2 = new Fraccion(1,3);

        System.out.println(f1.suma(f2));
        System.out.println(f1.suma(1));
        System.out.println(f1.multiplica(f2));

    }
}
