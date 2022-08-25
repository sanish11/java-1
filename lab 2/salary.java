import java.util.Scanner;
class salary
{
	public static void main(String[]args)
	{
		Scanner sa= new Scanner(System.in);
		
		System.out.println("Enter Salary: ");
		float salary = sa.nextFloat();
		float tax;
		if(salary < 100000)
			{
				tax = 0;	
			}
		else if(salary < 150000)
			{
			tax = 15;
			}	
		else{
			tax = 25;
		}
		float taxAmount = salary * tax/100; 
		float amount = salary - taxAmount;
		System.out.println("Tax Amount: " + taxAmount);
		System.out.println("Actual Amount: " + amount);
	}
}