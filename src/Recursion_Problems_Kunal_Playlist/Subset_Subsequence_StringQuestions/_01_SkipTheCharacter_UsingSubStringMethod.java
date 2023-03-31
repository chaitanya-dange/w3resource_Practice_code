package Recursion_Problems_Kunal_Playlist.Subset_Subsequence_StringQuestions;

public class _01_SkipTheCharacter_UsingSubStringMethod {

    public static void main(String[] args) {
        stringWithoutSkippedCharacter("","abcdabadac");
    }

    private static void stringWithoutSkippedCharacter(String s, String s1) {
        //base condition

        if(s1.isEmpty()){
            System.out.println(s);
            return;
        }

        char ch= s1.charAt(0);

        if(ch=='a'){
            stringWithoutSkippedCharacter(s,s1.substring(1));
        }else{
            stringWithoutSkippedCharacter(s+ch,s1.substring(1));
        }
    }

}
/*

String Method used:
 substrint(),
  TWO type ,
  one have only start,    --->   string.substring(int startIndex)
 and other have start and end as parameter  -->  string.substring(int startIndex, int endIndex)


 */

