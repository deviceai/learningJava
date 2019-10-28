import java.util.Scanner;
class evenOdd {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int inNumber = 0;
        while (scanner.hasNext()){

            inNumber = scanner.nextInt();

            // if (inNumber > 0){

            if (inNumber % 2 == 0 & inNumber > 0){
                System.out.println("even");
            }
            if (inNumber % 2 != 0 & inNumber > 0) {
                System.out.println("odd");
            }
            // }
        }
    }
}
