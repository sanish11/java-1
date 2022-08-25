import java.util.Scanner;
class factorial
{
	public static void main(String args[])
	{
		int fact = 1, i;
		Scanner sa=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sa.nextInt();
		for(i=1;i<=num;i++)
			fact*=i;
		System.out.println("using for loop: " + fact);                
		i=num;
		fact= 1;         
		while(i > 0)
		{
			fact*= i;
			i--;
		}			
		System.out.println("using while loop: "+fact);
		i=1;
		fact=1;
		do
		{
			fact*=i;
			i++;
		}while(i<=num);		
		System.out.println(" using do while loop: "+fact);
	}
}