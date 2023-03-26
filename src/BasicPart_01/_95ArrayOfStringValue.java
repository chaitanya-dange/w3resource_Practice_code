package BasicPart_01;

import java.util.Arrays;

public class _95ArrayOfStringValue {
    public static void main(String[] args) {
        String [] strArray= new String[8];

        for(int i=0;i<strArray.length;i++){
            strArray[i]=String.valueOf(i);
        }
        System.out.println(Arrays.toString(strArray));

    }
}
// convert all datatype to string using method    String.valueOf("value");