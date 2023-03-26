package Arrays_Problems;
import java.util.Arrays;
import java.util.stream.IntStream;

public class _10_MinMaxValueOfArray {
    public static void main(String[] args) throws Exception {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        // Using Stream API
        int maxNumber=Arrays.stream(my_array).max().orElseThrow(Exception::new);
        int minNumber=Arrays.stream(my_array).min().orElse(-1);

        System.out.println(maxNumber);
        System.out.println(minNumber);




    }
}
