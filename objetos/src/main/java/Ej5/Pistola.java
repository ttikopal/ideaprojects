package Ej5;

public class Pistola {

    private Tambor tambor;
    private int pos;

    public Pistola(){
        tambor = new Tambor();
        pos = (int)(Math.random()*10);
    }

    public void recargar(Bala bala){
        tambor.recargar(0, bala);
    }

    public void girarTambor(){
        pos = (int)(Math.random() * 10);
    }

    public boolean disparar(){
        if (!tambor.hayBala(pos)) {
            pos++;
            return false;
        }
        return tambor.getBala(pos++).percutar();
    }
    public void descargar(){
        tambor.vaciar();
    }


    @Override
    public String toString(){
        return pos+"\n"+
                tambor.toString();
    }
}