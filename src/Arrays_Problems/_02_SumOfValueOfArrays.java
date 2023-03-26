package Arrays_Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class _02_SumOfValueOfArrays {
    public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        int my_array2[] = {91, 42, 33, 24, 55, 67, 70, 18, 69, 110};

       int sum=Arrays.stream(my_array).sum();

       int sum02= IntStream.range(0,my_array2.length).sum();


        System.out.println(sum);


    }
}
