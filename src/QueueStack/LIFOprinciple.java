package QueueStack;


import java.util.*;

public class LIFOprinciple {
    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack<>();
        ArrayList<Integer> inNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (Integer item : inNumbers){
                numbers.push(item);
        }

        while (!numbers.isEmpty()){
            System.out.println(numbers.pop());
        }


        //VARIANT 2
        Deque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> numStack = new ArrayList<>(Arrays.asList(6,7,8,9,0));

        //add items from arraylist to deque
        for (Integer item : numStack){
            stack.add(item);
        }

        //print elements in backorder LIFO
        for (int i=0; i< stack.size(); i++){
            System.out.println(stack.pollLast());
        }





    }
}
