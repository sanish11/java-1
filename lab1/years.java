package JavaProgram.lab1;
import java.util.Scanner;


public class years {
    public static void main(String[]args){
        
                Scanner sa=new Scanner(System.in);
                 int x, years, months,days,rem;
                 System.out.println("Enter num of day:");
                    x=sa.nextInt();
                    years=x/365;
                    rem=x%365;
                    months=rem/30;
                    days=rem%30;

                  
        System.out.println(years + " Years " + months + " Months " + days + " Days");
                   
    }
    
} 
