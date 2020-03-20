package javaAnonymousClass.callbackExample;

public class CallbackExample {
    public static void main(String[] args) {

        int a = 6;
        int b = 6;

        Callback myCallback = new Callback() {
            @Override
            public void calculated(int result) {
                String textToPrint = String.format("%d / %d is %d", a,b,result);
                System.out.println(textToPrint);
            }

            @Override
            public void failed(String errorMsg) {
                System.out.println(errorMsg);
            }
        };

        Divider.devide(a, b, myCallback);
    }
}
