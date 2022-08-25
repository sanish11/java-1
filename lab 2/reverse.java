import java.util.Scanner;
class reverse
{
	public static void main(String args[])
	{
		
		int rev = 0;
		Scanner number= new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = number.nextInt();
		while(num > 0)
		{
			int rem = num % 10;
			num /= 10;
			rev = rev * 10 + rem;		
		}
		System.out.println("reverse: " + rev );
	}
}