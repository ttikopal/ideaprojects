package ruletaRusa;

public class Pistola {

    private Tambor tambor;
    private int pos;

    public Pistola(){
        tambor = new Tambor();
        pos = ((int)Math.random()) * tambor.getSize();
    }

    public void recargar(){
        tambor.recargar();
    }

    public void recargar(Bala bala){
        tambor.recargar(0, bala);
    }

    public void girarTambor(){
        pos = (int)(Math.random()* tambor.getSize());
    }

    public boolean disparar(){
        if(!tambor.hayBalaEn(pos)){
            pos++;
            return false;
        }

        return tambor.getBalaAt(pos++).percutar();
    }

    @Override
    public String toString(){
        return pos + "\n" + tambor.toString();
    }

}
