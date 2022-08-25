import java.util.Scanner;
class PositiveNegative{
	public static void main(String[] args) {

        Scanner sa = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sa.nextInt();
	String positivenegative = (num> 0) ? "positive" : "negative";

        System.out.println(num + " is " + positivenegative);
}
}
	