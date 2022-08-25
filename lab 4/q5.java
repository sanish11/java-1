import java.util.*;
class q5{
	public static void main(String[]args){
	int i,j,temp;
	Scanner sa=new Scanner(System.in);
	int a[]=new int[10];
	System.out.println("enter 10 numbers:");
	for(i=0;i<10;i++)
	{
	a[i]=sa.nextInt();
	}
	for(i=0;i<10;i++)
		{
		for(j=i+1;j<10;j++)
		{
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
		}
		}
	System.out.println("ascending numbers");
	for(i=0;i<10;i++)
	{
		System.out.println(a[i]);
	}
	for(i=0;i<10;i++)	
		{
		for(j=i+1;j<10;j++)
			{
			if(a[i]<a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
	System.out.println("numbers in descending form:");
	for(i=0;i<10;i++);	
	{
		System.out.println(a[i]);
	}
}
}