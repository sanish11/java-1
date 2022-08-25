import java.util.Scanner;
public class divide {
   
        
            public static void main(String[]args){
                Scanner sa=new Scanner(System.in);
                System.out.println("enter 2 numbers");
                int a=sa.nextInt();
                int b=sa.nextInt();
                float remainder=(float)a%b;
                float quotient=(float)a/b;
                System.out.println("remainder="+remainder);
                System.out.println("quotient="+quotient);
            
        
        
    }
    
    
}
