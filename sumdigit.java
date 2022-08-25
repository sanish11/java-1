import java.util.Scanner;
class sumdigit{
	public static void main(String[]args){
		Scanner sa=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sa.nextInt();
		 int sum=0, count=0;
       		 while(n!=0) {//n=1234
            	int d=n%10; //d=3
            	sum +=d; //sum=0+d	
            	n/= 10;
        }
        System.out.println("Sum of digits = " + sum);
	}
}