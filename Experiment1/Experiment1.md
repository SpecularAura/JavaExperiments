# Experiment 1 - Write a program using command line argument in java
### Echoing Command-Line Arguments:  
```{.Java .numberLines}
class CommandArgsEcho
{
  public static void main(String args[])
  {
        for(String str : args)
        {
            System.out.println(str);
        }
    }
}
```
**Output :**
```
java CommandArgsEcho Hello World from main 
Hello
World
from
main
```

### Parsing Numeric Command-Line arguments
```{.Java .numberLines}
class CmdArgsParseNum
{
    public static void main(String args[])
    {
        int sum = 0;
        for(int i = 0; i < args.length; i++)
        {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("The Sum of all the integers is: " + sum);
    }
}
```
**Output :**
```
java CmdArgsParseNum 1 2 3 4 5 
The Sum of all the integers is: 15
```