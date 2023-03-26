package Stack_Problems;

import java.util.Stack;

public class _01_PerformStackOperations {
    public static void main(String[] args) {
        Stack <Integer> stack= new Stack<Integer>();
        System.out.println(stack.isEmpty());
        stack.push(123);
        stack.push(234);
        stack.push(345);
        System.out.println(stack.pop());
        System.out.println(stack.peek());


        // to Display elements in stack
        stack.stream().forEach(i -> System.out.println(i));



    }
}
