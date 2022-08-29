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
        System.out.println("Strings Before Swapping: " + "str1: " + str1+ " str2: "+ str2);
        String temp = str1;
        str1 = str2;
        str2 = temp;
        //Write about copying references and making a deep copy
        System.out.println("Strings After Swapping: " + "str1: " + str1+ " str2: "+ str2);
    }
}