package org.example.MaquinaDePesar;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MaquinaDePesarTest {


    Cliente chico = new Cliente("Sujeto","Numero 1", LocalDate.of(2000,12,28),"12345678J",Sexo.HOMBRE,180);
    Cliente chica = new Cliente("Sujeta","Numero 1", LocalDate.of(2000,12,28),"12345678J",Sexo.MUJER,165);

    double peso=70;
    int altura_chico= chico.getAltura();
    int altura_chica= chica.getAltura();

    @Test
    void calcularNumIMC() {

        double esperado =  (peso/(Math.pow((altura_chica/100.0),2)));
        double resultado = Peso.calcularNumIMC();

        assertEquals(esperado,resultado);

    }

    @Test
    void calcularIMC() {
    }

    @Test
    void calcularPorcentajeGrasaCorporal() {
    }

    @Test
    void calcularRangoGrasaCorporal() {
    }

    @Test
    void calcularTasaMetabolicaBasal() {
    }

    @Test
    void calcularPesoAjustado() {
    }
}