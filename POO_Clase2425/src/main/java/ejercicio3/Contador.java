package ejercicio3;

public class Contador {

    private int cantidad;
    private static int cantidadContadores; //Creamos un atributo static (Quiere decir que el que lo guarda es la CLASE)


    public Contador(){
        cantidad = 0;
        cantidadContadores++;
    }

   public int getCantidad(){
        return cantidad;
   }

   public void setCantidad(int cantidad){
        this.cantidad = cantidad;
   }

    public int incrementar(int cantidad){
        return cantidad++;
    }

    public int decrementar(int cantidad){
        return cantidad--;
    }

    public static int getCantidadContadores(){ //Si hacemos un método Static este método hará referencia a la CLASE, entonces en el main llamaremos a la CLASE y no al objeto
        return cantidadContadores;
    }

}
