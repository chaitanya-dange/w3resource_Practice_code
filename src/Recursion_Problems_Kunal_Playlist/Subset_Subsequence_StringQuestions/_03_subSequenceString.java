package Recursion_Problems_Kunal_Playlist.Subset_Subsequence_StringQuestions;

public class _03_subSequenceString {
    public static void main(String[] args) {
        subSequence("","abc");
    }

    private static void subSequence(String s, String abc) {
        //base condition
        if(abc.isEmpty()){
            System.out.println(s);
            return;
        }

        char ch= abc.charAt(0);

        subSequence(s+ch,abc.substring(1));
        subSequence(s,abc.substring(1));
    }
}
