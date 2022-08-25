class Q20h
{
	public static void main(String args[])
	{		
		for(char i = 'E'; i >= 'A'; i--)
		{
			for(char j = 'A'; j <= i; j++)
				System.out.print(i + " ");
			System.out.print("\n");
		}
	}
}