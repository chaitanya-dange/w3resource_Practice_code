package BasicPart_01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _58CapitalLetterOfEachWord {

    public static void main(String[] args) {
        String string="the quick brown fox jumps over the lazy dog";
        String [] arrayString=string.split(" ");

        for(int i=0;i<arrayString.length;i++){
            arrayString[i]=arrayString[i].concat(arrayString[i].substring(0,1).toUpperCase()+arrayString[i].substring(1));
        }

        //System.out.println(Arrays.stream(arrayString).collect(Collectors.toList()));

        System.out.println(Arrays.toString(arrayString));
    }


}
