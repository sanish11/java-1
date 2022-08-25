import java.util.*;
class Maths{
	double num1,num2;
	void input(){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter two numbers = ");
		num1=n.nextDouble();
		num2=n.nextDouble();
	}
}
class Add extends Maths{
	void add(){
		double add=num1+num2;
		System.out.println("Addition = " +add);
	}
}
class Sub extends Maths{
	void sub(){
		double sub=num1-num2;
		System.out.println("Subtraction = " +sub);
	}
}
class Mul extends Maths{
	void mul(){
		double mul=num1*num2;
		System.out.println("Multiplication = " +mul);
	}
}
class Div extends Maths{
	void div(){
		double div=num1/num2;
		System.out.println("Division = " +div);
	}
}
class Rem extends Maths{
	void rem(){
		double rem=num1%num2;
		System.out.println("Remainder = " +rem);
	}
}
public class Q9Maths{
	public static void main(String[] args){
		Maths m = new Maths();
		m.add();
		m.sub();
		m.mul();
		m.div();
		m.rem();
	}
}