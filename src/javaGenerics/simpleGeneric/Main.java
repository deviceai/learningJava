package javaGenerics.simpleGeneric;

public class Main {
    public static void main(String[] args) {

        //before compilation
        simpleGeneric<Integer> myGeneric = new simpleGeneric<>(5);
        myGeneric.setT(6);
        System.out.println(myGeneric.getT());

        //after compilation
        simpleGeneric2 myGeneric2 = new simpleGeneric2();
        myGeneric2.setObject(5);
        System.out.println(myGeneric2.getObject());
    }
}

//before compilation
class simpleGeneric <T> {
    private T t;

    public simpleGeneric (T t){
        this.t = t;
    }
    public T getT (){
        return this.t;
    }
    public void setT(T t){
        this.t = t;
    }
}

//after compilation, for compatibility with previous Java versions
class simpleGeneric2 {
    Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object){
        this.object = object;
    }
}
