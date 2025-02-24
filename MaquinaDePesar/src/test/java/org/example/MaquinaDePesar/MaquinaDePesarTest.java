package org.example.MaquinaDePesar;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MaquinaDePesarTest {

    Cliente vicent = new Cliente("Vicent", "López", LocalDate.of(1973,2,14),"123456Z",Sexo.HOMBRE,178);


    double peso=81.3;
    IMC imc = IMC.SOBREPESO;
GrasaCorporal gc = GrasaCorporal.OBESOS;

    @Test
    void calcularNumIMC() {

        double esperado =  (peso/(Math.pow((vicent.getAltura()/100.0),2)));
        double resultado = Peso.calcularNumIMC(vicent,peso);

        assertEquals(esperado,resultado);

    }

    @Test
    void calcularIMC() {

        double r = Peso.calcularNumIMC(vicent,peso);

        IMC esperado = imc;

        IMC resultado = Peso.calcularIMC(r);

        assertEquals(esperado,resultado);

    }

    @Test
    void calcularPorcentajeGrasaCorporal() {

        double resultado = Peso.calcularPorcentajeGrasaCorporal(vicent,Peso.calcularNumIMC(vicent,peso));

        double esperado = 25.94542078897054;

        assertEquals(resultado,esperado);


    }

    @Test
    void calcularRangoGrasaCorporal() {

        double d = Peso.calcularNumIMC(vicent,peso);
        GrasaCorporal esperado = gc;
        GrasaCorporal res = Peso.calcularRangoGrasaCorporal(vicent,d);

        assertEquals(res, esperado);

    }

    @Test
    void calcularTasaMetabolicaBasal() {


        double esperado = 1670.5;
        double resultado = Peso.calcularTasaMetabolicaBasal(vicent,peso);

        assertEquals(resultado, esperado);


    }

    @Test
    void calcularPesoAjustado() {

        double esperado = 75.42;

        double resultado = Peso.calcularPesoAjustado(vicent,peso);

        assertEquals(esperado,resultado);

    }
}