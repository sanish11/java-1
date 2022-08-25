import java.util.Scanner;
class smol{
	public static void main(String[]args){
	int small;
	Scanner sa=new Scanner(System.in);
	System.out.println("enter 4 numbers");
	int a=sa.nextInt();
	int b=sa.nextInt();
	int c=sa.nextInt();
	int d=sa.nextInt();
	if(a<b && a<c && a<d)
	{
	small=a;
	}
	else if(b<c && b<d )
	{
	small=b;
	}
	else if(c<d)
	{
	small=c;
	}
	else 
	{
	small=d;
	}
	System.out.println("smallest="+small);
}
}
