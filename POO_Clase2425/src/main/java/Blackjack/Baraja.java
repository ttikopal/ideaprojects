package Blackjack;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
*
* array de cartas
* constructor de baraja cartas
* metodo toString para mostrar las cartas de la baraja
*
*/
public class Baraja {

   private Carta[] cartas;

   public Baraja(){
       int i = 0;
      cartas = new Carta[Palo.values().length*Valor.values().length];

      for(Palo p : Palo.values()){
          for(Valor v : Valor.values()){

              cartas[i++] = new Carta(v, p);
          }
      }

   }

   public Carta obtenerCartaSuperior(){

       if(cartas.length == 0) return null;

       Carta c = cartas[0];

       Carta[] aux = new Carta[cartas.length-1];

       for(int i = 0; i < aux.length; i++){
           aux[i] = cartas[i+1];
       }

       cartas = aux;

       return c;
   }

   public Carta obtenerCartaInferior(){

       if(cartas.length == 0) return null;

       Carta c = cartas[cartas.length-1];

       Carta[] aux = new Carta[cartas.length -1];

       for(int i = 0; i < aux.length; i++){
           aux[i] = cartas[i];
       }

       cartas = aux;

       return c;
   }

   public void cortarBaraja(){

       int corte = (int)(Math.random()*cartas.length);

       Carta[] aux = new Carta[cartas.length];

       int j = 0;
       for(int i = corte; i < cartas.length; i++){
           aux[j++] = cartas[i];
       }

       for(int i = 0; i < corte; i++){
           aux[j++] = cartas[i];
       }

       cartas = aux;
   }

   public void barajar(){

       Collections.shuffle(Arrays.asList(cartas));
   }




   @Override
   public String toString(){
       return Arrays.toString(cartas);
   }

}
