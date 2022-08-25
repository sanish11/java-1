class Book{
	int book_id=1;
	int pages=2;
}
class FictionBooks extends Book{
	String name="Rohit";
}
public class Q1Books{
	public static void main(String[] args){
		FictionBooks f=new FictionBooks();
		System.out.println("Book id = " +f.book_id);
		System.out.println("Pages = "+f.pages);
		System.out.println("Name = "+f.name);
	}
} 