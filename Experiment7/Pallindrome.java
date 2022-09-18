import java.util.Scanner;
class Pallindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String in = sc.next();
		char str[] = in.toCharArray();
		char rev[] = new char[str.length];
		for(int i = 0; i < str.length; i++)
		{
			rev[i] = str[str.length - 1 - i];
		}
		System.out.println("The String is " + (in.equals(new String(rev)) ? "Pallindrome" : "Not Pallindrome"));
		System.out.println("Capitalized String: " + in.toUpperCase());
	}
}