package JavaProgram.lab1;
import java.util.Scanner;
public class cntimeter {
    public static void main(String[]args) {
        Scanner sa=new Scanner(System.in);
        System.out.println("enter num in centimeter:");
        int centi=sa.nextInt();
        double meter=(double)centi/100;
        System.out.println("in meter="+meter);

        
    }
    
}
