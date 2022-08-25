import java.util.Scanner;
class q11_b{public static void main(String args[])
	{
		int rev = 0;
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = number.nextInt();
		int temp = num;
			
		while(num > 0)
		{
			int rem = num % 10;
			num /= 10;
			rev = rev * 10 + rem;
		}
		if(rev == temp)
			System.out.println("The value "+ temp + " is Palindrome number");
		else
			System.out.println("The value "+ temp + " is not Palindrome number");
	}
}
	