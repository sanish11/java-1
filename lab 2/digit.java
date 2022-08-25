import java.util.Scanner;
class digit{
	public static void main(String args[])
	{
		Scanner number= new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = number.nextInt();
		while(num > 0)
		{
			int rem = num % 10;
			num =num/10;
			System.out.println(rem);		
		}	
	}
}