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