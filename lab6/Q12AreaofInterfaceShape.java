import java.util.*;
interface Shape{
	abstract void get_data();
	abstract void display_area();
}
class Rectangle implements Shape{
	int length,breadth;
	public void get_data(){
		System.out.print("Enter length and breadth of rectangle = ");
		Scanner s=new Scanner(System.in);
		length=s.nextInt();
		breadth=s.nextInt();
	}
	public void display_area(){
		System.out.println("Area of rectangle = " +(length*breadth));
	}
}
class Triangle implements Shape{
	int breadth,height;
	public void get_data(){
		System.out.print("Enter breadth and height of triangle = ");
		Scanner s=new Scanner(System.in);
		breadth=s.nextInt();
		height=s.nextInt();
	}
	public void display_area(){
		System.out.println("Area of rectangle = " +(height*breadth)/2);
	}
}
public class Q12AreaofInterfaceShape{
	public static void main(String[] args){
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		r.get_data();
		t.get_data();
		r.display_area();
		t.display_area();
	}
}