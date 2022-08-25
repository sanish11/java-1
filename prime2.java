class prime2{
	public static void main(String args[])
	{
		System.out.println("Prime Numbers from 100-500: ");
		for(int i = 100; i < 500; i++)
		{
			boolean prime = true;
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					prime = false;			
					break;
				}
					
			}
			if(prime == true)
				System.out.println(i);
		
		}
		
		
	}
}