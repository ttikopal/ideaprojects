package Ej5;

public class Tambor {

    private Bala[] balas;

    public Tambor(){
        balas = new Bala[7];
    }

    public Bala getBala(int pos){
        return balas[pos % balas.length];
    }


    public void recargar(int pos, Bala b){
        balas[pos % balas.length] = b;
    }

    public void recargar(){
        for (int i = 0; i< balas.length;i++)
            balas[i] = new Bala();
    }

    public boolean hayBala(int pos){
        return balas[pos % balas.length]!=null;
    }

    public void vaciar(){
        balas = new Bala[balas.length];
    }

    @Override
    public String toString(){
        String salida = "|";

        for (Bala x : balas)
            salida += ((x==null)? " ":x) + "|";
        return salida;
    }

}
