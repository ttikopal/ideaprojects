package es.ieslavereda.EjercicioHerencia5ConListas;

public class ListaVendedores {

    private int size;
    private Nodo head;

    public ListaVendedores(){
        size = 0;
        head = null;
    }


    public void addHeadVendedor(Vendedor vendedor){

        Nodo n = new Nodo(vendedor);

        if(head == null){
            head = n;
        }else{
            n.next = head;
            head = n;
        }

        size++;
    }

    public void addTailVendedor(Vendedor vendedor){

        Nodo n = new Nodo(vendedor);

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

    public Vendedor removeHead(){

        if(head == null) return null;

        Nodo aux = head;

        head = head.next;
        size--;

        return aux.vendedor;
    }

    public void remove(Vendedor vendedor){
        if(head != null){

            if(head.vendedor.equals(vendedor)){
                removeHead();
            } else if(head.next != null){
                Nodo aux1 = head;
                Nodo aux2 = head.next;
                boolean encontrado = false;

                while(aux2 != null && !encontrado){

                    if(aux2.vendedor.equals(vendedor)){
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


    public boolean contains(Vendedor vendedor){
        if(head == null) return false;

        Nodo aux = head;
        boolean encontrado = false;

        while(!encontrado && aux != null){
            encontrado = aux.vendedor.equals(vendedor);
            aux = aux.next;

        }

        return encontrado;
    }

    @Override
    public String toString() {
        String text = "Cantidad: " + size + "\n" +
                "Vendedores: ";

        Nodo aux = head;
        while(aux != null){
            text += "\n" + "\n" + aux.getVendedor() + " ";
            aux = aux.next;
        }

        return text;
    }

    private class Nodo {

        private Vendedor vendedor;
        private Nodo next;

        public Nodo(Vendedor vendedor){
            this.vendedor = vendedor;
            this.next = null;
        }

        public Vendedor getVendedor(){
            return vendedor;
        }

        public Nodo getNext(){
            return next;
        }

        public void setNext(Nodo next){
            this.next = next;
        }

    }
}
