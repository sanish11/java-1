import java.util.Scanner;
class days1{
	public static void main(String[]args){
	System.out.println("enter num of your choice");
	Scanner sa=new Scanner(System.in);
	int a=sa.nextInt();
	if(a==1)
	{
	System.out.println("Sunday");
	}
	else if(a==2)
	{
	System.out.println("Monday");
	}
	else if(a==3)
	{
	System.out.println("Tuesday");
	}
	else if(a==4)
	{
	System.out.println("wednesday");
	}
	else if(a==5)
	{
	System.out.println("Thursday");
	}
	else if(a==6)
	{
	System.out.println("Friday");
	}
	else if(a==7)
	{
	System.out.println("Saturday");
	}
	else
	{
	System.out.println("no num up than 7");
	}
	
}
}