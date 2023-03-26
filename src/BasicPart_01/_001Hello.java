package BasicPart_01;

public class _001Hello {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
/*
"public static void main" is a commonly used method signature in Java programming language that serves
 as the entry point of a Java program. Here's a breakdown of each component of the method signature:

"public" - indicates that the main method can be accessed by any class in any package.
"static" - indicates that the main method can be called without creating an instance of the class containing the main method.
"void" - indicates that the main method does not return any value.
"main" - the name of the method. This is a special method name in Java that serves as the entry point of the program.
So when you create a Java program, you need to include a main method with this signature so that the Java Virtual Machine (JVM) knows where to start executing the code. The main method should have the following syntax:

public static void main(String[] args)

The "String[] args" parameter allows you to pass command-line arguments to the program if needed.

------------------------------------------------------------------------------------------------------------

System.out.println("hello");

In Java, System is a class that provides access to the system resources and functionalities such as
input/output operations, environment variables, the current time, and more.
It is a built-in class that is part of the core Java API.

The System class contains several static fields and methods, including:

out: A static field of type PrintStream that represents the standard output stream.
 This is used for printing text to the console, which is what we're doing in the code System.out.println("hello");.

in: A static field of type InputStream that represents the standard input stream. T
his is used for reading input from the user through the console.

currentTimeMillis(): A static method that returns the current time in milliseconds since January 1, 1970.

getProperty(String key): A static method that retrieves the value of the specified system property.

And many more.

So in the code System.out.println("hello");,
we are using the out field of the System class to access the standard output stream,
and then using the println method of the PrintStream class to print the string "hello" to the console.







*/