import java.util.Scanner;
class Series
{
	public static void main(String args[])
	{
		Scanner number=new Scanner(System.in);
		System.out.println("Enter nth term: ");
		int nth = number.nextInt();
		System.out.println("Series: ");
		System.out.println("1\nx");	
		for(int i=2;i<=nth;i++)
		{
			int temp=i,fact=1;
			while(temp!=1)
			{
				fact*=temp;
				temp--;
			}	 	
			System.out.println("x/" + fact);	
		}
	}
}