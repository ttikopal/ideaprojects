package ejercicio5;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion suma(Fraccion fraccion){

        if(denominador == fraccion.denominador){
            return new Fraccion(numerador + fraccion.numerador, denominador);
        }

        return new Fraccion(
            numerador*fraccion.denominador + fraccion.numerador*denominador,
            denominador*fraccion.denominador
        );
    }

    public Fraccion suma(int numero){
        return suma(new Fraccion(numero, 1));
    }

    public Fraccion multiplica(Fraccion fraccion){
        return new Fraccion(numerador*fraccion.numerador, denominador*fraccion.denominador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
