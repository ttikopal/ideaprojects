package Ejercicios;

public class Cuenta {

    private float saldo;
    private String propietario;
    private String cuenta;

    public Cuenta(String propietario){
        this.saldo = 0;
        this.propietario = propietario;
    }

    public Cuenta(String propietario, float saldo){
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setPropietario(String propietario){
        this.propietario = propietario;
    }

    public String getPropietario(){
        return propietario;
    }
    public void setCuenta(String cuenta){
        this.cuenta = cuenta;
    }
    public String getCuenta(){
        return cuenta;
    }

    public boolean Ingreso(float cantidad){
        if (cantidad<=0) return false;
        saldo += cantidad;
        return true;
    }

    public boolean Reintegro(float cantidad){
        if (cantidad<0) return false;
        if (cantidad>saldo) return false;

        saldo-=cantidad;
        return true;
    }
    public boolean Transferencia(float cantidad, Cuenta cuenta){

        if (Reintegro(cantidad))
            return cuenta.Ingreso(cantidad);

        return false;
    }

    @Override
    public String toString(){
        return "Titular: " + propietario + "\n" + "Saldo: " + saldo + "\n";
    }

}
