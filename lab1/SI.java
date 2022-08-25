package JavaProgram.lab1;
import java.util.Scanner;
class SI{
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter priciple:");
	int p=scan.nextInt();
	System.out.println("enter time:");
	float t=scan.nextFloat();
	System.out.println("enter rate:");
	int r=scan.nextInt();
	double SimpleIntrest=(double)(p*t*r)/100;
	System.out.println("SI="+SimpleIntrest);
	}
}