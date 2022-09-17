To add a little more info to the answers you already got:

Java has two types of storage. One is the stack, which includes variable names and their values. One is the heap, that is just a huge collections of free-floating objects.

Now, if you're working with primitive types (like int, boolean or char), assigning a variable like
int myInt = 1;
pushes that variable on thje stack - the name is myInt, the value is 1.

If you, however, have an object (like strings are), assigning a variable does a little bit more.
String myString = "Hey!";
now creates an object (instance of String) somewhere on the heap. It has no name there, only some address in the memory where it can be found.
In addition to that, it pushes a variable on the stack. The name is myString - and the value is the address of the object on the heap.

So why is this relevant to comparing variables? Because == compares values of variables. ON THE STACK, that is. SO if you compare primitive types, everything works as expected. But if you're comparing Objects, == still only compares the values of the variables - which is, in that case, the addresses to the objects. If the addresses are the same, it returns true. That does mean, both variables point to the same object. If the addresses are different, == returns false., Without ever looking at the heap, where the objects really are.

An example:

String a = new String("Hey!");
String b = a;
if (a == b) System.out.println("true");
else System.out.println("false");
will echo "true" - because both variables contain the same object.

String a = new String("Hey!");
String b = new String("Hey!");
if (a == b) System.out.println("true");
else System.out.println("false");
will echo "false" - because you have two objects on the heap now, and a points to the one, while b points to the other. So while the contents of both objects may be the same, the contents of a and b on the stack are different.

Therefore, to compare any object, always use .equals() if you want to compare contents, not instance-equality.

[Addendum]: With strings, this is even more complicated. As you already found out already,

String a = "Hey!"; // mention the difference to the example above:
String b = "Hey!"; // I did NOT use the `String()` cosntructor here!
if (a == b) System.out.println("true");
else System.out.println("false");
will actually give you "true". Now why is THAT? One might think that we still create two objects. But actually, we are not.

String is immutable. That means, once a String has been created, it cannot be modified. Ever. Don'T believe that? Take a look!

String myString = "test"; // we create one instance of String here
myString += " and more"; // we create another instance of String (" and more")
                         // and append that. Did we modify the instance stored in
                         // myString now? NO! We created a third instance that
                         // contains "test and more".
Therefore, there is no need to create additional instances of String with the same content - which increases performance, as Strings are widely used, in masses, so we want to have as few of them as possible. To archive that, the JVM maintains a list of String Objects we already created. And every time we write down a String literal (that is something like "Hey!"), it looks in that lists and checks if we already created an instance that has that value. If so, it returns a pointer to that exact same instance instead of creating a new one.

And THIS is, why "Hey!" == "Hey!" will return true.

Source: [StackOverFlow](http://stackoverflow.com/a/19966154/2284641)

## Static Import:

There are situations where you need frequent access to static final fields (constants) and static methods from one or two classes. Prefixing the name of these classes over and over can result in cluttered code. The static import statement gives you a way to import the constants and static methods that you want to use so that you do not need to prefix the name of their class.

The java.lang.Math class defines the PI constant and many static methods, including methods for calculating sines, cosines, tangents, square roots, maxima, minima, exponents, and many more. For example,

public static final double PI = 3.141592653589793;

public static double cos(double a) {
    ...
}
Ordinarily, to use these objects from another class, you prefix the class name, as follows.

double r = Math.cos(Math.PI * theta);
You can use the static import statement to import the static members of java.lang.Math so that you don't need to prefix the class name, Math. The static members of Math can be imported either individually:

import static java.lang.Math.PI;
or as a group:

import static java.lang.Math.*;
Once they have been imported, the static members can be used without qualification. For example, the previous code snippet would become:

double r = Math.cos(PI * theta);
Obviously, you can write your own classes that contain constants and static methods that you use frequently, and then use the static import statement. For example,

import static mypackage.MyConstants.*;
Note: Use static import very sparingly. Overusing static import can result in code that is difficult to read and maintain, because readers of the code will not know which class defines a particular static object. Used properly, static import makes code more readable by removing class name repetition.

Source: [Dev Java](https://dev.java/learn/packages/#:~:text=Copy-,The%20Static%20Import%20Statement,-There%20are%20situations)