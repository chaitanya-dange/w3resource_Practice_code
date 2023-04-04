package DataStructure.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array={5,2,6,9,2,1};
        array=selectionSorting(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] selectionSorting(int[] array) {

        for (int i = 0; i < array.length ; i++) {
            int max=0;
            int last= array.length-1-i;
            for (int j= 0; j <= last; j++) {
                if(array[max]<array[j]){
                    max=j;
                }

            }
            int temp=array[max];
            array[max]=array[last];
            array[last]=temp;

        }
        return array;

    }
}
