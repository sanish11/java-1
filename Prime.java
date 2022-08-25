import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		boolean prime=true;
		Scanner sa=new Scanner(System.in);	
		System.out.println("Enter a number: ");
		int num=sa.nextInt();
		for(int i=2;i<num; i++)
		{
			if(num%i==0)
			prime=false;				
		}
		if(prime==true)
			System.out.println(num + " is a prime number." );
		else
			System.out.println(num + " is not a prime number");	
	}
}