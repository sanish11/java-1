class Parent{
	void add(){
		System.out.println("Add");
	}
}
class Child extends Parent{
	void subtract(){
		System.out.println("Subtract");
	}
}
public class Q7SupernSubClass{
	public static void main(String[] args){
		Parent p = new Child();
		p.add();
	}
}