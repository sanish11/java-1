import java.util.Scanner;
class Sum{
	public static void main(String[]args){
	int sum=0;
	Scanner sa=new Scanner(System.in);
	System.out.println("enter 4 digit number:");
	int num=sa.nextInt();
	while(num>0)
	{
		int rem=num%10;
		num /=10;
		sum+=rem;
	}
	System.out.println("sum of each digit:"+sum);
	}
}