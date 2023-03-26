package Recursion_Problems_Kunal_Playlist;

public class _09_SumOfDigitOfNumber {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(12345));

    }

    static int sumOfDigit(int number){
        //base condition
        if(number==0){
            return 0;
        }

        int sum=0;
        sum=sum+number%10;
        number=number/10;

        return sum+sumOfDigit(number);

    }
}
