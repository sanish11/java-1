package JavaProgram.lab1;
import java.util.Scanner;
class fahrenheit{
	public static void main(String[]args){
	Scanner sans=new Scanner(System.in);
	System.out.println("enter temp in celcius=");
	float c=sans.nextFloat();
	double f=1.8*(c)+32;
	System.out.println("celcius to fahrenheit="+f);
	}
}