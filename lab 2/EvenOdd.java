import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args) {

        Scanner sa = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sa.nextInt();
	String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
}
}
	