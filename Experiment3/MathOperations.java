// WAP to find a square, square root, and Cube of a given no. using abstraction
import java.util.Scanner;
class Operations
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
        for(i = 0; i*i < num; i = i + 0.0001);
        return i;
    }
}
class MathOperations
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int choice, num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        while(!exit)
        {
            System.out.print("Enter the operation: 1. Square 2. Square Root 3. Cube 4. Exit: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println((int)Operations.square(num));
                    break;
                case 2:
                    System.out.println((int)Operations.sqrt(num));
                    break;
                case 3:
                    System.out.println((int)Operations.cube(num));
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        }
    }
}