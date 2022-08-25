import java.util.Scanner;
class Triangle{
	double base,height,area;
	public static void main(String[]args){
		Triangle q=new Triangle();
		q.getData();
	}
	void getData(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter height and base of triagle:");
		height=s.nextDouble();
		base=s.nextDouble();
		calcArea(base ,height);
	}
	void calcArea(double base,double height){
	area=0.5*base*height;
	display(area);
	}
	void display(double area)
	{
	System.out.println("the height of trianlge is:" +height);
	System.out.println("the base of triangle is:" +base);
	System.out.println("the area is:" +area);
	}
}
	
