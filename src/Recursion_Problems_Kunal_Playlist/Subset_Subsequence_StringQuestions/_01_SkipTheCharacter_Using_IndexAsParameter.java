package Recursion_Problems_Kunal_Playlist.Subset_Subsequence_StringQuestions;

public class _01_SkipTheCharacter_Using_IndexAsParameter {
    public static void main(String[] args) {
        skipCharacter("abcdabadac");
    }

    static void skipCharacter(String str){
        int index=1;
        String skipped="";

        helper(skipped,str,index);
    }

    private static void helper(String skipped, String str, int index) {
        //base condition
        if(index>str.length()-1){
            System.out.println(skipped);
            return;
        }

        if(str.charAt(index)=='a'){
            helper(skipped,str,index+1);
        }else {
            helper(skipped+str.charAt(index),str,index+1);
        }
    }
}
