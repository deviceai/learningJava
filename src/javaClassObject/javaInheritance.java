package javaClassObject;

public class javaInheritance {
    public static void main(String[] args) {
        //Object of mySuperClass
        mySuperClass sc = new mySuperClass("some name", 55);

        //Object of myChildClass
        myChildClass child = new myChildClass("chi name", 77, true);
    }
}

class mySuperClass{
    protected String name;
    protected int number;

    //constructor
    public mySuperClass (String name, int number){
        this.name = name;
        this.number = number;
    }

}

class myChildClass extends mySuperClass{
    protected boolean isTrue;

    //constructor
    myChildClass(String name, int number, boolean isTrue){
        //super.name = name;
       //super.number = number;
        super(name, number);
        this.isTrue = isTrue;
    }

}
