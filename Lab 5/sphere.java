import java.util.Scanner;
class Sphere{
	final double pi=3.1416;
	double r,a,v;
	public static void main(String[]args)
	{
		Sphere sp=new Sphere();
		
		sp.GetData();
	}
	void GetData()
	{
		double ar,vr,dr;
		System.out.println("enter value of radius:");
		Scanner s=new Scanner(System.in);
		r=s.nextDouble();
		ar=Area(r);
		
		
	}
	int Area(Double r)
	{
		double vr;
	 	 a=4*pi*r*r;
		vr=Volume(r);
		DispData(a,vr);
		return 0;
		
		
	}
	Double Volume(Double r)
	{
		
		v=1.33*pi*r*r*r;
		return v;
		
	}
	void DispData(double a,double vr)
	{
		
		
		System.out.println("Area:"+ a +" volume=" +vr );
	}
	}		
		
	
		