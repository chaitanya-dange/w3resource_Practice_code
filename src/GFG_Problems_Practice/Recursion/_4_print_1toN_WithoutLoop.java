package GFG_Problems_Practice.Recursion;

public class _4_print_1toN_WithoutLoop {
    public static void main(String[] args) {
        int n=10;

        printNaturalNumber(n,1);
    }

    private static void printNaturalNumber(int n,int num) {
        //base condition
        if(num==n){
            System.out.println(num);
            return ;
        }
        System.out.println(num);
        printNaturalNumber(n,num+1);
    }
}
