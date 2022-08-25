
package JavaProgram.lab1;
import java.util.Scanner;
class rectangle{
	public static void main(String[]args)
	{
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter length and breadth of rectangle:");
	int l=scan.nextInt();
	int b=scan.nextInt();
	int areaofrectangle=l*b;
	int perimeter=2*(l+b);
	System.out.println("Area of Rectangle="+areaofrectangle);
	System.out.println("perimeter="+perimeter);
	}
}