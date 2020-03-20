package javaAnonymousClass.callbackExample;

public class Divider {
    public static void devide (int a, int b, Callback callback){
        if (b==0){
            callback.failed("Devision by zero!");
            return;
        }

        callback.calculated(a / b);
    }
}
