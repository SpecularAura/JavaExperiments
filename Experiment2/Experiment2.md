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
    System.out.println(( is0 ? ("The root is " + -b / (2*a)) : ("The roots are: " + ((-b + rootD) / (2*a)) + "and "+((-b - rootD) / (2*a)) )));
  }
}
```
```
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
        sc.close();
	}
}
```
```

```
## Study of different operators in java
### WAP to compare two numbers
```{.Java .numberLines}

```
```

```
### WAP to print truth table for java logical operators
```{.Java .numberLines}

```
```

```
### WAP to read the number & shift left & right by 3 bits
```{.Java .numberLines}

```
```

```