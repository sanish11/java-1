import java.util.Scanner;
class Square{
	public static void main(String[]args){
	Scanner sa=new Scanner(System.in);
	System.out.println("enter 4 digit num:");
	int n=sa.nextInt();
	int sum=0;
	while(n>0)
	{
	int rem=n%10;
	n=n/10;
	rem=rem*rem;
	sum +=rem;
	}
	System.out.println("Square sum ="+sum);
}
}
	