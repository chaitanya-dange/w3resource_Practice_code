package Arrays_Problems;

import java.util.*;

public class _03_AverageValueOfArray {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
       double averageNum= Arrays.stream(numbers).average().orElse(Double.NaN);
       int mini= Arrays.stream(numbers).min().orElseThrow(Exception::new);
        System.out.println(averageNum);
        System.out.println(mini);

    }
}

/*
int[] numbers = {1, 2, 3, 4, 5};

OptionalInt min = Arrays.stream(numbers).min();// min return OptionalInt

min.ifPresent(value -> System.out.println("Minimum: " + value));

 */
