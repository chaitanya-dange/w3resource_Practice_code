package DataStructure.Queue;

public class _01_QueueUsingArray {
    int data;
    int [] array;
    int front;
    int rear;

    public _01_QueueUsingArray() {

        array= new int[10];
         front=-1;
         rear=-1;
    }

    public boolean isFull(){
        if(rear==array.length-1){
            return true;
        }

        return false;
    }

    public  boolean isEmpty(){
        if(front==-1|| front>rear){
            return true;
        }
        return false;
    }

    public void pop(){
        front=front+1;

    }

    public  void push(int number){

        if(front==-1){
            front=front+1;
        }
        if(!isFull()){
        rear=rear+1;
        array[rear]=number;
        }
    }

    public  int  peek(){
        return array[front];
    }
}
