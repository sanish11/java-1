import java.util.Scanner;
class	SumLoop
{
	public static void main(String args[])
	{
		int i,sum=0;
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter nth term: ");
		int n=sa.nextInt();

		for(i=0; i<=n; i++){
			sum += i;
		
		}
		System.out.println("Using For Loop, Sum upto" + n + ": " + sum);

		i=0;
		sum=0;
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println("Using while Loop, Sum upto" + n + ": " + sum);
	
		i = 0;
		sum = 0;
		do
		{
			sum+= i;
			i++;
		}while(i<=n);
		System.out.println("Using do while Loop, Sum upto" + n + ": " + sum);
	}
}