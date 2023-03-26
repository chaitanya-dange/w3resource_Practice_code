package String;
import java.util.Arrays;
public class _40_divideStringIntoN_EqualParts_MyLogic {
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxy";
        int number=5;
        int count=0;
        String strArray[]=new String[number];

       String [] result= getDividedSubString(str,5,strArray,count);

        System.out.println(Arrays.toString(strArray));





    }

    public static String[]  getDividedSubString(String str,int number,String [] str1,int count){
        int length=str.length();
        if(count<number){
        int first=0;
        int diff=number;
        String temp=str.substring(first,diff);
        first=first+number;
        diff=diff+number;
        str1[count]=temp;
        count=count+1;
        }else{
            return  str1;
        }



        return  getDividedSubString(str,number,str1,count);
    }
}
