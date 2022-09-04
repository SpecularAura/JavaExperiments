---
fontsize: 12pt
geometry: margin=20mm
---

# Experiment 2 

## Programs on Basic programming constructs like branching and looping
### WAP to print the roots of quadratic equation.
```{.Java .numberLines}
// a. WAP to print the roots of quadratic equation
import java.util.Scanner;
class Roots{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the coefficients of the quadratic equation");
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    int D = (b*b - 4*a*c);
    double rootD = Math.sqrt(D);
    boolean is0 = (D == 0);
    System.out.println(( is0 ? ("The root of the equation is " + -b / (2*a)) : 
                               ("The roots are: " + 
                               ((-b + rootD) / (2*a)) + "and "+
                               ((-b - rootD) / (2*a)) )));
  }
}
```
**Output :**
```
Enter the coefficients of the quadratic equation
1
-2
1
The root of the equation 1
```
### WAP to check if entered number is a prime number.
```{.Java .numberLines}
import java.util.Scanner;
class TestPrime{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num, i;
		System.out.println("Enter a number");
		num = sc.nextInt();
		for( i = 2; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				System.out.println("The Number is not prime");
				break;
			}
		}
        if(i == num / 2 + 1)
        {
            System.out.println("The number is prime");
        }
	}
}
```
**Output :**
```
Enter a number
35
The Number is not prime
```
## Study of different operators in java
### WAP to compare two numbers
```{.Java .numberLines}
import java.util.Scanner;
class TestCompare
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("The greater number is: " + ((num1 > num2) ? num1: num2));
    }
}
```
**Output :**
```
Enter two numbers: 
45
65
The greater number is: 65
```
### WAP to print truth table for java logical operators
```{.Java .numberLines}
class LogicalOperators
{
    public static void main(String args[])
    {
        boolean a = false;
        boolean b = false;
        System.out.println("A | B | !A  | A && B  | A || B ");
        for(int i = 0; i < 4; i++)
        {
            if( i == 2){a = !a;}
            System.out.printf("%d | %d |  %d  |    %d    |    %d  \n", 
                              a ? 1 : 0, b ? 1 : 0, (!a ? 1 : 0), 
                              (a && b ? 1 : 0), (a || b ? 1 : 0));
            b = !b;
        }
    }
}
```
**Output :**
```
A | B | !A  | A && B  | A || B 
0 | 0 |  1  |    0    |    0  
0 | 1 |  1  |    0    |    1
1 | 0 |  0  |    0    |    1  
1 | 1 |  0  |    1    |    1
```
### WAP to read the number & shift left & right by 3 bits
```{.Java .numberLines}
import java.util.Scanner;
class BitShift
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("The number left shifted thrice: " + (num << 3));
        System.out.println("The number right shifted thrice: " + (num >> 3));
    }
}
```
**Output :**
```
Enter an integer: 8
The number left shifted thrice: 64
The number right shifted thrice: 1
```