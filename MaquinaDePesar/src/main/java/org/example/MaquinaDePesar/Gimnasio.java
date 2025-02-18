package org.example.MaquinaDePesar;

import java.time.LocalDate;

public class Gimnasio {
    public static void main(String[] args) {
        Cliente vicent = new Cliente("Vicent", "López", LocalDate.of(1973,2,14),"123456Z",Sexo.HOMBRE,178);
        Cliente pepa = new Cliente("Pepa", "Navarro", LocalDate.of(2001,3,19),"918251X",Sexo.MUJER,188);
        Cliente luna = new Cliente("Luna", "Cano", LocalDate.of(2003,3,31),"629125C",Sexo.MUJER,140);
        Cliente blanca = new Cliente("Blanca", "Romero", LocalDate.of(1997,4,29),"91074316P",Sexo.MUJER);
        Cliente manel = new Cliente("Manel", "García", LocalDate.of(1967,6,28),"1922611K",Sexo.HOMBRE);
        blanca.setAltura(150);
        manel.setAltura(172);

        System.out.println(vicent);
        vicent.anyadirPeso(81.3);
        vicent.anyadirPeso(80.3,LocalDate.of(2024,11,15));
        vicent.anyadirPeso(82.3,LocalDate.of(2024,10,15));

        System.out.println(vicent);
        System.out.println(vicent.historicosToString());

        pepa.anyadirPeso(75.9);
        pepa.anyadirPeso(80.4,LocalDate.of(2024,11,15));
        pepa.anyadirPeso(85.4,LocalDate.of(2024,10,15));
        System.out.println(pepa);
        System.out.println(pepa.historicosToString());


        luna.anyadirPeso(77.5);
        blanca.anyadirPeso(51.2);
        manel.anyadirPeso(72.5);
        System.out.println(luna);
        System.out.println(blanca);
        System.out.println(manel);


    }
}