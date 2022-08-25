import java.util.Scanner;
class marks{
	public static void main(String[]args){
	Scanner sa=new Scanner(System.in);
	System.out.println("enter  marks of 5 subjet");
	int a=sa.nextInt();
	int b=sa.nextInt();
	int c=sa.nextInt();
	int d=sa.nextInt();
	int e=sa.nextInt();
	int p=(a+b+c+d+e)/5;
	if(p>=80)
	{
	System.out.println("Distinction");
	}
	else if(p>=60 && p<=79)
	{
	System.out.println("1st division");
	}
	else if(p>=45 && p<=59)
	{
	System.out.println("2nd division");
	}
	else if(p>=32 && p<=44)
	{
	System.out.println("3rd division");
	}
	else
	{
	System.out.println("fail");
	}
}
}
	
	
	