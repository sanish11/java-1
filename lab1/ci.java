package JavaProgram.lab1;
import java.util.Scanner;
public class ci {
    public static void main() {
        Scanner sa=new Scanner (System.in);
        System.out.println("enter principle,amt,time,rate and year");
        int principle=sa.nextInt();
        int amt=sa.nextInt();
        int time=sa.nextInt();
        float rate=sa.nextInt();
        int year=sa.nextInt();
        float interest = (float)(principle * Math.pow(1 + rate, time));
		interest -= principle;
		System.out.println("Compund Interest: " + interest);
        
    }
    
}
