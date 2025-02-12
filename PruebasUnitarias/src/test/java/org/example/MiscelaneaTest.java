package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiscelaneaTest {

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
    }

    @Test
    void getMayor() {
    }

    @Test
    void getMaximo() {
    }

    @Test
    void getElemento() {
    }

    @Test
    void factorial() {
    }

    @Test
    void esPrimo() {
    }

    @Test
    void areaCirculo() {
    }

    @Test
    void areaTriangulo() {
    }

    @Test
    void areaCuadrado() {
    }

    @Test
    void decimalABinario() {
    }
}