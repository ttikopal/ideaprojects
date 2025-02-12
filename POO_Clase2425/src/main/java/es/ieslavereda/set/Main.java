package es.ieslavereda.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        List<Integer> Lista = new ArrayList<>();
//
//        Lista.add(4);
//        Lista.add(4);
//        Lista.add(4);
//        Lista.add(6);
//        Lista.add(6);
//        Lista.add(6);
//
//        System.out.println(Lista);

        Set<Integer> conjunto = new LinkedHashSet<>();
        conjunto.add(5);
        conjunto.add(115);
        conjunto.add(56);
        conjunto.add(33);
        conjunto.add(9);


        System.out.println(conjunto);
    }
}
