class q12
{
	public static void main(String args[])
	{	
		System.out.println("The Armstrong numbers from 1-300: ");	
		for(int i=1; i<=300;i++)
		{
			int sum=0;
			int temp=i;
			while(temp>0)
			{
				int rem =temp%10;
				temp/=10;
				rem=rem*rem*rem;
				sum+=rem;
			}
			if(i==sum)
				System.out.println(i);
		}	
		
	}
}