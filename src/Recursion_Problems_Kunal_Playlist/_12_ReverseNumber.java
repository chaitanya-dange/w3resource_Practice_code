package Recursion_Problems_Kunal_Playlist;

public class _12_ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));
        System.out.println(numRev);
    }


    static int numRev=0;
    static int reverseNumber(int number){
        if(number<=0){
            return 0;
        }
       numRev= numRev*10+number%10;
        return  reverseNumber(number/10);
    }
}
