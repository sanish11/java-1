import java.util.Scanner;
class Greatest{
	public static void main(String[] args) {
  int a,b,c,d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter all three numbers:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=(a>b)?((a>c)?a:c):(b>c)?b:c;
        System.out.println("Largest Number:"+d);
}
}
	