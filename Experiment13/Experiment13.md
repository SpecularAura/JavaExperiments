---
header-includes:
- \usepackage{fontspec}
- \usepackage{fvextra}
- \setmainfont{Times New Roman}
- \setmonofont{Latin Modern Mono}
- \fvset{breaklines=true, breakanywhere=true}
- \renewcommand{\theFancyVerbLine}{\textcolor[rgb]{0.0,0.0,0.0}{\small\arabic{FancyVerbLine}}}
- \DefineVerbatimEnvironment{Highlighting}{Verbatim}{commandchars=\\\{\}, frame=leftline, numbersep=4pt, framesep=4pt}
fontsize: 12pt
geometry: left=3cm,right=3cm,top=2cm,bottom=2cm
---
\Huge
**Name:** Dyotak Kachare \newline \newline
**Div:** D6AD \newline \newline
**Roll No.** 26 \newline \newline 
**Experiment Title:** \newline       Program on User Defined Exceptions \newline
\normalsize
\newpage

\Large Code: \normalsize
```{.Java .numberLines}
import java.util.Scanner;

class TemperatureTooLowException extends Exception
{
    double temperature;
    TemperatureTooLowException(double temperature)
    {
        super("Temperature is less than " + temperature + " degrees");
        this.temperature = temperature;
    }
}

class UserDefinedException 
{
    public static void checkTemperature(double temperature, double threshold) throws TemperatureTooLowException
    {
        if(temperature < threshold)
        {
            throw new TemperatureTooLowException(threshold);
        }
    }
    public static double inputTemperature() throws TemperatureTooLowException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature: ");
        double temperature = sc.nextDouble();
        checkTemperature(temperature, 4);
        return temperature;
    }
    public static void main(String args[])
    {
        try
        {
            double temperature = inputTemperature();
            System.out.println("The temperature read is: " + temperature); 
        }
        catch(TemperatureTooLowException obj)
        {
            System.out.println("Exception Caught: ");
            System.out.println(obj);
        }
    }
}
```

\Large Ouput: \normalsize
```
Enter the Temperature: 3
Exception Caught: 
TemperatureTooLowException: Temperature is less than 4.0 degrees
```