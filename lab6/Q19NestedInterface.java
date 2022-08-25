interface MyInterfaceA{
	void display();
	interface MyInterfaceB{
		void myMethod();
	}
}
class NestedInterfaceDemo1 implements MyInterfaceA.MyInterfaceB{
	public void myMethod(){
		System.out.println("Nested interface method");
	}
}
public class Q19NestedInterface{
	public static void main(String[] args){
		MyInterfaceA.MyInterfaceB o = new NestedInterfaceDemo1();
		o.myMethod();
	}
}