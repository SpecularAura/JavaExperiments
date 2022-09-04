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