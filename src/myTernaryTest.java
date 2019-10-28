public class myTernaryTest {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        //int c = a - b > 0 ? a + b : a - b;
        //int c = a - b : a + b ? a >= b;  ---
        //int c = a > b !! a + b : a - b; ---
        int c = a <= b ? a + b : a - b;
        //int c = a - b > 0 ? a - b : a + b;
        System.out.println(c);
    }
}
