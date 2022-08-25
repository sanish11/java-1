class A{
	void print(){
		System.out.println("Class A");
	}
}
class B extends A{
	void print(){
		System.out.println("Class B");
	}
}
public class Q8DynamicMethodDispatch{
	public static void main(String[] args){
		A obj=new B();
		obj.print();
	}
}