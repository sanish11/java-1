class Q20i
{
	public static void main(String args[])
	{		
		for(char i = 'E'; i >= 'A'; i--)
		{
			for(char k = 'E'; k > i; k--)
				System.out.print("  ");
			for(char j = 'A'; j <= i; j++)
				System.out.print(i + " ");
			System.out.print("\n");
		}
	}
}