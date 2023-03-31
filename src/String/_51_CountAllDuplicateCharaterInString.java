package String;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class _51_CountAllDuplicateCharaterInString {
    public static void main(String [] args){
        String str1 = "w3resource";

        HashMap<Character,Integer> map= new HashMap<>();

        for(int i=0;i<str1.length();i++){

            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
            }else{
                map.put(str1.charAt(i),1);
            }
        }
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<str1.length();i++){

            if(map.get(str1.charAt(i))==2){
               set.add(str1.charAt(i));

            }
        }

        Iterator<Character> iterator= set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next()+" "+2);
        }
    }
}
