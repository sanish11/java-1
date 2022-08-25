import java.util.Scanner;
class Rectangle{
	int length ,breadth;
	public static void main(String[]args)
	{
	Rectangle r= new Rectangle();
	r.Readdata();
	}
	void Readdata(){
		int a,p;
		Scanner s=new Scanner(System.in);
		System.out.println("enter length and breadth of the triangle:");
		length=s.nextInt();
		breadth=s.nextInt();
		a=Area(length,breadth);
		p=Perimeter(length,breadth);
		Display(a,p);
	}
	int Area(int length,int breadth){
		return(length*breadth);
	}
	int Perimeter(int length,int breadth){
		return(2*(length+breadth));
	}
	void Display(int a,int p)
	{
		System.out.println("the area is:"+a);
		System.out.println("the perimeter is:"+p);
	
	}
	}
	
	