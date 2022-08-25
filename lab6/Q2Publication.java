import java.util.*;
class Publication{
	String title;		
	int price;
}
class Book extends Publication{
	int pages;
	void getdata(){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter title,price & pages= ");
		title=s.next();
		price=s.nextInt();
		pages=s.nextInt();
	}
	void putdata(){
		System.out.println("Title = " +title+ ", Price = " +price+ ", Pages= " +pages);
	}
}
class CDROM extends Publication{
	int playtime;
	void getdata(){
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter Enter title,price & playtime= ");
		title=s.next();
		price=s.nextInt();
		playtime=s.nextInt();
	}
	void putdata(){
		System.out.println("Title = " +title+ ", Price = " +price+ ", Playtime = " +playtime);
	}
}
public class Q2Publication{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Book b=new Book();
		CDROM c= new CDROM();
		b.getdata();
		b.putdata();
		c.getdata();
		c.putdata();
	}
}
