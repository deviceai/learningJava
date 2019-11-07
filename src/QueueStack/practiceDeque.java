package QueueStack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class practiceDeque {
    public static void main(String[] args) {
        //It's possible to use implementations of the Deque interface as a queue (FIFO).
        Queue<String> myQueue = new ArrayDeque<>();
        myQueue.add("first");
        myQueue.add("second");
        myQueue.add("third");

        System.out.println(myQueue.peek()); // "first", it doesn't remove the element
        System.out.println(myQueue.peek()); // "first"
        System.out.println(myQueue.remove()); // "first", it removes and returns the head element

        System.out.println(myQueue.peek()); // "second"
        System.out.println(myQueue.remove()); // "second"

        System.out.println(myQueue.remove()); // "third"

        System.out.println(myQueue.isEmpty()); // "true"

        //Also, it's possible to use any implementation of the Deque interface as a stack (LIFO).
        Deque<String> stack = new ArrayDeque<>();

        stack.offerLast("first");
        stack.offerLast("second");
        stack.offerLast("third");

        System.out.println(stack); // [first, second, third]

        System.out.println(stack.pollLast()); // "third"
        System.out.println(stack.pollLast()); // "second"
        System.out.println(stack.pollLast()); // "first"

        System.out.println(stack.pollLast()); // null

        //The old Stack class
        Stack<String> oldStack = new Stack<>();

        oldStack.push("first");
        oldStack.push("second");
        oldStack.push("third");

        System.out.println(oldStack); // [first, second, third]

        System.out.println(oldStack.pop()); // "third"
        System.out.println(oldStack.pop()); // "second"
        System.out.println(oldStack.pop()); // "first"

        //System.out.println(oldStack.pop()); // throws EmptyStackException
        System.out.println("--------------------------------------------------------");
        Deque<String> states = new ArrayDeque<String>();
        states.add("Germany");
        states.add("France");
        states.push("UK");
        states.offerLast("Norway");

        System.out.println(states);  // [UK, Germany, France, Norway]

        String sFirst = states.pop();  // pop UK
        String s = states.peek();  // doest remove element [Germany, France, Norway]
        String sLast = states.peekLast(); // [Germany, France, Norway]
        System.out.println(states); // [Germany, France, Norway]
        states.offer(sFirst); // [Germany, France, Norway, UK]
        System.out.println(states);
        String s1 = states.pollLast();
        System.out.println(states); // [Germany, France, Norway]
    }
}
