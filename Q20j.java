class Q20j
{
	public static void main(String args[])
	{		
		for(char i = 'A'; i <= 'E'; i++)
		{
			for(char j = 'A'; j <= i; j++)
				System.out.print(i + " ");
			System.out.print("\n");
		}
	}
}