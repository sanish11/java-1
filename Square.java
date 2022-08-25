class Square
{
	public static void main(String args[])
	{		
		System.out.println("Square of number not divisible by 11: ");	
		for(int i=1;i<=100;i++)
		{
			if(i%11!= 0)		
				System.out.println(i*i);	
		}
	}
}