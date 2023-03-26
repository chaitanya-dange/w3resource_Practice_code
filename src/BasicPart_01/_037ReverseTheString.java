package BasicPart_01;

public class _037ReverseTheString {
    public static void main(String[] args) {
        String str= "the new era of world";
       /*
        char[] reverseString=new char[str.length()];
        int count=0;

        for(int i=str.length()-1;i>=0;--i){

            reverseString[count]=str.charAt(i);
            count=count+1;
        }
        System.out.println(reverseString);

        */

        //------------------------------------

        //Using String Buffer...

        StringBuilder stbr= new StringBuilder();
        for(int i=str.length()-1;i>=0;--i){

            stbr.append(str.charAt(i));
        }
        System.out.println(stbr.toString());



    }
}
