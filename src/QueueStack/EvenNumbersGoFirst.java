package QueueStack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class EvenNumbersGoFirst {
    public static void main(String[] args) {
        Deque<Integer> numbers = new ArrayDeque<>();
        ArrayList<Integer> inNumbers = new ArrayList<>(Arrays.asList(6,10,11,12,13,14,15));
        //inNumbers.add(10);

        System.out.println(numbers);
        System.out.println(inNumbers);

        for (Integer num : inNumbers){
            if (numbers.contains(num)){
                numbers.remove(num);
            }
                if (num % 2 == 0) {
                    numbers.offerFirst(num);
                } else {
                    numbers.add(num);
                }
        }
        for(Integer q : numbers) {
            System.out.println(q.toString());
        }

    }
}
