package javaGenerics.genericMethods;

public class Main {
    public static void main(String[] args) {
        Cell<String> cell = new Cell<>(new Integer(5));
        cell.getE(new Integer(5));
        System.out.println(cell.getE(new String("Test")));

    }
}

class Cell <T> {
    T t;

    //constructor
    <X> Cell (X x){}

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    <E> E getE (E e){
        return e;
    }
}
