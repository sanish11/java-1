import java.util.Scanner;
class marks_2
{
	public static void main(String[]args)
	{
		float total = 0;
		float[] mark = new float[5];
		Scanner number= new Scanner(System.in);
		char grade;
		
		System.out.println("Enter mark of 5 subjects: ");
		for(int i = 0; i < 5; i++)
		{
			int j = i + 1;
			System.out.println("Subject" + j + " : ");
			mark[i] = number.nextFloat();
			total += mark[i];
		}
		float percentage = total / 500 * 100;
		
		System.out.println("Total: " + total);
		System.out.println("Percentage: " + percentage);
	
		if(percentage >= 80)
			grade = 'A';
		else if(percentage >= 60)
			grade = 'B';
		else if(percentage >= 50)
			grade = 'C';
		else if(percentage >= 40)
			grade = 'D';
		else
			grade = 'E';
		
		System.out.println("Grade: " + grade);
	}
}