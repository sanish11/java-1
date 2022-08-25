class Q19_Square_1_100
{
	public static void main(String args[])
	{		
		System.out.println("Square of number not divisible by 7: ");	
		for(int i = 1; i <= 100; i++)
		{
			if(i % 7 != 0)		
				System.out.println(i * i);	
		}
	}
}