import java.util.Scanner;
class Q18_Series
{
	public static void main(String args[])
	{
		System.out.println("Series (7th term): ");
		for(int i = 1; i <= 7; i++)
		{
			int temp = i, fact = 1;
			while(temp != 1)
			{
				fact *= temp;
				temp--;
			}	 	
			System.out.println(i + "/" + fact);	
		}
	}
}