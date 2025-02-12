package es.ieslavereda;

public class Persona {

    // Atributos o campos
    private float altura;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor/es
    public Persona(float altura, String nombre, String apellidos, int edad){

        this.nombre = nombre;
        this.altura = altura;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Metodos

        // getters
        public String getNombre(){
            return nombre;
        }

        public int getEdad(){
            return edad;
        }

        public float getAltura(){
            return altura;
        }

        // setters
        public void setEdad(int edad){
            if(edad > 0 && edad <120)
                this.edad = edad;
        }

        public void setAltura(float altura){
            this.altura = altura;
        }

        // funcionales
        public void cumplirAnyo(){
            edad++;
        }


        @Override
        public String toString(){
            return "Persona: " + nombre + " " + apellidos + ", edad: " + edad + ", altura: " + altura;
        }


}
