import java.util.*;
class Square{
	double length,area,perimeter;
	void area(){
		System.out.print("Enter length of Square= ");	
		Scanner s=new Scanner(System.in);
		length=s.nextDouble();
		double area=length*length;
		System.out.print("Area of Square = " +area);
	}
	void perimeter(){
		Scanner s=new Scanner(System.in);
		double perimeter=4*length;
		System.out.print("Perimeter of Square = " +perimeter);
	}
}
class Rectangle extends Square{
	double area,perimeter,length,breadth;
	void area(){
		System.out.print("Enter length and breadth of rectangle = ");
		Scanner s=new Scanner(System.in);
		length=s.nextDouble();
		breadth=s.nextDouble();
		double area=length*breadth;
		System.out.println("Area of Rectangle = "+area);
	}
	void perimeter(){
		Scanner s=new Scanner(System.in);
		double perimeter=2*(length+breadth);
		System.out.println("Perimeter of Rectangle = " +perimeter);
	}
}
class Q3Shapes{
	public static void main(String[] args){
		Rectangle r= new Rectangle();
		r.area();
		r.perimeter();
	}
}
