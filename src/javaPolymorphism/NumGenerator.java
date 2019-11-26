package javaPolymorphism;

public class NumGenerator {
    public static void main(String[] args) {
        BaseNumberGenerator generator1 =  new BaseNumberGenerator(10);
        System.out.println(generator1.generate()); // result 21

        BaseNumberGenerator generator2 = new NumberGenerator(10);
        System.out.println(generator2.generate());  //result 24

        BaseNumberGenerator generator3 = new MagicNumberGenerator(10);
        System.out.println(generator3.generate()); //38

    }
}

class BaseNumberGenerator {

    protected int base;
    public BaseNumberGenerator(int base) {
        this.base = base;
    }
    public int generate() {
        return base + 11;
    }
}

class NumberGenerator extends BaseNumberGenerator {

    public NumberGenerator(int base) {
        super(base);
    }
    @Override
    public int generate() {

        return super.generate() + getNumber(); // 21 + 3
    }
    protected int getNumber() {
        return this.base - 7;
    }
}

class MagicNumberGenerator extends NumberGenerator {

    public MagicNumberGenerator(int base) {
        super(base);
    }
    @Override
    protected int getNumber() {   // 21 +17
        return this.base + 7;
    }
}
