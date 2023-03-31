package Arrays_Problems;

import java.util.Arrays;

public class _01_SortingNumberArrayAndStringArray {
    public static void main(String[] args) {

        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] my_array2 = {
                "Java",

                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        int[] my_array3 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        System.out.println(Arrays.toString(my_array1));  //my_array1.toString() will give reference
        System.out.println(Arrays.toString(my_array2));

        Arrays.sort(my_array1);
        Arrays.sort(my_array2);


        System.out.println(Arrays.toString(my_array1));
        System.out.println(Arrays.toString(my_array2));



    }
}
