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