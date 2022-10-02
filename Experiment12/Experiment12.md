---
header-includes:
 - \usepackage{fontspec}
 - \usepackage{fvextra}
 - \setmainfont{Times New Roman}
 - \setmonofont{Consolas}
 - \fvset{breaklines=true, breakanywhere=true}
 - \renewcommand{\theFancyVerbLine}{\textcolor[rgb]{0.0,0.0,0.0}{\arabic{FancyVerbLine}}}
 - \DefineVerbatimEnvironment{Highlighting}{Verbatim}{commandchars=\\\{\}, frame=leftline, numbersep=4pt, framesep=4pt}
fontsize: 12pt
geometry: left=3cm,right=3cm,top=2cm,bottom=2cm
---
\huge Name: Aum Kulkarni  \newline
Divison: D6AD  \newline
Roll No 36  \newline
Experiment 12: Program on Exception handling  \newline

\normalsize
\newpage
Code: 
```{.Java .numberLines}
import java.util.Scanner;
class Experiment12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int sum = 100;
		int total;
		double fraction = 0;
		try
		{
			System.out.println("Enter the total attainable marks: ");
			total = sc.nextInt();
			fraction = (double)sum / (double)total;
			System.out.println("sum / total is: " + fraction);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dividing by zero isn't possible");
		}
		finally
		{
			System.out.println("sum / total is: " + fraction);
		}
	}
}
```
## Output: 
```
Enter the Number of items: 
0
Dividing by zero isn't possible
The number of items entered was: 0
```
```
Enter the Number of items: 
5
The number of items entered was: 5
```