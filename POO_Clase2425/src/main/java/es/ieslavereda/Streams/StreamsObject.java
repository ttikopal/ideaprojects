package es.ieslavereda.Streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StreamsObject {
    public static void main(String[] args) {

        guardarPais();





    }


    public static void guardarPais(){
        Pais p = new Pais("España","Melody","Zorra");
        Pais p2 = new Pais("Francia","Melody","Zorra");


        try( ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("ficheroObjetos"))){

            os.writeObject(p);
            os.writeObject(p2);
            os.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Pais> cargarPais() {
        Pais p;
        List<Pais> paises = new ArrayList<>();
        try (ObjectInputStream s = new ObjectInputStream(new FileInputStream("ficheroObjetos"))){

            Object o;
            while ((o = s.readObject()) != null){
                paises.add((Pais)o);
            }


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return paises;

    }
}
