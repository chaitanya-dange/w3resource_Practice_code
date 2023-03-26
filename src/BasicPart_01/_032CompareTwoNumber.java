package BasicPart_01;

import java.util.Scanner;

public class _032CompareTwoNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();

        if(num1==num2){
            System.out.println(num1+"="+num2);
        } else if (num1 < num2) {
            System.out.println(num1+"<"+num2);
        }
        else if (num1 > num2) {
            System.out.println(num1+">"+num2);
        }
    }
}
