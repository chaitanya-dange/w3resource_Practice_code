package DataStructure.Stacks;

public class _01_StackArrayMain {
    public static void main(String[] args) {
        _02_StackUsingArray stack= new _02_StackUsingArray();

        System.out.println(stack.isEmpty());
        stack.push(123);
        System.out.println(stack.isFull());
        System.out.println(stack.peek());
        stack.push(159);

        stack.push(111);
        stack.push(777);
        stack.push(999);

        System.out.println(stack.peek());
    }
}
