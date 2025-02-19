package ejerexamen;

public class enskil {
    public static void main(String[] args) {

        System.out.println("Introduce el texto: ");
        String text = entrada.getTexto();
        System.out.println("Introduce el sufijo: ");
        String suffix = entrada.getTexto();

        String aux = "";

        for (int i = (text.length())-suffix.length(); i<=text.length()-1;i++){
            aux += text.charAt(i);
        }

        if (aux.equals(suffix)){
            System.out.println("Está bien el sufijo");
        } else System.out.println("No esta bien");
    }
}
