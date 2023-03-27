package Recursion_Problems_Kunal_Playlist;

public class _16_FindArraySortedOrNotUsingRecusion_By_Me {
    public static void main(String[] args) {

        int [] array={1,2,3,4,5,6,7,8,9,0};
        System.out.println(checkSortedArray(array));

    }

    static boolean checkSortedArray(int [] array){

        int index=0;
        return helperFunction(array,index);


    }

    private static boolean helperFunction( int array [],int currentIndex){
        // base condition
        if(array[currentIndex]==array.length-1){
            if(array[currentIndex]<array[currentIndex+1]){
              return true;
            }
            return false;
        }

        if(array[currentIndex]<array[currentIndex+1]){
            return helperFunction(array,currentIndex+1);

        }

        return false;



    }



}
