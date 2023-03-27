package Recursion_Problems_Kunal_Playlist;

public class _17_LinearSearchWithRecursion_by_Me {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,8,9,45,65,12,99,12};

        System.out.println(linearSearch(array,99,0));
    }

    static int linearSearch(int array [], int number, int index){
        //base condition

        if(index>array.length-1){
            return -1;
        }

        if(array[index]==number){
            return index;
        }
        return linearSearch(array,number,index+1);


    }
}

// if you want to return all the indexes which given number contains
// then add it in arraylist. and return arraylist
