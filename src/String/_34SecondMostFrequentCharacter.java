package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _34SecondMostFrequentCharacter {

    // Using HashMap
    public static void main(String[] args) {
        String str= "successes";

        HashMap<Character,Integer> map= new HashMap<>();

        for(int i=0;i<str.length();i++){
            Character ch= str.charAt(i);

            if(map.containsKey(str.charAt(i))){

                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MAX_VALUE;
        char secondChar='\0';

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int count= entry.getValue();
            if(count>max){
                secondMax=max;
                max=count;
                secondChar=entry.getKey();
            }else  if (count>secondMax && count!=max){
                secondMax=count;
                secondChar=entry.getKey();
            }



        }
        System.out.println( map.toString());
        System.out.println(secondChar);

        System.out.println(secondMax);

    }
}
