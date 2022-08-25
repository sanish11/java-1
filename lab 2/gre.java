import java.util.Scanner;
class gre{
	public static void main(String[]args){
	Scanner sa=new Scanner(System.in);
	System.out.println("enter 3 numbers");
	int a=sa.nextInt();
	int b=sa.nextInt();
	int c=sa.nextInt();
	if(a>b&&a>c)
	{
	System.out.println(a+"is greatest");
	}
	else if(b>a&&b>c)
	{
	System.out.println(b+"is greatest");
	}
	else
	System.out.println(c+"is greatest");
	}
}
