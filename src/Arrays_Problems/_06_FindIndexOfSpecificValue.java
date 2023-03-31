package Arrays_Problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _06_FindIndexOfSpecificValue {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int index=-1;
        int value=506;// handcoded ,can be taken for user

       //Conventional Methods
        for(int i=0;i<my_array.length;i++){
            if(value==my_array[i]){
                index=i;
            }
        }
        System.out.println(index);

        //Using stream()
        int indexStream= IntStream.range(0,my_array.length).
                filter(i -> value==my_array[i]).
                findFirst().
                orElse(-1);
        System.out.println(indexStream);
    }
}
