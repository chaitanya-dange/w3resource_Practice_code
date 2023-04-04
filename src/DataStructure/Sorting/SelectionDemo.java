package DataStructure.Sorting;
import java.util.Arrays;
public class SelectionDemo {
    public static void main(String[] args) {
        int [] array={5,2,3,1,4};

        array= selection(array);
        System.out.println(  Arrays.toString(array));


    }

    private static int[] selection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max=0;
            int last=array.length-i-1;
            max= getMax(array,max,last);
            swapElement(array,max,last);
        }
        return  array;

    }

    private static void swapElement(int[] array, int max,int last
    ) {
        int temp=array[max];
        array[max]=array[last];
        array[last]=temp;


    }

    private static int getMax(int[] array, int max, int last) {
        for (int i = 0; i <=last; i++) {
            if(array[max]<array[i]){
                max=i;
            }

        }
        return max;

    }
}
