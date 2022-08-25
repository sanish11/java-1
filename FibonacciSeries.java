class FibonacciSeries
{
	public static void main(String args[])
	{
		int num1=0,num2=1,sum;
		System.out.println("Fabonacci Series upto 10th term: ");	
		System.out.println(num2);
		for(int i=2;i<10;i++)
		{
			sum=num1+num2;
			System.out.println(sum);
			num1=num2;
			num2=sum;			
		}
	}
}