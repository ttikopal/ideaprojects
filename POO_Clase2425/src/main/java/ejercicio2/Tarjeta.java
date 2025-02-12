package ejercicio2;

import ejercicio1.Cuenta;

public class Tarjeta {

    private float creditoInicial;
    private float credito;
    private Cuenta cuenta;
    private String titular;

    public Tarjeta(Cuenta cuenta, float credito, String titular){

        this.cuenta = cuenta;
        this.creditoInicial = credito;
        this.credito = credito;
        this.titular = titular;

    }

    public float getCredito(){
        return credito;
    }

    public float getCreditoInicial(){
        return creditoInicial;
    }

    public Cuenta getCuenta(){
        return cuenta;
    }

    public String getTitular(){
        return titular;
    }

    public boolean pagarCredito(int cantidad){
        if(cantidad < 0) return false;
        if(cantidad > credito) return false;

        credito -= cantidad;
        return true;
    }

    public boolean pagarDebito(int cantidad){

        return cuenta.reintegro(cantidad);
    }

    public boolean restablecerCredito(){
        if(cuenta.reintegro(creditoInicial-credito)){
            credito = creditoInicial;
            return true;
        }
        return false;
    }


}
