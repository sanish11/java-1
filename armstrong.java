import java.util.Scanner;
class Armstrong{
	
	public static void main(String[] args)  {  
   	Scanner sa=new Scanner(System.in);
	int c=0,a,temp;  
	System.out.println("enter a num to check");
    	int n=sa.nextInt();  
    	temp=n;  
    	while(n>0)  
    	{  
    	a=n%10;  
    	n=n/10;  
    	c=c+(a*a*a);  
    	}  
    	if(temp==c)  
    	System.out.println("armstrong number");   
    	else  
        System.out.println("Not armstrong number");   
   }  
}  
	