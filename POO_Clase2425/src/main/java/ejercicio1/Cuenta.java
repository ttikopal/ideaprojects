package ejercicio1;

public class Cuenta {

    private String numero;
    private float saldo;
    private String titular;

    public Cuenta(String titular){

        this.titular = titular;
        this.saldo = 0;
    }

    public Cuenta(String titular, float saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean ingreso(float cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            return true;
        }

        return false;
    }

    public boolean reintegro(float cantidad){

        if(cantidad < 0) return false;
        if(cantidad > saldo) return false;

        saldo -= cantidad;
        return true;
    }

    public boolean transferencia(float cantidad, Cuenta cuenta){

        if(reintegro(cantidad))
            return cuenta.ingreso(cantidad);

        return false;
    }

    @Override
    public String toString(){

        return "Titular: " + titular + "\n" +
                "Saldo: " + saldo;
    }
}
