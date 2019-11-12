package javaGenerics.Inheritance;

import com.sun.tools.javah.Gen;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        GenParent<String> gen = new Child();
        Child2<String> ch2 = new Child2<>();
        GenParent<String> gnp = new Child7<String, Integer, Object>();

    }
}

class Parent {}

class GenParent<T> extends Parent{}

class Child extends GenParent{}
//class Child2 extends GenParent<T>{}  //not work
class Child2<T> extends GenParent<T>{} //will work
class Child3 extends GenParent<String>{} //will work
//class Child4<X> extends GenParent<T>{} //not work
class Child4<X,T,Y> extends GenParent<T>{} //will work
class Child5<X,T,Y> extends GenParent<String>{} //will work
class Child6<X,T,Y> extends GenParent{} //will work
class Child7<X,T,Y> extends Child6<Integer, T, String>{} //will work

//interfaces

interface genericInterface<T>{
    T getT();
}

class one implements genericInterface {
    @Override
    public Object getT(){
        return null;
    }
}

class two implements genericInterface<String>{
    @Override
    public String getT(){
        return null;
    }
}

class Three <T> implements genericInterface<T>{
    @Override
    public T getT(){
        return null;
    }
}