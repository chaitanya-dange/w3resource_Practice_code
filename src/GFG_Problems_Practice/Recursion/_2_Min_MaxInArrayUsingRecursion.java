package GFG_Problems_Practice.Recursion;

public class _2_Min_MaxInArrayUsingRecursion {
    public static void main(String[] args) {
        int []arr = {1, 4, 3, -5, -4, 8, 6};

        minMax(arr);
    }

    private static void minMax(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int length=0;

        helper(arr,min,max,length);
    }

    private static void helper(int[] arr, int min, int max, int length) {
        //base condition
        if(length>=arr.length){
            System.out.println("minimum : "+ min+" , "+"maximum :"+max);
            return;
        }
        if(arr[length]>max){
            max=arr[length];
        }

        if(arr[length]<min){
            min=arr[length];
        }

        helper(arr, min, max, length+1);
    }
}
