package String;

public class _45_ReverseWordInString {
    public static void main(String[] args) {
        String str1 = "Reverse words in a given string";
        String revString="";

        String [] array= str1.split(" ");


        for(int i=0;i< array.length;i++){
            StringBuilder stringBuilder= new StringBuilder();
            stringBuilder.append(array[i]);
            array[i]=stringBuilder.reverse().toString();

        }

        for(int i=0;i<array.length;i++){
            //System.out.println(array[i]);
            revString=revString+array[i]+" ";

        }

        System.out.println(revString.trim());


    }
}
