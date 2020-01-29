package javaInterface.InterfaceAndAbstract;

public class Programm {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("JKUJFUJD8585KKJG78", 1.7);
        kettle.on();
        kettle.off();
    }
}

class Kettle extends AbstractDevice {

    protected double volume;

    public Kettle(String serialNumber, double volume) {
        super(serialNumber);
        this.volume = volume;
    }

    @Override
    public void on() {
        setOn(true);
    }

    @Override
    public void off() { setOff(false);
    }
}
