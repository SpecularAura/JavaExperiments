# Programs using accepting input through keyboard

### Print the Fibonacci series upto the nth term taking the value of n from the user.
```{.Java .numberLines}
import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to print: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for( int i = 0; i < n  ; i++)
        {
            System.out.print(a + "  ");
            b = b + a;
            a = b - a;
        }
    }
}
```
**Output :**
```
Enter the number of terms to print: 10
0  1  1  2  3  5  8  13  21  34
```
### WAP to reverse the given no.
```{.Java .numberLines}
import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rem, rev = 0;
        while(num > 0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println("The Reverse of the given number is: " + rev);
    }
}
```
**Output :**
```
Enter a number: 1234
The Reverse of the given number is: 4321
```
### WAP to calculate area & circumference of circle
```{.Java .numberLines}
import java.util.Scanner;
class AreaCircumference
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle: ");
        int radius = sc.nextInt();
        double area = Math.PI*Math.pow(radius, 2);
        double circumference = 2*Math.PI*radius;
        System.out.println("The circumference is " + circumference +
                           " and the Area is "+ area);
    }
}
```
**Output :**
```
Enter the radius of the Circle: 4
The circumference is 25.132741228718345 and the Area is 50.26548245743669
```
### WAP to swap given two strings
```{.Java .numberLines}
import java.util.Scanner;
class Swap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();
        System.out.println("Strings Before Swapping: " + "str1: " +
                            str1+ " str2: "+ str2);
        String temp = str1;
        str1 = str2;
        str2 = temp;
        //Write about copying references and making a deep copy
        System.out.println("Strings After Swapping: " + "str1: " + 
                            str1+ " str2: "+ str2);
    }
}
```
**Output :**
```
Enter a string: Hi
Enter another string: There
Strings Before Swapping: str1: Hi str2: There
Strings After Swapping: str1: There str2: Hi
```
### WAP to convert temperature from Fahrenheit to Celsius
```{.Java .numberLines}
import java.util.Scanner;
class FarenheitToCelsius
{
    public static int toCelsius(int farenheit)
    {
        return (farenheit - 32) * 5 / 9;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Farenheit: ");
        int fahrenheit = sc.nextInt();
        int celsius = toCelsius(fahrenheit);
        System.out.print("The temperature in Celsius: " + celsius);
    }
}
```
**Output :**
```
Enter the temperature in Farenheit: 32
The temperature in Celsius: 0
```
### WAP to find a square, square root, and Cube of a given no. using abstraction
```{.Java .numberLines}
// WAP to find a square, square root, and Cube of a given no. using abstraction
import java.util.Scanner;
class MathOperations
{
    public static double cube(double num)
    {
        return num*num*num;
    }

    public static double square(double num)
    {
        return num*num;
    }

    public static double sqrt(double num)
    {
        double i;
        for(i = 0; !(i*i > num); i = i + 0.01);
        return i;
    }
    public static void main(String args[])
    {
        int i = 10;
        i = (int) cube(i);
        int j = 100;
        j = (int) sqrt(j);
        System.out.println(j);
        System.out.println(i);
    }
}
```
**Output :**
```
Enter a number: 100
Enter the operation: 1. Square 2. Square Root 3. Cube 4. Exit: 1
10000
Enter the operation: 1. Square 2. Square Root 3. Cube 4. Exit: 2
10
Enter the operation: 1. Square 2. Square Root 3. Cube 4. Exit: 3
1000000
Enter the operation: 1. Square 2. Square Root 3. Cube 4. Exit: 4
```