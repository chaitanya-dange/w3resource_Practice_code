package String;

public class _38_B_RemoveDuplicateFromStringUsingIndexOf {
    public static void main(String[] args) {
        String str ="success";
        String target="";

        for(int i=0;i<str.length();i++){
            if(target.indexOf(str.charAt(i))==-1){
                target=target+str.charAt(i);
            }
        }
        System.out.println(target);
    }
}
