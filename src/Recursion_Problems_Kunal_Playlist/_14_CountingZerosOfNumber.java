package Recursion_Problems_Kunal_Playlist;



public class _14_CountingZerosOfNumber {
    public static void main(String[] args) {

        count(10);
    }

    static void count(int number){


        System.out.println( helper(number,0));
    }

    private static int helper(int number, int count){

        if(number==0){
            return count;
        }


        int remains=number%10;

        if(remains==0){
          return  helper(number/10,count+1);
        }
        return helper(number/10,count);

    }
}
