package javaArrays;

public class SearchIndexes {

    public static void main(String[] args) {
        int[] first = {15, 10, 18, 17, 15};
        int[] second = {10, 15, 10, 17};
        int[] result = new int[first.length];

        for (int s = 0; s < second.length; s++) {
            for (int f = 0; f < first.length; f++) {
                if (second[s] == first[f]){
                    result[f] = f;
                    break;

                    //not work!!!!
                }
            }
        }


        /*
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {

                if (first[i] == second[j] & result[i] == 0) {

                    result[i] = j;
                    System.out.println(result[i]);

                }

            }

         */




        System.out.println("Result: ");
        for(int num = 0; num < result.length; num++) {
            System.out.print(result[num] + " ");
        };


    }

}
