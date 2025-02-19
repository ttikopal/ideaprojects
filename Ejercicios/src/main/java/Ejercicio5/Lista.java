package Ejercicio5;

public class Lista {
    private int size;
    private Nodo head;

    public Lista(){
        size = 0;
        head = null;
    }


    public void addHead(String cliente){

        Nodo n = new Nodo(cliente);

        if (head == null){
            head = n;
        } else {
            n.setNext(head);
            head = n;
        }
        size++;
    }

    public String removeHead(){
        if (head== null) return null;

        Nodo aux = head;
        head = head.next;
        size--;
        return aux.cliente;
    }

    public String removeTail(){

        if (head== null) return null;
        String cliente;
        if (head.next==null){
            cliente = head.cliente;
            head = null;
        }else{

            Nodo aux = head;

            while(aux.next.next!=null){
                aux = aux.next;
            }
            cliente = aux.next.cliente;
            aux.next=null;
        }
        size--;
        return cliente;
    }


    public boolean contains(String cliente){

        if (head == null){
            return false;
        } else {
            Nodo aux = head;
            while (aux!=null){
                if (aux.cliente==cliente){
                    return true;
                }
                aux = aux.next;
            }
            return false;
        }
    }

    public void addTail(String cliente){

        Nodo n = new Nodo(cliente);

        if (head == null){
            head = n;
        } else {
            Nodo aux = head;
            while (aux.next!=null){
                aux=aux.next;
            }
            aux.next=n;
        }
        size++;

    }


    @Override
    public String toString() {
        String text = "Size: " + size +"\n"+
                "Nodo: ";

        Nodo aux = head;

        while (aux != null){
            text += aux.getInfo()+ " ";
            aux = aux.next;
        }
        return text;
    }

     private class Nodo {

        private String cliente;
        private Nodo next;

        public Nodo(String cliente){
            this.cliente = cliente;
            this.next = null;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }

        public String getInfo() {
            return cliente;
        }

        public Nodo getNext() {
            return next;
        }
    }

}
