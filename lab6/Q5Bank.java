import java.util.*;
class Account{
	String customer_name,account_type;
	int account_number,balance;
}
class SavingAccount extends Account{
	int amount=0;
	void accept(){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter name = ");
		customer_name=s.nextLine();
		System.out.print("Enter a/c number = ");
		account_number=s.nextInt();
		System.out.print("Enter a/c type = ");
		account_type=s.next();
		System.out.print("Enter balance = ");
		balance=s.nextInt();
	}
	void display(){
		System.out.println("\nYour account after deposting the amount");
		System.out.println("Customer name = " +customer_name+ " \nAccount number = " +account_number+ "\nAccount Type = " +account_type+ "\nBalance = " +balance);
	}
	void withdraw(){
		int a;
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter amount to withdraw = ");
		a=s.nextInt();
		balance-=a;
		System.out.println("Your account after withdraw amount");
		System.out.println("Customer name = " +customer_name+ " \nAccount number = " +account_number+ "\nAccount Type = " +account_type+ "\nBalance = " +balance);
	}
}
public class Q5Bank{
	public static void main(String[] args){
		SavingAccount s1= new SavingAccount();
		s1.accept();
		s1.display();
		s1.withdraw();
		
	}
}