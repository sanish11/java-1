import java.util.Scanner;
class 10marks
{
	public static void main(String[]args)
	{
		float total=0;
		float[]a=new float[5];
		Scanner number= new Scanner(System.in);
		char grade;
		
		System.out.println("Enter mark of 5 subjects: ");
		for(inti =0;i<5;i++)
		{
			int j=i+1;
			System.out.println("Subject"+j+":");
			a[i]=number.nextFloat();
			total+=a[i];
		}
		float percentage=total/500*100;
		
		System.out.println("Total:"+total);
		System.out.println("Percentage:"+percentage);
	
		if(percentage>=80)
			grade='A';
		else if(percentage>=60)
			grade='B';
		else if(percentage>=50)
			grade='C';
		else if(percentage>=40)
			grade='D';
		else
			grade='E';
		
		System.out.println("Grade:"+grade);
	}
}