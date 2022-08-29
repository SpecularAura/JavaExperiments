class CmdArgsParseNum
{
	public static void main(String args[])
	{
		int arr[] = new int[args.length];
		for(int i = 0; i < args.length; i++)
		{
			arr[i] = Integer.parseInt(args[i]);
		}
		for(int el : arr)
		{
			System.out.println(el);
		}
	}
}