package ruletaRusa;

public class Tambor {

    private Bala[] balas;

    public Tambor(){
        balas = new Bala[7];
    }

    public void recargar(int pos, Bala b){
        balas[pos % balas.length] = b;
    }


    public boolean hayBalaEn(int pos){
        return balas[pos% balas.length] != null;
    }

    public void recargar(){
        for(int i = 0; i < balas.length; i++){
            balas[i] = new Bala();
        }
    }

    public void vaciar(){
        balas = new Bala[balas.length];
    }

    public int getSize(){
        return balas.length;
    }

    public Bala getBalaAt(int pos){
        return balas[pos % balas.length];
    }



    @Override
    public String toString(){
        String salida = "|";

        for(Bala b: balas){
            salida += ((b == null)?" ": b) + "|";
        }

        return salida;
    }
}
