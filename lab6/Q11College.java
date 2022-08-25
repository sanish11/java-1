import java.util.Scanner;
abstract class College{
	int college_id;
	String college_name;
	abstract void get();
	abstract void put();
}
class Student extends College{
	int roll;
	String name, address;
	Scanner s=new Scanner(System.in);
	void get(){
		System.out.print("Enter College ID,College Name, Roll, Name and Address = ");
		college_id=s.nextInt();
		college_name=s.next();
		roll=s.nextInt();
		name=s.next();
		address=s.next();
	}
	void put(){
		System.out.println("College ID = " +college_id+ "\nCollege Name = " +college_name+ "\nRoll = " +roll+ "\nName = " +name+ "\nAddress = "+address);
	}
}
public class Q11College{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.get();
		s1.put();
 	}
}