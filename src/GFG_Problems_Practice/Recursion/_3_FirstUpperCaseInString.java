package GFG_Problems_Practice.Recursion;

public class _3_FirstUpperCaseInString {
    public static void main(String[] args) {
        String str="geeksforgeekS"; //  65-90
        firstUpper(str);
    }

    private static void firstUpper(String str) {
        int i=0;

        helperUpper(str,i);
    }

    private static void helperUpper(String str, int i) {
        //base condition
        if(i>=str.length()){
            System.out.println("no such element");
        }
        if(65<=str.charAt(i) && str.charAt(i)<=90){
            System.out.println(str.charAt(i));
            return;
        }

        helperUpper(str, i+1);

    }


}
