package DataStructure.Queue;



public class _02_QueueMainUsingArray {
    public static void main(String[] args) {
        _01_QueueUsingArray queue= new _01_QueueUsingArray();
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.push(123);
        queue.push(456);
        queue.push(789);
        queue.push(741);
        System.out.println("---------------");
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.peek());
        queue.pop();
        System.out.println(queue.peek());

    }

}
