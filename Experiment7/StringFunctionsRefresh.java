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
		System.out.println("Returns 0 if str1 == \"Hello\": " + str1.compareTo("Hello")); // compareTo()
		System.out.println("str1 == \"Hello\": " + str1.equals("Hello"));        // equals()
		System.out.println( "str1 == \"Hello\" After trimming: " + str1.trim().equals("Hello")); // trim()
		System.out.println("str2.compareToIgnoreCase(\"world\"): " + str2.compareToIgnoreCase("world"));// compareToIgnoreCase()
		System.out.println("Compare str2.toLowerCase() and \"World\" ignoring the case: " + str2.toLowerCase().equalsIgnoreCase("World"));// toLowerCase() & equalsIgnoreCase()
		System.out.println("str3.toUpperCase(): " + str3.toUpperCase()); // toUpperCase()
		System.out.println("Replace First occurence of \"Java\" with \"Command Prompt\": "+ str5.replaceFirst("Java", "Command Prompt")); // replaceFirst()
		System.out.println("Replace All occurences of \"Java\" with \"Command Prompt\": " + str5.replaceAll("Java", "Command Prompt")); // replaceAll()
		System.out.println("Does str5.replaceAll(\"Java\", \"Command Prompt\") contains \"Java\": "+ str5.replaceAll("Java", "Command Prompt").contains("Java")); // contains()
		System.out.println("str5 ends with \"Java\": " + str5.endsWith("Java")); // endsWith()
		StringBuilder s = new StringBuilder(str3); // For using contentEquals which takes a CharSequence parameter
		System.out.println("Content of s equals content of str3: " + str3.contentEquals(s)); // contentEquals()
		System.out.println("\"\" is empty: " + "".isEmpty()); // isEmpty()
		System.out.println("Replace first occurence of I with O in str4: " + str4.replace('I', 'O')); // replace()
		System.out.println("Length of str5: " + str5.length()); // length()
		System.out.println("Character at index 3 in str5: " + str5.charAt(3)); // charAt()
		System.out.println("Substring of str5 from the index of where \"Java\" is found: " + str5.substring(str5.indexOf("Java"))); // substring()
		char arr[] = str1.toCharArray(); // toCharArray()
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == ' ')
			{
				arr[i] = '_';
			}
		}
		System.out.print("Replacing spaces with underscore in arr: ");
		System.out.print(arr);
	}
}