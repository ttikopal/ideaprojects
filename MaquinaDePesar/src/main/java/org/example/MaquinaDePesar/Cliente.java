package org.example.MaquinaDePesar;

/**
 * Necesitaremos almacenar para un cliente su nombre, apellidos, fecha de nacimiento (de tipo LocalDate), DNI, sexo, altura en centímetros (sin decimales) y un histórico de sus pesos.
 */

import java.time.LocalDate;
import java.util.Arrays;

public class Cliente {
    //Atributos
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String DNI;
    private Sexo sexo;
    private int altura;
    private Peso[] historicoPesos;

    //Constructores
    /* Los clientes se pueden dar de alta bien sólo con nombre, apellidos, fecha de nacimiento, DNI y sexo, bien con todos los datos antes facilitados.
      Cuando un cliente se da de alta, se crea su histórico de pesos sin pesos. */
    public Cliente(String nombre, String apellidos, LocalDate fechaNacimiento, String DNI, Sexo sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.sexo = sexo;
        this.altura = 165;
        historicoPesos = new Peso[0];
    }

    public Cliente(String nombre, String apellidos, LocalDate fechaNacimiento, String DNI, Sexo sexo, int altura) {
        this(nombre, apellidos, fechaNacimiento, DNI, sexo);
        this.altura = altura;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getAltura() {
        return altura;
    }

    public Peso[] getHistoricoPesos() {
        return historicoPesos;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * Añade un elemento en el Array
     */
    private void anyadirElementoArray(){
        historicoPesos = Arrays.copyOf(historicoPesos,historicoPesos.length+1);
    }

    /**
     *  Cada vez que un cliente se pesa, se añadirá su peso (y todas sus características) al histórico de pesos.
     * @param peso
     */
    public void anyadirPeso(double peso){
        anyadirElementoArray();
        historicoPesos[historicoPesos.length-1] = new Peso(this, peso);
    }

    /**
     * Cada vez que un cliente se pesa, se añadirá su peso (y todas sus características) al histórico de pesos.
     * @param peso
     * @param diaPeso
     */
    public void anyadirPeso(double peso, LocalDate diaPeso){
        anyadirElementoArray();
        historicoPesos[historicoPesos.length-1] = new Peso(this, peso, diaPeso);
    }

    /**
     * Pero también se podrá imprimir por pantalla los datos del cliente y su histórico de pesos.
     * @return datos del cliente y su histórico de pesos
     */
    public String historicosToString() {
        return "Cliente con DNI: " + DNI +" nombre completo: " + nombre + ' ' + apellidos + " con fecha de nacimiento: " + fechaNacimiento +
                " sexo " + sexo + " y altura: " + altura + "\n pesos: " + Arrays.toString(historicoPesos);
    }

    /**
     *  Por defecto se imprimirá por pantalla los datos del cliente y su último peso.
     * @return datos del cliente y último peso
     */
    @Override
    public String toString() {
        return "Cliente con DNI: " + DNI +" nombre completo: " + nombre + ' ' + apellidos + " con fecha de nacimiento: " + fechaNacimiento +
                " sexo " + sexo + " y altura: " + altura + "\n último peso: " + ((historicoPesos.length==0)?"sin peso registrado aún":historicoPesos[historicoPesos.length-1]);
    }

    /**
     * Un cliente es igual a otro cliente sí y sólo sí tienen el mismo DNI.
     * @return si un cliente es igual a otro
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Cliente))
            return false;
        Cliente cliente = (Cliente) obj;
        return this.DNI.equals(cliente.getDNI());
    }
}