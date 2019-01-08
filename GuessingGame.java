import java.util.Scanner;
public class GuessingGame {

	public static void main(String []args){


		Scanner input = new Scanner(System.in);


		System.out.println("Guess my secret number: ");


		int value = input.nextInt();

		if (value == 27){
			System.out.println("Congrats bro");
			System.out.println("Thats Right!!.");
		}
		else if (value < 11) System.out.println("higher");
		else if (value > 11) System.out.println("lower");
		{
			System.out.println("Not it dude.");
			System.out.println("Try again?");
		}
	}
}