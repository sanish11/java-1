class Divisible
{
	public static void main(String args[])
	{
		int count = 0, sum = 0;
			
		System.out.println("Number divisible by 7 but not by 5: ");
		for(int i=100; i<200; i++)
		{
			if(i%7==0&&i%5!=0)
			{
				System.out.println(i);
				count++;
				sum+=i;
			}			
		}
		System.out.println( "Sum:"+sum);
	}
}