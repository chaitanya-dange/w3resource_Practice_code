package DataStructure.Queue;

import java.util.Stack;

public class _03_QueueUsingTwoStack {
    public static void main(String[] args) {
        Stack stack01=new Stack();
        Stack stack02= new Stack();

        stack01.push(12);
        stack01.push(48);
        stack02.push(stack01.pop());
        stack02.push(stack01.pop());

        System.out.println(stack02.pop());
        System.out.println(stack02.pop());
    }
}
