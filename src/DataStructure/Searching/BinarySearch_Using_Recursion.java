package DataStructure.Searching;

public class BinarySearch_Using_Recursion {
    public static void main(String[] args) {
        int [] array=  {1, 4, 5, 12, 13, 25, 48, 50, 51, 60, 65, 79, 84, 94};
        int target=65;

        int index= binarySearchUsingRecursion(array,target);
        System.out.println(index);
    }

    private static int binarySearchUsingRecursion(int[] array, int target) {
        int start=0;
        int last=array.length-1;

        return binaryHelper(array,target,start,last);
    }

    private static int binaryHelper(int[] array, int target, int start, int last) {
        int mid=(start+last)/2;

        //base condition
        if(start>last){
            return -1;
        }

        if (array[mid]==target){
            return mid;
        }else if(array[mid]>target){
            return binaryHelper(array,target,start,mid-1);
        }else{
            return binaryHelper(array,target,mid+1,last);
        }
    }
}
