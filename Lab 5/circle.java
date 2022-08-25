import java.util.*;
class circle{
	double radius,area,pi=3.14;

	public static void main(String[]args)
	{
	circle ci=new circle();
	ci.getdata();
	}
	void getdata(){
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter radius");
		radius=sa.nextDouble();
		calcArea(radius);
		}
	void calcArea(double radius){
		area=2*pi*pi;
		display(area);
	}
	void display(double area){
	System.out.println("the area of circle is:"+area);
	}
}
		
