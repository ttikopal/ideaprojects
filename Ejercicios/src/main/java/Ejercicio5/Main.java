package Ejercicio5;

public class Main {
    public static void main(String[] args) {

        Vendedor v = new Vendedor("J",4554,"jsad","1231431",545345,"asdasd",123123,new Coche("asd","asd","asd"),"si",2);

        v.nuevoCliente("si");
        v.nuevoCliente("asdasd");
        v.nuevoCliente("werdfsdf");
        System.out.println(v);



    }
}
