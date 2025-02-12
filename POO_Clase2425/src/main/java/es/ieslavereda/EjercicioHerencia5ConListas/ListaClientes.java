package es.ieslavereda.EjercicioHerencia5ConListas;

public class ListaClientes {
    private int size;
    private Nodo head;

    public ListaClientes(){
        size = 0;
        head = null;
    }


    public void addHeadCliente(String cliente){

        Nodo n = new Nodo(cliente);

        if(head == null){
            head = n;
        }else{
            n.next = head;
            head = n;
        }

        size++;
    }

    public void addTailCliente(String cliente){

        Nodo n = new Nodo(cliente);

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
    public String removeHead(){

        if(head == null) return null;

        Nodo aux = head;

        head = head.next;
        size--;

        return aux.cliente;
    }

    public void remove(String cliente){
        if(head != null){

            if(head.cliente.equalsIgnoreCase(cliente)){
                removeHead();
            } else if(head.next != null){
                Nodo aux1 = head;
                Nodo aux2 = head.next;
                boolean encontrado = false;

                while(aux2 != null && !encontrado){

                    if(aux2.cliente.equalsIgnoreCase(cliente)){
                        encontrado = true;
                    }else{
                        aux1=aux2;
                        aux2=aux2.next;
                    }
                }

                if(encontrado){
                    aux1.next = aux2.next;
                }
            }

        }
    }

    public boolean contains(String cliente){
        if(head == null) return false;

        Nodo aux = head;
        boolean encontrado = false;

        while(!encontrado && aux != null){
            encontrado = aux.cliente.equalsIgnoreCase(cliente);
            aux = aux.next;
        }

        return encontrado;
    }

    @Override
    public String toString() {
        String text = "Cantidad: " + size + "\n" +
                "Clientes: ";

        Nodo aux = head;
        while(aux != null){
            text += "\n" + "\n" + aux.getCliente() + " ";
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

        public String getCliente(){
            return cliente;
        }

        public Nodo getNext(){
            return next;
        }

        public void setNext(Nodo next){
            this.next = next;
        }

    }
}
