package patternSingletonPrint;

public class SingletonPrintingData {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance("data1");
        Singleton instance2 = Singleton.getInstance("data2");

        instance1.printData();
        instance2.printData();

        Singleton instance3 = Singleton.getInstance("data3");
        instance3.data = "data4";

        instance3.printData();
    }
}

class Singleton {

    private static Singleton instance;

    public String data;

    private Singleton (String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        if (instance == null) {
            instance = new Singleton(data);
        }
        return instance;
    }

    public void printData() {
        System.out.print(data + " ");
    }
}


