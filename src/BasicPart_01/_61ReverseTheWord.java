package BasicPart_01;

public class _61ReverseTheWord {
    public static void main(String[] args) {
         String str= "abcde";
         String strReverse="";

         for(int i=str.length()-1;i>=0;i--){
             strReverse=strReverse+str.charAt(i);
         }
        System.out.println(strReverse);
    }
}
