package Recursion_Problems_Kunal_Playlist;

public class _02_NumberExample {
    public static void main(String[] args) {
        number(0);
    }

    static void number(int n){
        System.out.println(n);
        number1(1);
    }
    static void number1(int n){
        System.out.println(n);
        number2(2);
    }
    static void number2(int n){
        System.out.println(n);
        number3(3);
    }
    static void number3(int n){
        System.out.println(n);
        number4(4);
    }
    static void number4(int n){
        System.out.println(n);
    }
}
