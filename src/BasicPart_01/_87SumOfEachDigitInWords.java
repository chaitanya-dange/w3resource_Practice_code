package BasicPart_01;

import java.util.Arrays;

public class _87SumOfEachDigitInWords {
    public static void main(String[] args) {
        String number="999999999999";

        char[] charArray=number.toCharArray();

        int sum=0;

        for(int i=0;i<charArray.length;i++){
            sum=sum+charArray[i]-'0';

        }

        System.out.println(sum);

        String [] words={"zero","one","two","three","four","five","six","seven","eight","nine"};

        if(sum<10){
            System.out.println(words[sum]);
        }else if(sum<100){
            int x=sum/10;
            int y=sum-x*10;
            System.out.println(words[x]+" "+words[y]);
        }else{
            int x=sum/100;
            int y=sum-x*100;
            int z= sum-x*100-y*10;
            System.out.println(words[x]+" "+words[y]+" "+words[z]);
        }


    }
}
