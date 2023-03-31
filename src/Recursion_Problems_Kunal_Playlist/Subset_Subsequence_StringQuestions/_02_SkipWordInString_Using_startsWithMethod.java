package Recursion_Problems_Kunal_Playlist.Subset_Subsequence_StringQuestions;

public class _02_SkipWordInString_Using_startsWithMethod {
    public static void main(String[] args) {

        String str="adfasappledfadfgh";
        skipWordInString("",str);


    }

    private static void skipWordInString( String s,String str) {
        //base condition
        if(str.isEmpty()){
            System.out.println(s);
            return;
        }

        if(str.startsWith("apple")){
            skipWordInString(s,str.substring(6));
        }else{
            skipWordInString(s+str.charAt(0),str.substring(1));
        }
    }

    /*
            string.startsWith("<substring>")  will search for substring and return boolean..
     */


}
