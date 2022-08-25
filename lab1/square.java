package JavaProgram.lab1;
import java.util.Scanner;
class square{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("enter length of square:");	
	int l=scan.nextInt();
	int areaofsquare=l*l;
	System.out.println("Area of square="+areaofsquare);
	int perimeter=4*l;
	System.out.println("Area of perimeter="+perimeter);
	}
	}