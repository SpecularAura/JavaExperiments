# Creating Clones of Objects in Java
There are two methods to create clones in Java  

- Using the [Cloneable Interface](#CloneableInterface)
- Using [Copy Constructors](#CopyConstructor)
- [Their Difference](#Difference)

## Using the Cloneable Interface
[This Link][CILink] Shows How to use the Cloneable Interface
### Code {#CloneableInterface}
```Java
import java.io.*;
class Test {
    int x, y;
    Test(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    Test()
    {
        Test(10, 20)
    }
}
class Main {
    public static void main(String[] args)
    {
        Test ob1 = new Test();
        System.out.println(ob1.x + " " + ob1.y);
        Test ob2 = ob1;
        ob2.x = 100;
        System.out.println(ob1.x + " " + ob1.y);
        System.out.println(ob2.x + " " + ob2.y);
    }
}
```
--------
## Using the copy constructor 
[This Link](CCLink) Shows How to create a copy using the Copy Constructor
### Code {#CopyConstructor}
```Java
public class Employee {
    private int id;
    private String name;
    private Date startDate;

    public Employee(Employee employee) {
        // Shallow Copy: For Immutable Objects and Primitive Data Types
        this.id = employee.id;
        this.name = employee.name;
        // Deep Copy: For Mutable Objects
        this.startDate = new Date(employee.startDate.getTime());
    }
}
```

## Difference Between these ways {#Difference}

1. The copy constructor is much easier to implement. We do not need to implement the Cloneable interface and handle CloneNotSupportedException.
2. The clone method returns a general Object reference. Therefore, we need to typecast it to the appropriate type.
3. We can not assign a value to a final field in the clone method. However, we can do so in the copy constructor.

----


[CILink]: https://www.geeksforgeeks.org/clone-method-in-java-2/
[CCLink]: https://www.baeldung.com/java-copy-constructor