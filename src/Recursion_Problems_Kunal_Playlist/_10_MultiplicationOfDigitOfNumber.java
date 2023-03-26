package Recursion_Problems_Kunal_Playlist;

public class _10_MultiplicationOfDigitOfNumber {
    public static void main(String[] args) {
        System.out.println(MultiplyOfDigit(5959));

    }

    static int MultiplyOfDigit(int number){
        //base condition
        if(number==0){
            return 1;
        }

        int sum=0;
        sum=sum+number%10;
        number=number/10;

        return sum*MultiplyOfDigit(number);

    }
}
