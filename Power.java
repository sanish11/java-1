import java.util.Scanner;
class Power
{
	public static void main(String args[])
	{
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter base number x: ");
		int base=sa.nextInt();
		System.out.println("Enter power y: ");
		int power=sa.nextInt();
		int result = 1;
        	for(int i=0;i<power;i++)
        	{
            	result = base * result;
        	}
        	System.out.println(base+"^"+power+" = "+result);
		
	}
}