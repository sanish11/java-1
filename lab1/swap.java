package JavaProgram.lab1;
import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner sa=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=sa.nextInt();
        int b=sa.nextInt();
        int t=0;
        System.out.println("before swapping a and b="+a+b);
        t=a;
        a=b;
        b=t;
       
        System.out.println("After swapping a and b="+a+b);



    }
    
}
