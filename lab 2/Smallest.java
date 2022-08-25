import java.util.Scanner;
class Smallest{
	public static void main(String[] args) {
  int a,b,c,d,x,y,z;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter all four numbers:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
	d=s.nextInt();
        x=(a<b)?a:b;
	y=(c<d)?c:d;
	z=(x<y)?x:y;
        System.out.println("Smallest Number:"+z);
}
}
	