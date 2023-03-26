package String;

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;

public class _41_removingStringDuplicateByCompaingWithOtherString {

    public static void main(String[] args) {
        String str1="the quick brown fox";
        String str2="queen";
        String result="";


        int count=0;
        HashSet<Character> set= new HashSet<Character>();
        for(int i=0;i<str2.length();i++){
            if(!set.contains(str2.charAt(i))){
                set.add(str2.charAt(i));

            }
        }

        for(int i=0;i<str1.length();i++){
            if(!set.contains(str1.charAt(i))){
                result=result+str1.charAt(i);
            }
        }

        System.out.println(result);

        // How to use iterator in set

        Iterator<Character> element= set.iterator();

        while(element.hasNext()){
            System.out.print(element.next());

        }





    }



}
