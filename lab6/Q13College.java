import java.util.Scanner;
interface College{
	int college_id=1;
	String college_name="NCCS";
	abstract void get();
	abstract void put();
}
class Student implements College{
	int roll;
	String name, address;
	Scanner s=new Scanner(System.in);
	public void get(){
		System.out.print("Enter Roll, Name and Address = ");
		roll=s.nextInt();
		name=s.next();
		address=s.next();
	}
	public void put(){
		System.out.println("College ID = " +college_id+ "\nCollege Name = " +college_name+ "\nRoll = " +roll+ "\nName = " +name+ "\nAddress = "+address);
	}
}
public class Q13College{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.get();
		s1.put();
 	}
}