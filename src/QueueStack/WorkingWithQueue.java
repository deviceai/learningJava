package QueueStack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
        System.out.println(queue);
        Integer num = new Integer(5);
        queue.offerLast(num);  //add 5 to the end
        queue.add(6);
        System.out.println(queue);
        queue.pop(); //remove first element
        queue.pop(); //remove first element
        queue.pollFirst(); //remove first element
        System.out.println(queue);

        queue.offerFirst(0); //add to start of queue
        System.out.println(queue);
    }
}
