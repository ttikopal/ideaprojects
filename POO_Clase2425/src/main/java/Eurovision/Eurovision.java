package Eurovision;

import java.util.*;

public class Eurovision {
    public static void main(String[] args) {


        List<Pais> pais = new ArrayList<>();

        Pais suecia = new Pais("Suecia", "Marcus & Martinus", "Unforgettable");
        Pais ucrania = new Pais("Ucrania", "Alyona Alyona & Jerry Heil", "Teresa & Maria");
        Pais alemania = new Pais("Alemania", "Isaak", "Always on the Run");
        Pais luxemburgo = new Pais("Luxemburgo", "Tali", "Fighter");
        Pais paisesBajos = new Pais("Países Bajos", "Joost Klein", "Europapa");
        Pais israel = new Pais("Israel", "Edén Golán", "Hurricane");
        Pais lituania = new Pais("Lituania", "Silvester Belt", "Luktelk");
        Pais espana = new Pais("España", "Nebulossa", "Zorra");
        Pais estonia = new Pais("Estonia", "5miinust & Puuluup", "(Nendest) Narkootikumidest ei tea me (küll) midagi");
        Pais irlanda = new Pais("Irlanda", "Bambie Thug", "Doomsday Blue");
        Pais letonia = new Pais("Letonia", "Dons", "Hollow");
        Pais grecia = new Pais("Grecia", "Marina Satti", "Zari");
        Pais reinoUnido = new Pais("Reino Unido", "Olly Alexander", "Dizzy");
        Pais noruega = new Pais("Noruega", "Gåte", "Ulveham");
        Pais italia = new Pais("Italia", "Angelina Mango", "La noia");
        Pais serbia = new Pais("Serbia", "Teya Dora", "Ramonda");
        Pais finlandia = new Pais("Finlandia", "Windows95man", "No Rules!");
        Pais portugal = new Pais("Portugal", "Iolanda", "Grito");
        Pais armenia = new Pais("Armenia", "Ladaniva", "Jako");
        Pais chipre = new Pais("Chipre", "Sília Kapsís", "Liar");
        Pais suiza = new Pais("Suiza", "Nemo", "The Code");
        Pais eslovenia = new Pais("Eslovenia", "Raiven", "Veronika");
        Pais croacia = new Pais("Croacia", "Baby Lasagna", "Rim tim tagi dim");
        Pais georgia = new Pais("Georgia", "Nutsa Buzaladze", "Firefighter");
        Pais francia = new Pais("Francia", "Slimane", "Mon Amour");
        Pais austria = new Pais("Austria", "Kaleen", "We Will Rave");

        List<Pais> listaPaises = Arrays.asList(suecia, ucrania, alemania, luxemburgo, paisesBajos, israel, lituania, espana, estonia, irlanda, letonia, grecia, reinoUnido, noruega, italia, serbia, finlandia, portugal, armenia, chipre, suiza, eslovenia, croacia, georgia, francia, austria);

        todosVotan(listaPaises); //Se realiza el sorteo

        System.out.println(getAllPaises(listaPaises)); //Listado de todos los países participantes.

        System.out.println(getPaisesSorted(listaPaises)); //Listado de todos los países por orden alfabético, junto con las votaciones realizadas ordenadas de mayor a menor.

        System.out.println(getSortedPuntuaciones(listaPaises));  // Listado de los países ordenados por puntuaciones recibidas (de mayor a menor).

        System.out.println(getGanador(listaPaises));  // Nombre del país ganador, junto con la puntuación total obtenida y los países que le han votado, junto con los puntos asignados por cada uno de ellos.

        System.out.println(getSortedCanciones(listaPaises));  // Listado de canciones ordenadas por nombre.

        System.out.println(getMax12(listaPaises));  // Obtener el país con número máximo de puntuaciones (12 puntos) y los países que le han otorgado eso 12 puntos.

    }

    public static void todosVotan(List<Pais> paises){
        for (Pais p : paises){
            p.votar(paises);
        }
    }

    public static String getAllVotosEmitidos(List<Pais> paises){

        String aux = "";
        for (Pais p : paises){
            aux +=  p.getVotosEmitidos() + "\n\n\n";
        }
        return aux;
    }

    public static String getAllPaises(List<Pais> paises){
        String aux = "";
        aux +=  "Listado de paises participantes:\n";
        for (Pais p : paises){
            aux += p.getNombre() + "\n";
        }
        return aux;
    }

    public static String getPaisesSorted(List<Pais> paises){

        String aux = "";
        Collections.sort(paises);
        for (Pais p : paises){
            aux += p.getVotosEmitidos() + "\n\n\n";
        }
        return aux;
    }

    public static String getSortedPuntuaciones(List<Pais> paises){
        String aux = "";

        Collections.sort(paises, new Comparator<Pais>() {
            @Override
            public int compare(Pais p, Pais t1) {
                return t1.getPuntuacion()-p.getPuntuacion();
            }
        });
        for (Pais p : paises){
            aux += "\n" +  p.showPuntos() + "\n";
        }
        return aux;
    }

    public static String getSortedCanciones(List<Pais> paises){
        String aux = "";

        Collections.sort(paises, new Comparator<Pais>(){
            @Override
            public int compare(Pais p, Pais t1) {
                return p.getCancion().compareTo(t1.getCancion());
            }
        });

        for (Pais p : paises){
            aux += "Nombre de la canción: " + p.getCancion() + "\n";
        }
        return aux;

    }

    public static String getGanador(List<Pais> paises){
        String aux = "";
        Pais ganador = paises.get(0);

        for (Pais p : paises){
            if (ganador.getPuntuacion() < p.getPuntuacion()){
                ganador = p;
            }
        }
        aux += "\n\nEl ganador de Eurovision ha sido: " + ganador.getNombre() + "\nCon la cantidad de: " + ganador.getPuntuacion() + " puntos.\n\n"
                + ganador.getVotosRecibidos2();
        return aux;
    }

    public static String getMax12(List<Pais> paises){

        String aux = "";
        Pais max = paises.get(0);

        for (Pais p : paises){
            if (p.count12() > max.count12()){
                max = p;
            }
        }
        aux += "El país que ha recibido el máximo de 12 puntos es: " + max.getNombre()+
                "\ny estos son los paises que le han votado: " + max.get12();
        return aux;
    }

}
