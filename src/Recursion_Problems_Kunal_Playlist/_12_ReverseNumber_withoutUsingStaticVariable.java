package Recursion_Problems_Kunal_Playlist;

public class _12_ReverseNumber_withoutUsingStaticVariable {
    public static void main(String[] args) {
        reverse(1234);

    }

    static void reverse(int n){
        int digit= (int)Math.log10(n) +1;

        System.out.println(helper(n,digit));
    }


    //HELPER FUNCTION
    private static int helper(int n, int digit) {
        if(n%10==n){
            return n;
        }
        int remains=n%10;
        return remains*(int)Math.pow(10,digit-1)+helper(n/10,digit-1);
    }
}

/*
sometimes you might need some additional variables in the arguments
so  HELPER FUNCTIONS

taking HELPER FUNCTIONS  to make possible to recursive call without using any static variable...
 */
