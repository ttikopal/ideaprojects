package es.ieslavereda;

public class Main {
    public static void main(String[] args) {


        Persona persona1 = new Persona(1.5f,"jose","palomo",12);
        Persona persona2 = new Persona(1.78f,"asier","lopez",23);


        persona1.setEdad(29);
        persona1.cumplirAnyo();
        System.out.println(persona1);


        Point p1 = new Point(3,4);
        Point p2 = new Point(3,4);

        Line linea = new Line(p1,p2);
        Line linea1 = new Line(p2, new Point(0,0));
        Line linea2 = new Line(new Point(0,0),p1);

        Poligono p = new Poligono(linea,linea1,linea2);
        p.moverArriba(20);
        System.out.println(p1.equals(p2));

    }
}
