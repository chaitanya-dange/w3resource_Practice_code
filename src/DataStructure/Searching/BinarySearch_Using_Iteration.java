package DataStructure.Searching;

public class BinarySearch_Using_Iteration {
    public static void main(String[] args) {
     int [] array=  {1, 4, 5, 12, 13, 25, 48, 50, 51, 60, 65, 79, 84, 94};
        int target=65;
        int index= binarySearch(array,target);
        System.out.println(index);
    }

    private static int binarySearch(int[] array,int target) {
        int start=0;
        int end=array.length;

        while(start<=end){
            int mid=start + (end-start)/2;

            if(array[mid]==  target){
                return mid;
            }else if(array[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return -1;
    }


}
