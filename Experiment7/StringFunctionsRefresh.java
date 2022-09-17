// charAt()
// compareTo()
// compareToIgnoreCase() 
// concat()
// contains()
// contentEquals()
// endsWith()
// equals()
// equalsIgnoreCase()
// indexOf()
// isEmpty()
// length()
// replace()
// replaceAll()
// replaceFirst()
// sunstring()
// toCharArray()
// toLowerCase()
// toUpperCase()
// trim()
import java.util.Scanner;
class StringFunctions
{
	public static void main(String args[])
	{
		String str1 = "    Hello";
		String str2 = "World";
		String str3 = "From Java";
		String str4 = "In Java";
		String str5 = str3.concat(" ").concat(str4);
		System.out.println(str1.contentEquals("Hello")); // contentEquals()
		System.out.println(str1.equals("Hello"));        // equals()
		System.out.println(str1.trim().equals("Hello")); // trim()
		System.out.println(str2.compareToIgnoreCase("World"));// compareToIgnoreCase()
		System.out.println(str2.toLowerCase().equalsIgnoreCase("World"));// toLowerCase() & equalsIgnoreCase()
		System.out.println(str3.toUpperCase()); // toUpperCase()
		System.out.println(str5.replaceFirst("Java", "Command Prompt"));
		System.out.println(str5.replaceAll("Java", "Command Prompt"));
		System.out.println(str5.replaceAll("Java", "Command Prompt").contains("Java"));
		System.out.println(str5.endsWith("Java"));
		StringBuilder s = new StringBuilder(str3);
		System.out.println(str3.contentEquals(s));
		System.out.println("".isEmpty());
		System.out.println(str4.replace('I', 'O'));
		System.out.println(str5.length());
		System.out.println(str5.charAt(3));
		System.out.println(str5.substring(str5.indexOf("Java")));
		char arr[] = str1.toCharArray();
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == ' ')
			{
				arr[i] = '_';
			}
		}
		System.out.println(arr);
	}
}