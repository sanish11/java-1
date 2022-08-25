package JavaProgram.lab1;
import java.util.Scanner;
class circle{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter radius(R):");
	
	float	r=scan.nextFloat();
	
	float area= 3.14f * r * r;	
	float circumference= 2 * 3.14f * r;
	
	System.out.println("area  of circle= " +area);
	System.out.println("circumstance= " +circumference);
}
}