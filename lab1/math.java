package JavaProgram.lab1;
import java.util.Scanner;
class math{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	System.out.println("enter 2 num:");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int sum = a + b;
	int diff = a - b;
	int product = a * b;
	float divide = (float)a / b;
	int rem= a % b;
	System.out.println(a + " + " + b + " = " + sum);
	
	System.out.println(a + " * " + b + " = " + product);
	System.out.println(a + " / " + b + " = " + divide);
	System.out.println(a + " % " + b + " = " + rem);
}
}
	
	
	