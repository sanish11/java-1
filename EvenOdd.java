import java.util.Scanner;
class EvenOdd{
 	public static void main(String[]args){
	int sumeven=0;
	int sumodd=0;
	for(int i=0;i<=100;i++)
	{
		if(i%2==0)
		{
		sumeven+=i;
		}
		else
		{
		sumodd+=i;
		}
	}
	System.out.println("sum of even="+sumeven);
	System.out.println("sum of odd="+sumodd);
	}
}
	
		
	