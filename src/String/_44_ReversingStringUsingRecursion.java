package String;

public class _44_ReversingStringUsingRecursion {
    public static void main(String[] args) {

        String str="The quick brown fox jumps";
            //
        String string=reverseString(str);
        System.out.println(string);


    }


    static String reverseString(String str){
        String revString="";
        int index=str.length()-1;

        return helperString(str,revString,index);

    }

    private static String helperString(String str, String revString, int index) {
        // base condition
        if(index<0){
            return revString ;
        }

        revString=revString+str.charAt(index);

        return helperString(str, revString,index-1);

    }
}
