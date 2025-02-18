package es.ieslavereda.Streams;

import java.util.*;

public class Pais implements Comparable<Pais>{

    private String nombre;
    private String grupo;
    private String cancion;
    private int puntuacion;
    private Map<Pais,Integer> votosEmitidos;
    private Map<Pais,Integer> votosRecibidos;

    public Pais(String nombre, String grupo, String cancion) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.cancion = cancion;
        puntuacion = 0;
        votosEmitidos = new LinkedHashMap<Pais, Integer>();
        votosRecibidos = new LinkedHashMap<Pais, Integer>();

    }

    public void votar(List<Pais> paises) {
        int[] votos = {12,10,8,7,6,5,4,3,2,1};

        List<Pais> copia = new ArrayList<>(paises);
        copia.remove(this);

        Collections.shuffle(copia);
        for (int i = 0; i<votos.length;i++){
            votosEmitidos.put(copia.get(i),votos[i]);
            copia.get(i).sumarPuntuaciones(votos[i]);
            copia.get(i).recibirVoto(this,votos[i]);
        }
    }

    public void recibirVoto(Pais paisVotante, int voto){
        votosRecibidos.put(paisVotante,voto);
    }

    private void sumarPuntuaciones(int puntuacion) {
        this.puntuacion += puntuacion;
    }

    public String showPuntos(){
        return nombre + " tiene: " + puntuacion + " puntos.";
    }

    public Map<Pais,Integer> getVotosRecibidos(){
        return votosRecibidos;
    }

    public String get12(){

        String aux2 = "";
        Map<Pais,Integer> aux = new LinkedHashMap<Pais, Integer>();

        for (Pais p : votosRecibidos.keySet()){
            if (votosRecibidos.get(p) == 12){
                aux.put(p,votosRecibidos.get(p));
            }
        }
        for (Pais p : aux.keySet()){
            aux2 += "\n" + p.getNombre() + " con: " + aux.get(p) + " puntos" + "\n";
        }

        return aux2;
    }

    public int count12(){
        int c = 0;
        for (Integer i : votosRecibidos.values()){
            if (i == 12){
                c++;
            }
        }
        return c;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getCancion() {
        return cancion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVotosRecibidos2(){
        String aux = "";

        for (Pais k : votosRecibidos.keySet()){
            aux += k.getNombre() + " ha votado con " + votosRecibidos.get(k) + " puntos.\n";
        }
        return aux;

    }

    public String getVotosEmitidos() {
        String aux = "";
        aux += "\n" + this.nombre + ": \n";
        for (Pais k : votosEmitidos.keySet()){
            aux += k.getNombre() + " con " + votosEmitidos.get(k) + " puntos\n";
        }
        return aux;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return nombre.equals(pais.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "\nPais:  " + nombre +
                "\nGrupo: " + grupo +
                "\nCancion: " + cancion;
    }

    @Override
    public int compareTo(Pais pais) {
        return nombre.compareTo(pais.nombre);
    }
}
