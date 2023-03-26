package BasicPart_01;

import java.util.Scanner;

public class _002TakeInputAndCalculate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int number01= sc.nextInt();
        System.out.println(number01);
    }
}

/*
Scanner: This is the name of the class that we're creating an instance of.
The Scanner class is a part of the Java standard library and provides methods for parsing primitive types
and strings from input streams.

sc: This is the name of the new Scanner object that we're creating.
We can use this object to read input from the standard input stream.

new Scanner(System.in): This is the code that creates a new instance of the Scanner class.
The System.in argument tells the scanner to read input from the standard input stream.
This means that any text that the user types into the console after the program is run can be read by the scanner.





*/