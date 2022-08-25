import java.util.Scanner;
class q12_math{
	public static void main(String[]args){
		Scanner sa=new Scanner(System.in);
		int i,a,b;
		System.out.println("Enter two numbers: ");	
		 a = sa.nextInt(); 
		 b = sa.nextInt();
		System.out.println("1)Add\n2)Substract\n3)Multiply\n4)Division");
		System.out.println("enter num for operation:");
		 i=sa.nextInt();
		switch(i)
		{
		case 1:
			int sum = a + b;
			System.out.println(a + " + " + b + " = " + sum);
			break;
		case 2:
			int diff = a - b;
			System.out.println(a + " - " + b + " = " + diff);
			break;
		case 3:
			int mul = a * b;
			System.out.println(a + " * " + b + " = " + mul);
			break;
		case 4:
			float div = (float)a / b;
			System.out.println(a + " / " + b + " = " + div);
			break;
		default:
			System.out.println("error 104");
		
		}
	}
}
	
		
		