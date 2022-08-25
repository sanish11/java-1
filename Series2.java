import java.util.Scanner;
class Series2
{
	public static void main(String args[])
	{
		System.out.println("Series of 7th term: ");
		for(int i=1;i<=7;i++)
		{
			int temp=i, fact=1;
			while(temp!=1)
			{
				fact*=temp;
				temp--;
			}	 	
			System.out.println(i+"/"+fact);	
		}
	}
}