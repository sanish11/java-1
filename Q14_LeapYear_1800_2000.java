class Q14_LeapYear_1800_2000
{
	public static void main(String args[])
	{
		System.out.println("Leap Years (1800 - 2000): ");
			
		for(int i = 1800; i <= 2000; i++)	
		{
			if(i % 400 == 0)	
				System.out.println(i);
			else if(i % 100 == 0);
			else if(i % 4 == 0)
				System.out.println(i);
			else;
		}		
	}
}