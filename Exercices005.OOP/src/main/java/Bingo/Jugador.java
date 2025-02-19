package Bingo;

public class Jugador {

    private String nombre;
    private float saldo;
    private Carton carton;

    public Jugador(String nombre, Carton carton){
        this.carton = carton;
        this.nombre = nombre;
        saldo = 20f;
    }

//    public boolean comprarCarton(){
//        boolean si = false;
//        if (saldo < 5) return si;
//
//        if (saldo > 5){
//            saldo = saldo - 5;
//            si = true;
//        }
//        return si;
//    }

    public String getNombre(){
        return nombre;
    }

    public  Carton getCarton(){
        return carton;
    }


    @Override
    public String toString() {
        return "El jugador "+nombre+" tiene "+saldo+" $";
    }
}
