package String;

import java.util.HashMap;
import java.util.HashSet;

public class _43_MaximumOccureanceOfCharacterInString {
    public static void main(String[] args) {
        String str="test sssstring";

        HashMap<Character,Integer> map= new HashMap<>();

        int charCount=0;
        int max=0;

        for(int i=0;i< str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }

        for(int i=0;i< str.length();i++){
            if(map.get(str.charAt(i))>max){
                max=map.get(str.charAt(i));
            }
        }
        System.out.println(max);
    }
}
