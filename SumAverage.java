import java.util.Scanner;
class SumAverage
{
	public static void main(String args[])
	{
		int i, sum=0;
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter nth term: ");
		int n=sa.nextInt();

		for(i=0;i<=n;i++)
			sum+=i;
		float average=(float)sum/n;
		System.out.println("Summ: "+sum+"Average:"+ average);
	}
}