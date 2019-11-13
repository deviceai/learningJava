package javaGenerics;

public class genericsWildcards {
    public static void main(String[] args) {
        //Cell<Car> cell = new Cell<Toyota>();  //not work
        //can solve this with wildcards
        Cell<?> cell2 = new Cell<Toyota>(); //will work!!!
        //using with
        // Cell<? extends Car>
        // Cell<? super Car>
        Cell<? super Toyota> cell3 = new Cell<Toyota>(); //all parent can be in the right side (Object, Car,Toyota)
        cell3.setT(new Corolla()); //all childs can be here

        Cell<? extends Toyota> cell4 = new Cell<Corolla>(); //all child can be in the right part
        Toyota t = cell4.getT(); //will work
        //cell4.setT(new Toyota()); //not compile

        //with super we can use only setters
        //with extends we can use only getters


    }
}

class Car {}
class Toyota extends Car {}
class Corolla extends Toyota {}

class Cell<T> {
    T t;

    public T getT(){
        return this.t;
    }

    public void setT(T t){
        this.t = t;
    }
}