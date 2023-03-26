package DataStructure.Stacks;

public class _02_StackUsingArray {
    int data;
    int [] array;
    int count;

    public _02_StackUsingArray() {
        array=new int[10];
        count=-1;
    }

    public _02_StackUsingArray(int number) {
        array=new int[number];
        count=-1;
    }


    public boolean isFull(){
        if(count==array.length-1){
            return  true;
        }

        return false;

    }

    public boolean isEmpty(){
        if(count<0){
            return  true;
        }

        return false;

    }

    public int peek(){
        return array[count];
    }

    public void push(int number){
        count=count+1;
        array[count]=number;
    }

    public void pop(){
        count=count-1;
    }



}
