package Arrays_Problems;

import java.util.Arrays;

public class _05_ArrayContainSpecificValue {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};


        // Using Conventional Methods
        Boolean check=false;
        int numCheck=2035;
        for(int i=0;i<my_array1.length;i++){
            if(my_array1[i]==numCheck){
                check= true;
                //return;  if uncomment the sout will show no value..
            }

        }
        System.out.println( check);

        // Using stream()

        boolean checkNumber= Arrays.stream(my_array1).anyMatch(value -> value==numCheck);
        System.out.println(checkNumber);
    }
}
