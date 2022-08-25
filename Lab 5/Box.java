import java.util.Scanner;
class Box{
 	
	public static void main(String[]args)
	{
		int a,v,width,height,depth;
		Box b=new Box();
		Scanner s=new Scanner(System.in);
		System.out.println("enter width,depth and height:");
		width=s.nextInt();
		depth=s.nextInt();
		height=s.nextInt();
		a=Area(width,height,depth);
		v=Volume(width,height,depth);
		Display(a,v);
	}
	static int Area(int width,int height,int depth)
	{
		return(2*(height * width) + 2*(height * depth) + 2*(width * depth));
	}
	static int Volume(int width,int depth,int height)
	{
		return(width*depth*height);
	}
	static void Display(int a,int v)
	{
		System.out.println("the area is:" +a+"the volume is:" +v);
	}
	}	