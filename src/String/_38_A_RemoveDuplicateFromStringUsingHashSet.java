package String;

import java.util.HashSet;

public class _38_A_RemoveDuplicateFromStringUsingHashSet {
    public static void main(String[] args) {
        String str= "success";
        HashSet hashset= new HashSet();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){

            if(!hashset.contains(str.charAt(i))){
                hashset.add(str.charAt(i));
                sb.append(str.charAt(i));
            }

        }

        System.out.println(sb.toString());
    }
}
