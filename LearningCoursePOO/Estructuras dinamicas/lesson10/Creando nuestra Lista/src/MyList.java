import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MyList<T> {

    private int size;
    private Node<T> head;

    public MyList() {
        size = 0;
        head = null;
    }

    public void addHead(T element) {
        Node<T> aux = new Node<>(element);
        aux.setNext(head);
        head = aux;
        size++;
    }

    public void addTail(T element) {

        if (head == null)
            addHead(element);
        else {

            Node<T> aux = head;
            while (aux.getNext() != null)
                aux = aux.getNext();


            aux.setNext(new Node<T>(element));
            size++;
        }
    }

    public void addAll(MyList<T> lista){

        if (lista == null || lista.head == null) return;

        Node<T> aux = lista.head;

        while (aux != null){
            addHead(aux.getInfo());
            aux = aux.getNext();
        }
    }

    public void clear(){
            head = null;
            size = 0;
    }

    public boolean contains(Object o){

        Node<T> aux = head;

        boolean encontrado = false;

        while (aux != null){

            if (aux.getInfo().equals(o) && !encontrado){
                encontrado = true;
            }
            aux = aux.next;
        }
        return encontrado;
    }

    public T get(int index){


        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> aux = head;

        int i = 0;

        while (i++<index){
            aux = aux.next;
        }
        return aux.getInfo();

    }

    public int indexOf(Object o){

        Node<T> aux = head;

        int i = 0;
        boolean encontrado = false;
        while (i<size && !encontrado){

            if (aux.getInfo().equals(o)){
                encontrado = true;
            } else {
                i++;
                aux = aux.next;
            }
        }
        if (encontrado) return i;
            return -1;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public Object[] toArray(){

        Object[] o = new Object[size];

        int i = 0;
        Node<T> aux = head;
        while (i < size){
            o[i] = aux.getInfo();
            aux = aux.next;
            i++;
        }
        return o;
    }

    public MyList subList(int fromIndex, int toIndex){

        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex){
            throw new IndexOutOfBoundsException();
        }

        Node<T> aux = head;
        MyList<T> res = new MyList<>();
        for (int i = 0; i < fromIndex; i++)
            aux = aux.next;
        for (int i = fromIndex; i < toIndex; i++) {
            res.addTail(aux.info);
            aux = aux.next;
        }
        return res;
    }


    public T remove(int index) {

        if (index >= size || index < 0)
            return null;

        if (index == 0) {
            T info = head.info;
            head = head.getNext();
            size--;
            return info;
        }

        Node<T> aux = head;
        while (--index > 0)
            aux = aux.getNext();

        T info = aux.getNext().info;

        aux.setNext(aux.getNext().getNext());
        size--;
        return info;
    }

    public String toString() {
        return "size: " + size + "\n" + ((head == null) ? "[]" : "[" + head);
    }

    public class Node<T> {

        private T info;
        private Node<T> next;

        Node(T info) {
            this.info = info;
            this.next = null;
        }

        public T getInfo() {
            return info;
        }

        Node<T> getNext() {
            return next;
        }

        void setNext(Node<T> node) {
            this.next = node;
        }

        public String toString() {
            return info + ((next != null) ? " " + next : "]");
        }
    }
}