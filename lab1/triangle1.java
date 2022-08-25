package JavaProgram.lab1;
import java.util.Scanner;

public class triangle1 {
    public static void main(String[]args) {
    
    Scanner sa=new Scanner (System.in);
    System.out.println("enter height and base of triangle");
   int h=sa.nextInt();
   int b=sa.nextInt();
   float area=(b*h);
   System.out.println("area="+area);
    }

    
}
