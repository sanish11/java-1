import java.util.*;
abstract class Lecturer{
	int id;
	String name;
	abstract void getdata();
	abstract void putdata();
}
class Part_Time extends Lecturer{
	int payperhour;
	void getdata(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ID, Name and Payperhour = ");
		id=s.nextInt();
		name=s.next();
		payperhour=s.nextInt();
	}
	void putdata(){
		System.out.println("Information of parttimer ");
		System.out.println("ID = " +id+ "\nName = " +name+ "\nPayperhour = "+payperhour);
	}
}
class Full_Time extends Lecturer{
	int paypermonth;
	void getdata(){
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter ID, Name and Paypermonth = ");
		id=s.nextInt();
		name=s.next();
		paypermonth=s.nextInt();
	}
	void putdata(){
		System.out.println("Information of fulltimer ");
		System.out.println("ID = " +id+ "\nName = " +name+ "\nPayperhour = "+paypermonth);
	}
}
class Q6Lecturer{
	public static void main(String[] args){
		Part_Time p = new Part_Time();
		Full_Time f = new Full_Time();
		p.getdata();
		p.putdata();
		f.getdata();
		f.putdata();
	}
	
}