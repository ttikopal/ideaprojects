package es.ieslavereda.EjercicioHerencia5ConListas;

public class ListaSE<T> {      //ListaSE = listas enlazadas

    private int size;
    private Nodo<T> head;

    public ListaSE(){
        size = 0;
        head = null;
    }

    public void addHead(T num){

        Nodo<T> n = new Nodo<>(num);

        if(head == null){
            head = n;
        }else{
            n.next = head;
            head = n;
        }

        size++;
    }

    public T removeHead(){

        if(head == null) return null;

       Nodo<T> aux = head;

       head = head.next;
       size--;

       return aux.info;
    }

    public T removeTail(){

        //lista vacía
        if(head == null) return null;


        T info;
        // Solo 1 elemento
        if(head.next == null){
            info = head.info;
            head = null;

        }else{  // 2 elementos o mas

            Nodo<T> aux = head;

            while(aux.next.next != null){
                aux = aux.next;
            }

            info = aux.next.info;
            aux.next = null;

        }

        size--;
        return info;
    }

    public boolean contains(T num){
        if(head == null) return false;

        Nodo<T> aux = head;
        boolean encontrado = false;

        while(!encontrado && aux != null){
            encontrado = aux.info == num;
            aux = aux.next;

        }

        return encontrado;
    }



    public void addTail(T num){

        Nodo<T> n = new Nodo(num);

        if(head == null){
            head = n;
        }else{
            Nodo aux = head;

            while(aux.next != null){
                aux = aux.next;
            }

            aux.next = n;
        }

        size++;
    }

    @Override
    public String toString() {
        String text = "Size: " + size + "\n" +
                    "Nodo: ";

        Nodo<T> aux = head;

        while(aux != null){
            text += aux.getInfo() + " ";
            aux = aux.next;
        }

        return text;
    }

    private class Nodo<T> {

        private T info;
        private Nodo<T> next;

        public Nodo(T info){
            this.info = info;
            this.next = null;

        }

        public T getInfo(){
            return info;
        }

        public Nodo getNext(){
            return next;
        }

        public void setNext(Nodo next){
            this.next = next;
        }

    }
}
