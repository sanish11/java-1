package JavaProgram.lab1;
import java.util.Scanner;
class cuboid{
	public static void main(String[]args)
	{
	Scanner sans=new Scanner(System.in);
	System.out.println("enter length,breadth and height of cuboid");
	int l=sans.nextInt();
	int b=sans.nextInt();
	float h=sans.nextInt();
	float c=l*b*h;
	System.out.println("cuboid="+c);
	}
}