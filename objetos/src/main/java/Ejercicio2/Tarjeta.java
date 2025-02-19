package Ejercicio2;

import Ejercicios.Cuenta;

public class Tarjeta {

    private Cuenta cuenta;
    private float credito;
    private String titular;
    private float creditoInicial;

    public Tarjeta(Cuenta cuenta, float credito, String titular){
        this.cuenta = cuenta;
        this.credito = credito;
        this.titular = titular;
        this.creditoInicial = credito;
    }

    public Cuenta getCuenta(){
        return cuenta;
    }

    public boolean pagarCredito(float cantidad){
        if (cantidad<0) return false;
        if (cantidad > credito) return false;
        credito -= cantidad;
        return true;
    }
    public boolean pagarDebito(float cantidad){
       return cuenta.Reintegro(cantidad);
    }

    public boolean restablecerCredito(){
        if (cuenta.Reintegro(creditoInicial-credito)){
            credito = creditoInicial;
            return true;
        }
        return false;
    }


}
