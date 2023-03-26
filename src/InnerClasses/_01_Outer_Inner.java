package InnerClasses;

public class _01_Outer_Inner {

    static int a=1;
    final int b=2;

    public void print(){
        System.out.println("I am in inner class");
    }


    public static void main(String[] args) {
        System.out.println(new _01_Outer_Inner().new Inner().c);

    }

    class Inner{
        int c=a*2;


    }
}
/*
Note: The relationship between outer class and inner class is not IS-A relationship, and it is Has-A relationship.

Inside inner class we can't declare static members/methods. Hence, it is not possible to declare main() method, and
we can't invoke inner class directly from the command prompt.

From inner class we can access all members of outer class
(both static and non-static, private and non-private methods and variables) directly.

Within the inner class "this" always refers current inner class object.
 To refer current outer class object we have to use "outer class name.this".

 The applicable modifiers for outer classes are:
public ,default ,final,abstract,strictfp

 The applicable modifiers for inner classes are:
public ,default ,final,abstract,strictfp    + private , protected, static.

If we are declaring inner class inside instance method then
we can access both static and non static members of outer class directly.

But if we are declaring inner class inside static method then
we can access only static members of outer class directly and we can't access instance members directly.

 */


