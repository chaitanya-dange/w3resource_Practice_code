package BasicPart_01;

public class _0001ConvertingStringNumberToSumUsingCharArray {
    public static void main(String[] args) {

        String str="12345";


        int sum=0;
        char[]chArray=str.toCharArray();
        for(int i=0;i<chArray.length;i++){
            sum=sum+chArray[i] -'0';// interesting  conventing char array into integer;
                                    // char +0 --> this will give the ascii value of number;
        }
        System.out.println(sum);
    }
}
