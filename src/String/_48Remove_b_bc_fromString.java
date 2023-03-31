package String;

public class _48Remove_b_bc_fromString {
    public static void main(String[] args) {
        String str="abrambabasc";
        StringBuilder stbr= new StringBuilder();
       str= str.replace("b","");
       str=str.replace("bc","");
        System.out.println(str);
    }
}

