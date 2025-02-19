package Contador;

public class Contador {

    private int contador;


    public Contador(int contador){
        this.contador = contador;
    }

    public void sumarContador (){
        this.contador++;
    }

    @Override

    public String toString(){
        return ""+contador;
    }

}
