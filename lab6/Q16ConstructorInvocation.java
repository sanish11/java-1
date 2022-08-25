class GrandParent{
	GrandParent(){
		System.out.println("My property");
	}
}
class Parent extends GrandParent{
	Parent(int a){
		super();
		System.out.println("His property");
	}
}
class Child extends Parent{
	Child(){
		super(10);
		System.out.println("No property");
	}
}
public class Q16ConstructorInvocation{
	public static void main(String[] args){
		Child c = new Child();
	}
}