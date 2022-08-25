import java.util.Scanner;
class character
{
	public static void main(String[]args)
	{
		Scanner sa= new Scanner(System.in);
		System.out.println("Enter character: ");
		char i= sa.next().charAt(0);
		if((i>= 65 && i<= 90) || (i>= 97 && i<= 122))
			System.out.println("Character is an Alphabet");
		else if(i>= '0' && i<= '9')
			System.out.println("Character is a Number.");
		else
			System.out.println("Character is a Special Character.");
	}
}