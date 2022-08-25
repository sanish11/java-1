interface A{
	void fa();
}
interface B extends A{
	void fb();
}
class XYZ implements B{
	public void fa(){
		System.out.println("XYZ:fa");
	}
	public void fb(){
		System.out.println("XYZ:fb");
	}
}
public class Q18InterfaceExtendingInterface{
	public static void main(String[] args){
		XYZ o = new XYZ();
		o.fa();
		o.fb();
	}
}