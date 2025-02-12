package es.ieslavereda.poo_avanzada.EjemploInterfaz1;

public class ImplementacionCarton1 implements GestorCarton {

    private int[] numeros;
    private boolean[] marcados;

    public ImplementacionCarton1(){
        numeros = new int[10];
        marcados = new boolean[10];
    }

    @Override
    public int restantes() {
        return 0;
    }

    @Override
    public void marcar(int numero) {

    }


}
