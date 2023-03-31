package String;

public class _52_CheckIfTwoStringRotationOfEachOther {
    public static void main(String[] args) {
        String str1="ABACD";
        String str2=  "CAA";
        String string= str1+str2;
        System.out.println(string);
        if(string.contains(str2)){
            System.out.println("two string are rotation of each other");
        }else{
            System.out.println("two string are not rotation of each other");
        }

    }
}
