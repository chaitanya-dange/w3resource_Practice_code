package BasicPart_01;

public class _015SwapTwoNumber {
    public static void main(String[] args) {
        int a=10;
        int b=20;


        /*

        //Method 01 by taking third variable...

        int temp=a;
        a=b;
        b=temp;
        System.out.println(" value of a is:"+a+"The value of b is "+b);
        System.out.println("the changed value of a is: "+a+"The changed value of b is "+b);

        */

        System.out.println("--------------------------------");

        /*

        // Method 02: By using operator +/-     ....

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" value of a is:"+a+"The value of b is "+b);
        System.out.println("the changed value of a is: "+a+"The changed value of b is "+b);

         */

        /*

        //Method 03: By using operator * n /   ....

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(" value of a is:"+a+"The value of b is "+b);
        System.out.println("the changed value of a is: "+a+"The changed value of b is "+b);

        */


        // Method 04:

        System.out.println("Before swapping: x = " + a + " y = " + b);

        // Swap the numbers using bitwise XOR
        a = a ^ b; // x is now 3 (011 ^ 010 = 011)
        b = a ^ b; // y is now 1 (011 ^ 010 = 001)
        a= a ^ b; // x is now 2 (011 ^ 001 = 010)

        System.out.println("After swapping: x = " + a+ " y = " + b);

    }
}
