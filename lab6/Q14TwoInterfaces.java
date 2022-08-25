import java.util.*;
interface Publication{
	String title="Kathmandu Post";
	int price=15;
	abstract void getdata();
	abstract void display();
}
interface Sale{
	int publishsales=1500;
	abstract void getdata();
	abstract void display();
}
class Book implements Publication,Sale{
	int pages;
	Scanner s=new Scanner(System.in);
	public void getdata(){
		System.out.print("Enter Pages = ");
		pages=s.nextInt();
	}
	public void display(){
		System.out.println("Title = " +title+ "\nPrice = " +price+ "\nPublish Sales = "+publishsales+ "\nPages = " +pages);
	}
}
public class Q14TwoInterfaces{
	public static void main(String[] args){
		Book b=new Book();
		b.getdata();
		b.display();
	}
}