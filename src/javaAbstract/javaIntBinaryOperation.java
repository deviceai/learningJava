package javaAbstract;

public class javaIntBinaryOperation {
    public static void main(String[] args) {
        Addition add = new Addition(10,5);
        System.out.println(add.perform());

        Multiplication mult = new Multiplication(5,5);
        System.out.println(mult.perform());
    }
}


abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}

class Addition extends IntBinaryOperation {
    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }
    @Override
    public int perform(){
        return firstArg + secondArg;
    }
}

class Multiplication extends IntBinaryOperation {
    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }
    @Override
    public int perform(){
        return firstArg * secondArg;
    }
}
