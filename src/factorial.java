import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
    // put your code here
    Scanner scanner = new Scanner(System.in);

    long inNumber = scanner.nextLong();

    int factorial = 0;
    long tempNum =0;

        do {
            if (factorial == 0){
                tempNum = 1;
                factorial++;
            }
            if (factorial == 1){
                tempNum = 1;
                factorial++;
            }

            else {
                //System.out.println("factorial "+ factorial);
                tempNum = factorial * tempNum;//;
                //System.out.println("tempNum= "+ tempNum);
                factorial++;
            }

            } while (tempNum < inNumber);


        System.out.println(factorial-1);
}}
