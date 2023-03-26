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

The only applicable modifiers for method local inner classes are:
final
abstract
strictfp


The main objective of anonymous inner classes is "just for instant use".
There are 3 types of anonymous inner classes

Anonymous inner class that extends a class.
Anonymous inner class that implements an interface.
Anonymous inner class that defined inside method arguments.


Note: Inside Anonymous inner classes we can take or declare new methods but
outside anonymous inner classes we can't call these methods directly because we are depending on parent reference.
[parent reference can be used to hold child class object but by using that reference we can't call child specific methods].
 These methods just for internal purpose only.


 anonymous inner classes are best suitable to define call back functions in GUI components

 General Class
1) A general class can extends only one class at a time.
2) A general class can implement any no. Of interfaces at a time.
3) A general class can extends a class and can implement an interface simultaneously.
4) In normal Java class we can write constructor because we know name of the class.

 Anonymous Inner Class
 1) Ofcource anonymous inner class also can extends only one class at a time.
 2) But anonymous inner class can implement only one interface at a time.
 3) But anonymous inner class can extends a class or can implements an interface but not both simultaneously.
 4) But in anonymous inner class we can't write constructor because anonymous inner class not having any name.


 Static nested classes:
 Sometimes we can declare inner classes with static modifier such type of inner classes are called static nested classes.

In the case of normal or regular inner classes without existing outer class object
there is no chance of existing inner class object.
i.e., inner class object is always strongly associated with outer class object.

But in the case of static nested class without existing outer class object
 there may be a chance of existing static nested class object.
i.e., static nested class object is not strongly associated with outer class object.


Inside static nested classes we can declare static members including main() method also.
 Hence it is possible to invoke static nested class directly from the command prompt.

 From the normal inner class we can access both static and non-static members of outer class
 but from static nested class we can access only static members of outer class.



Normal /regular inner class
1) Without existing outer class object there is no chance of existing inner class object.
 That is inner class object is always associated with outer class object.
 2) Inside normal or regular inner class we can't declare static members.
3) Inside normal inner class we can't declare main() method and
hence we can't invoke regular inner class directly from the command prompt.
4) From the normal or regular inner class we can access both static and non static members of outer class directly.



	Static nested class
	1) Without existing outer class object there may be a chance of existing static nested class object.
	That is static nested class object is not associated with outer class object.
	 2) Inside static nested class we can declare static members.
	 3) Inside static nested class we can declare main() method and
	  hence we can invoke static nested class directly from the command prompt.
	  4) From static nested class we can access only static members of outer class directly.


Various possible combinations of nested class & interfaces :

1. class inside a class :
Without existing one type of object, if there is no chance of existing another type of object,
then we should go for clas inside a class.

class University {
  class Department {
   }
}


2. interface inside a class :
We can declare interface inside a class.

class X {
 interface Y {
  }
}
Inside class if we required multiple implements of an interface and these implementations of relevant to a perticular class,
 then we should declare interface inside a class.


 3. interface inside a interface :
We can declare an interface inside another interface.

interface Map {
 interface Entry {
  public Object getKey();
  public Object getValue();
  public Object getValue(Object  new );
  }
}

Nested interfaces are always public,static whether we are declaring or not.
 Hence we can implements inner inteface directly with out implementing outer interface.
interface Outer {
 public void methodOne();
 interface Inner {
  public void methodTwo();
 }
}

class Test implements  Outer.Inner {
 public void methodTwo() {
  System.out.println("Inner interface method");
 }
 public static void main(String args[]) {
  Test t=new Test();
  t.methodTwo();
 }
}
Whenever we are implementing Outer interface , it is not required to implement Inner interfaces.
class Test implements Outer {
 public void methodOne() {
  System.out.println("Outer interface  method ");
 }
 public static void main(String args[]) {
  Test t=new Test();
  t.methodOne();
 }

}
i.e., Both Outer and Inner interfaces we can implement independently.

4. class inside a interface :
We can declare a class inside interface. If a class functionality is closely associated with the use interface then
 it is highly recommended to declare class inside interface
Example:

interface EmailServer {
 public void sendEmail(EmailDetails e);

 class EmailDetails {
  String from;
  String to;
  String subject;
 }
}
In the above example Emaildetails functionality is required for EmailService and we are not using anyware else . Hence we can declare EmailDetails class inside EmailService interface .

We can also declare a class inside interface to provide default implementation for that interface.
Example :

interface Vehicle {
 public int getNoOfWheels();

 class DefaultVehicle implements  Vehicle {
  public int getNoOfWheels() {
   return 3;
  }
 }
}

class Bus implements Vehicle {
 public int getNoOfWheels() {
  return 6;
 }
}

class Test {
 public static void main(String args[]) {
  Bus b=new Bus();
  System.out.println(b.getNoOfWheels());

  Vehicle.DefaultVehicle d=new Vehicle.DefaultVehicle();
  System.out.println(d.getNoOfWheels());
 }
}
In the above example DefaultVehicle in the default implementation of Vehicle interface where as
Bus customized implementation of Vehicle interface.
The class which is declared inside interface is always static ,hence we can create object directly without
having outer interface type object.


Nesting interfaces are always public, static whether we are declaring or not.
class which is declared inside interface is always public,static whether we are declaring or not.




 */


