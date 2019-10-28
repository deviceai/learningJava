import java.util.Scanner;

public class factorialTwo {



        public static long factorial(long n) {
            // write your code here
            long factorial = 1;

            for (long i=1; i<=n; i++){
                factorial = factorial*i;
                System.out.println("factorial is " + factorial);
            }

            return factorial;
        }

        /* Do not change code below */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long n = Integer.parseInt(scanner.nextLine().trim());
            System.out.println(factorial(n));
        }

}
