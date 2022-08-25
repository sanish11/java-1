import java.util.Scanner;
class leapyear{
	public static void main(String[]args){
		Scanner sa=new Scanner(System.in);
		System.out.println("enter a year");
		int i=sa.nextInt();
		if(i%400==0)
		{
		System.out.println(i+"is a leap year.");
		}
		else if(i%100==0)
		{
		System.out.println(i+"is not a leap year.");
		}
		else if(i%4==0)
		{
		System.out.println(i+"is a leap year.");
		}
		else
		{
		System.out.println(i+"is not a leap year.");
		}
	}
}