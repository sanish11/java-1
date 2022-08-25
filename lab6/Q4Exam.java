import java.util.*;
class student{
	int roll_no;
	void read(){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Roll no =");
		roll_no=s.nextInt();
	}
	void display(){
		System.out.println("Roll no = " +roll_no);
	}
}
class Test extends student{
	int a,b;
	void reads(){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter two marks = ");
		a=s.nextInt();
		b=s.nextInt();
	}
	void displays(){
		System.out.println("Marks = " +a+ " , " +b);
	}
}
class Result extends Test{
	int total;
	void getdata(){
		total=a+b;
	}
	void displaydata(){
		System.out.println("Total Marks = " +total);
	}
}
class Q4Exam{
	public static void main(String[] args){
		Result r=new Result();
		r.read();
		r.reads();
		r.getdata();
		r.display();
		r.displays();
		r.displaydata();
	}
}