class Parent{
	int a=5;
	Parent(){
		System.out.println("Parent Property I");
	}
	public void disData(){
		System.out.println("Parent Property II");
	}
}
class Child extends Parent{
	int a=10;
	Child(){
		super();
		System.out.println("Child Property");
	}
	public void display(){
		System.out.println("Parent a= "+super.a);
		System.out.println("Child a= "+a);
		super.disData();
	}
}
public class Q15SuperKeyword{
	public static void main(String[] args){
		Child c = new Child();
		c.display();
	}
}