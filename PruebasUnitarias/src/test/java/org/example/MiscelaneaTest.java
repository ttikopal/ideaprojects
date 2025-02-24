package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiscelaneaTest {

    int a,b,espero,resultado;
    double expResult, result;
    int[] vector ={8,9,1,10,3,13};



    @Test
    void suma() {
        int a = 43;
        int b = 30;
        int suma = Miscelanea.suma(a,b);
        assertEquals(73,suma);
    }

    @Test
    void generaAleatorioEntre() {
        int a = 4;
        int b = 7;
        boolean funciona = true;
        int i = 0;
        while (i < 1000 && funciona) {
            int resultado = Miscelanea.generaAleatorioEntre(a, b);
            if (!(resultado <= 7 && resultado >= 4)) {
                funciona = false;
            }
            i++;
        }
        assertTrue(funciona);
    }
    @Test
    void concatena() {

        String cad1="gato";
        String cad2="pardo";
        String cadEsp="gatopardo";
        String cadres=Miscelanea.concatena(cad1,cad2);
        assertEquals(cadEsp,cadres);
    }

    @Test
    void getMayor() {

        a = 10;
        b = 20;
        int esperado = b;
        int resultado = Miscelanea.getMayor(a,b);

        assertEquals(esperado,resultado);

    }

    @Test
    void getMaximo() {

        int esperado = 13;
        int resultado = Miscelanea.getMaximo(vector);

        assertEquals(resultado,esperado);


    }

    @Test
    void getElemento() {
        a=4;
        espero=3;
        resultado=Miscelanea.getElemento(vector,a);

        assertEquals(espero,resultado);
    }

    @Test
    void getElemento2() {
        a=4;
        espero=3;

        try {
            resultado=Miscelanea.getElemento(vector,a);
            fail("El método getElemento debería haber fallado");
        } catch (Exception e){
            System.out.println("Ha funcionado la excepción getElemento");
        }

        assertEquals(espero,resultado);
    }

    @Test
    void factorial() {

        int esperado = 6;

        int resultado = Miscelanea.factorial(3);

        assertEquals(esperado,resultado);


    }

    @Test
    void esPrimo() {
        a=12;

        boolean espero = Miscelanea.esPrimo(a);
        assertFalse(espero);
    }

    @Test
    void esPrimo2() {
        a=13;

        boolean espero = Miscelanea.esPrimo(a);
        assertTrue(espero);
    }

    @Test
    void areaCirculo() {

        a=4;
        expResult=Math.pow(a,2)*Math.PI;
        result=Miscelanea.areaCirculo(a);
        assertEquals(expResult,result);

    }

    @Test
    void areaTriangulo() {

        a = 20;
        b= 30;


        double esperado = 300.0;

        double resultado = Miscelanea.areaTriangulo(a,b);

        assertEquals(esperado,resultado);


    }

    @Test
    void areaCuadrado() {

        a = 20;
        b= 30;


        double esperado = 300.0;

        double resultado = Miscelanea.areaTriangulo(a,b);

        assertEquals(esperado,resultado);




    }

    @Test
    void decimalABinario() {

        String esperado = "100101100";

        String resultado = Miscelanea.decimalABinario(300);

        assertEquals(esperado,resultado);



    }
}