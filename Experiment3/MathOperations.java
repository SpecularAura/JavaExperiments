import java.util.Scanner;
class MathOperations
{
    public static double cube(double num)
    {
        return num*num*num;
    }


    public static void main(String args[])
    {
        int i = 10;
        i = (int) cube(i);
        System.out.println(i);
    }
}