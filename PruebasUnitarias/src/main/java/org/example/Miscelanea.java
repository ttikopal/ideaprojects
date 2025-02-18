package org.example;

public class Miscelanea {

    /**
     * Suma dos n�meros.
     * @param num1 Primer operando
     * @param num2 Segundo operando
     * @return La suma de ambos operandos
     */
    public static int suma(int num1, int num2)
    {
        int res = num1 + num2;
        return res;
    }

    /**
     * Genera un n�mero entero aleatorio comprendido entre dos n�meros.
     * @param num1 L�mite inferior
     * @param num2 L�mite superior
     * @return N�mero entero aleatorio comprendido entre los dos l�mites
     */
    public static int generaAleatorioEntre(int num1, int num2)
    {
        return ((int)Math.floor(Math.random()*(num2-num1)+num1));
    }

    /**
     * Concatena dos cadenas.
     * @param cad1 Primera cadena
     * @param cad2 Segunda cadena
     * @return La concatenaci�n de ambas cadenas
     */
    public static String concatena(String cad1, String cad2)
    {
        String res = cad1 + cad2;
        return res;
    }

    /**
     * Dado dos n�meros enteros, calcula cu�l es el mayor.
     * @param num1 Primer n�mero
     * @param num2 Segundo n�mero
     * @return El valor del n�mero mayor
     */
    public static int getMayor(int num1, int num2)
    {
        if (num2>num1)
            return num2;
        else
            return num1;
    }

    /**
     * Dado un vector de n�meros enteros, localiza el valor m�s alto.
     * @param vector Vector donde buscar
     * @return El valor del n�mero m�s alto
     */
    public static int getMaximo(int vector[])
    {
        int res = vector[0];
        for(int i=0;i<vector.length;i++)
        {
            if(vector[i]>res)
                res = vector[i];
        }
        return res;
    }

    /**
     * Dado un vector de n�meros enteros, devuelve el valor de la posici�n especificada.
     * @param vector Vector donde se encuentran los n�meros enteros
     * @param pos Posici�n del elemento
     * @return El elemento que ocupa la posici�n dada
     */
    public static int getElemento(int vector[], int pos)
    {
        int res = vector[pos];
        return res;
    }

    /**
     * Calcula el factorial de un n�mero.
     * @param num Operando
     * @return El factorial del operando dado
     */
    public static int factorial(int num)
    {
        int res=num;
        for(int cont=(num-1);cont>0;cont--){
            res=res*cont;
        }
        return res;
    }

    /**
     * Indica si un n�mero es primo.
     * @param numero N�mero a analizar
     * @return true si es primo, false si no lo es
     */
    public static boolean esPrimo (int numero){

        if (numero<=1){
            return false;
        }
        int cont=0;
        for (int divisor=(int)Math.sqrt(numero);divisor>1;divisor--){
            if (numero%divisor==0){
                cont+=1;
            }
        }
        if (cont>=1){
            return false;
        }else{
            return true;
        }
    }

    /**
     * Calcula el �rea de un c�rculo.
     * @param radio Radio del c�rculo
     * @return El �rea del c�rculo con el radio indicado
     */
    public static double areaCirculo(int radio)
    {
        return Math.pow(radio, 2)*Math.PI;
    }

    /**
     * Calcula el �rea de un tri�ngulo.
     * @param base Base del tri�ngulo
     * @param altura Altura del tri�ngulo
     * @return El �rea del tri�ngulo con las caracter�sticas dadas
     */
    public static double areaTriangulo(int base, int altura)
    {
        return base*altura/2;
    }

    /**
     * Calcula el �rea de un cuadrado.
     * @param lado Lado del cuadrado
     * @return El �rea del cuadrado de lado indicado
     */
    public static double areaCuadrado(int lado)
    {
        return lado*lado;
    }

    /**
     * Convierte un n�mero entero a binario.
     * @param num N�mero a convertir
     * @return Cadena de texto con su valor en binario
     */
    public static String decimalABinario(int num)
    {
        String res="";
        String bit;
        for(int i=num;i>0;i/=2){
            if(i%2==1){
                bit="1";
            }else{
                bit="0";
            }
            res=bit+res;
        }
        return res;
    }

}