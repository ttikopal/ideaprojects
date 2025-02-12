package ruletaRusa;

public class Bala {

    private boolean valida;
    private boolean disparada;

    public Bala(){
        disparada = false;
        valida = (int)(Math.random()*10) != 0;
    }

    public boolean percutar(){
        if(disparada) return false;

        disparada = true;

        return valida;
    }

    @Override
    public String toString() {
        return (disparada)?"X":"0";
    }
}
