package Arrays_Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _07_RemovingSpecificElementFromArray {
    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int indexNumber=-1;
        int numToDelete= 36;

     for(int i=0;i<my_array.length;i++){
         if(my_array[i]==numToDelete){
             indexNumber=i;
         }

     }
     if(indexNumber==-1){
         System.out.println("Element to be deleted is not present in Array");
     }else{
         int length=my_array.length-1;

         for(int i=indexNumber;i<length;i++){
             my_array[i]=my_array[i+1];
         }
     }

        System.out.println(Arrays.toString(my_array));

    }
}
