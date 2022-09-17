import java.util.Scanner;
class Pallindrome
{
	public static void main(String args[])
	{
		String in = "Hello";
		char str[] = in.toCharArray();
		char rev[] = new char[str.length];
		for(int i = 0; i < str.length; i++)
		{
			rev[i] = str[str.length - 1 - i];
		}
		System.out.println("The String is " + (in.equals(rev.toString()) ? "Pallindrome" : "Not Pallindrome"));
		System.out.println("Capitalized String: " + in.toUpperCase());
	}
}