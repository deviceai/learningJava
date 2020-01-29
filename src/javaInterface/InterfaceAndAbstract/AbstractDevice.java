package javaInterface.InterfaceAndAbstract;

abstract class AbstractDevice implements ManagedDevice{

    protected String serialNumber = "Unknown";
    protected boolean on = false;

    public AbstractDevice (String serial){
        this.serialNumber = serial;
    }

    protected void setOn (boolean on){
        this.on = on;
        System.out.println("Kettle is on!");
    }

    protected void setOff (boolean on){
        this.on = on;
        System.out.println("Kettle is off!");
    }

}
