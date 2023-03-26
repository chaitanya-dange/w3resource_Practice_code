package Recursion_Problems_Kunal_Playlist;

public class _07_FibonacciSeries {
    public static void main(String[] args) {


        System.out.println(factorial(5));

    }

    static int factorial(int number){
        //base case or base condition
        if(number<=1){
            return 1;
        }
        return number*factorial(number-1);
    }
}
