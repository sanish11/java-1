import java.util.*;
abstract class Fmachine{
	abstract void getdata();
	abstract void putdata();
}
class Airplane extends Fmachine{
	int code, capacity;
	String name;
	Scanner s=new Scanner(System.in);
	public void getdata(){
		System.out.print("Enter Code, Name and Capacity = ");
		code=s.nextInt();
		name=s.next();
		capacity=s.nextInt();
	}
	public void putdata(){
		System.out.println("Code = " +code+ "\nName = " +name+ "\nCapacity = " +capacity);
	}
}
public class Q10Airline{
	public static void main(String[] args){
		Airplane a=new Airplane();
		a.getdata();
		a.putdata();
	}
}