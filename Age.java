import java.util.Scanner;
class Age
{
	public static void main(String args[])
	{
		int[]age=new int[10];
		int count=0;
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter age of 10 people: ");
		for(int i = 0; i < 10; i++)	
		{
			age[i] = sa.nextInt();
			if(age[i]>=25 && age[i]<=50)			
				count++;
		}	
		System.out.println("The count of age between 25-50: " + count);		
	}
}