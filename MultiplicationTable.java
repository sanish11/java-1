import java.util.Scanner;
class MultiplicationTable
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter number to be multiplied : ");
		 n=sa.nextInt();
		for(i =1; i<10; i++)
		System.out.println(n+"x"+i+"="+n*i);
		
	}
}