package org.example.MaquinaDePesar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * La máquina de pesar almacenará para cada cliente su peso (es en kilogramos y por tanto tendrá decimales), el día del pesaje (usa la clase LocalDate),
 * su IMC (tanto como valor calculado como el rango al que pertenece), porcentaje de grasa corporal (tanto como valor calculado como el rango al que pertenece),
 * su tasa metabólica basal y su peso ajustado.
 */
public class Peso {
    //Atributos
    private static Cliente cliente;
    private static double peso;
    private double pesoAjustado;
    private LocalDate diaPesaje;
    private IMC imc;
    private double calculadoIMC;
    private double calculadoPorcentajeGrasaCorporal;
    private GrasaCorporal grasaCorporal;
    private double tasaMetabolicaBasal;

    /**
     * La máquina de pesar necesita el cliente y el peso para almacenar toda la información (utilizará el día actual)
     * @param cliente
     * @param peso
     */
    public Peso(Cliente cliente, double peso){
        this.cliente = cliente;
        this.peso = 70;
        this.diaPesaje = LocalDate.now();
        this.calculadoIMC = calcularNumIMC();
        this.imc = calcularIMC();
        this.calculadoPorcentajeGrasaCorporal = calcularPorcentajeGrasaCorporal();
        this.grasaCorporal = calcularRangoGrasaCorporal();
        this.tasaMetabolicaBasal = calcularTasaMetabolicaBasal();
        this.pesoAjustado = calcularPesoAjustado();
    }

    /**
     *  o bien el cliente, el peso y la fecha del pesaje.
     * @param cliente
     * @param peso
     * @param diaPesaje
     */
    public Peso(Cliente cliente, double peso, LocalDate diaPesaje){
        this(cliente,peso);
        this.diaPesaje = diaPesaje;
    }

    /**
     * IMC: se calcula de la siguiente forma: peso en kg/(altura^2). La altura está en metros).
     * @return imc calculado
     */
    public static double calcularNumIMC(){
        return (peso/(Math.pow((cliente.getAltura()/100.0),2)));
    }

    /**
     * IMC según rango:
     * Bajo peso (IMC <18,5)
     * Rango normal (IMC = 18,5-24,99)
     * Sobrepeso (IMC = 25-29,99)
     * Obeso (IMC >= 30,00)
     * @return RangoIMC
     */
    public IMC calcularIMC(){
        if(this.calculadoIMC < 18.5)
            return IMC.BAJO;
        else if (this.calculadoIMC < 25)
            return IMC.RANGO_NORMAL;
        else if (this.calculadoIMC < 30)
            return IMC.SOBREPESO;
        return IMC.OBESO;
    }

    /**
     * Porcentaje de grasa corporal: se calcula como:  –44.988 + (0.503 × edad) + (10.689 × sexo) + (3.172 × IMC) – (0.026 × IMC²) + (0.181 × IMC × sexo)
     * – (0.02 × IMC × edad) – (0.005 × IMC² × sexo) + (0.00021 × IMC² × edad). El sexo es 0 para hombres y 1 para mujeres.
     */
    public double calcularPorcentajeGrasaCorporal(){
        int edad = getEdad();

        return (-44.988+(0.503*edad) +(10.689*cliente.getSexo().ordinal())+(3.172*calculadoIMC)-(0.026*Math.pow(calculadoIMC,2))
                +(0.181*calculadoIMC*cliente.getSexo().ordinal())-(0.02*calculadoIMC*edad)-(0.005*Math.pow(calculadoIMC,2)*cliente.getSexo().ordinal())
                + (0.00021*Math.pow(calculadoIMC,2)*edad));
    }

    /**
     * Calcular la edad
     * @return edad como entero
     */
    private int getEdad() {
        return (int) ChronoUnit.YEARS.between(cliente.getFechaNacimiento(), LocalDate.now());
    }

    /**
     * Porcentaje de grasa corporal: rangos:
     *  Grasa escasa: <10 % (mujeres), <2 % (hombres);
     * 	Grasa esencial: 10-13 % (mujeres), 2-5 % (hombres);
     * 	Deportistas: 14-20 % (mujeres), 6-13 % (hombres);
     * 	Fitness: 21-24 % (mujeres), 14-17 % (hombres);
     * 	Promedio: 25-31 % (mujeres), 18-24 % (hombres);
     * 	Obesos: 32 %+ (mujeres), 25 %+ (hombres).
     */
    public GrasaCorporal calcularRangoGrasaCorporal(){
        if(cliente.getSexo()==Sexo.HOMBRE){
            if(calculadoPorcentajeGrasaCorporal<2)
                return GrasaCorporal.GRASA_ESCASA;
            else if(calculadoPorcentajeGrasaCorporal<6)
                return GrasaCorporal.GRASA_ESENCIAL;
            else if(calculadoPorcentajeGrasaCorporal<14)
                return GrasaCorporal.DEPORTISTAS;
            else if(calculadoPorcentajeGrasaCorporal<18)
                return GrasaCorporal.FITNESS;
            else if(calculadoPorcentajeGrasaCorporal<25)
                return GrasaCorporal.PROMEDIO;
            return GrasaCorporal.OBESOS;
        }
        if(calculadoPorcentajeGrasaCorporal<10)
            return GrasaCorporal.GRASA_ESCASA;
        else if(calculadoPorcentajeGrasaCorporal<14)
            return GrasaCorporal.GRASA_ESENCIAL;
        else if(calculadoPorcentajeGrasaCorporal<21)
            return GrasaCorporal.DEPORTISTAS;
        else if(calculadoPorcentajeGrasaCorporal<25)
            return GrasaCorporal.FITNESS;
        else if(calculadoPorcentajeGrasaCorporal<32)
            return GrasaCorporal.PROMEDIO;
        return GrasaCorporal.OBESOS;
    }

    /**
     * Tasa metabólica basal: La TMB se calcula como: 10 × peso (kg) + 6.25 × altura (cm) - 5 × edad (años) + s (kcal/día)
     * donde s es +5 para hombres y -161 para mujeres.
     */
    public double calcularTasaMetabolicaBasal(){
        int edad = getEdad();
        return 10*peso+6.25*cliente.getAltura()-5*edad+((cliente.getSexo()==Sexo.HOMBRE)?5:-161);
    }

    /**
     * Peso ajustado: para calcular el Peso ajustado, se utiliza la siguiente fórmula: PA= PI + 0.4 × (PR - PI)
     * donde:
     * o	PA es el peso corporal ajustado;
     * o	PR es el peso corporal real;
     * o	PI es el peso corporal ideal
     * @return
     */
    public double calcularPesoAjustado(){
        double pesoIdeal = calcularPesoIdeal();
        return pesoIdeal+0.4*(peso-pesoIdeal);
    }

    /**
     * PI es el peso corporal ideal que se calcula como
     *  Para los hombres: 52 kg + 0.75 kg por cada centímetro por encima de 152cm
     *  Para las mujeres: 49 kg + 0.67 kg por cada centímetro por encima de 152cm
     * @return
     */
    private double calcularPesoIdeal(){
        int diferenciaAltura= cliente.getAltura()-152;

        if(cliente.getSexo()==Sexo.HOMBRE)
            return 52+0.75*(diferenciaAltura);
        return 49+0.67*(diferenciaAltura);
    }

    @Override
    public String toString(){
        return "En el dia: " + diaPesaje + " tiene peso: " + peso + " el peso ajustado es: " + pesoAjustado +
                " su IMC está en el rango de " + imc + " y su rango de grasa corporal en " + grasaCorporal + ", finalmente su tasa metabólica basal es de " +tasaMetabolicaBasal + "kcal/dia";
    }

}