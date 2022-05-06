// Vicki Young
// CS 112-01
// 2021.03.02

//creates a username from name input given by user
import java.util.Scanner;
import java.util.Random;
public class Username
{
	public static void main(String[] args)
	{
		//creates new Scanner object and new random number generator object
		Scanner enter = new Scanner(System.in);
		Random randGen = new Random();

		System.out.println("Welcome! Let's autogenerate a username for you!");

		System.out.println("What is your first name?");
		String firstName = enter.nextLine();

		System.out.println("What is your last name?");
		String lastName = enter.nextLine();

		//creates username by concatenating the following:
		// 1) firrst letter of user's first name
		// 2) first three letters of user's last name
		// 3) a random number in range 10-99

		//declares object username + initializes object randNum
		String username;
		int randNum = randGen.nextInt(90) + 10; 

		//converts all characters in firstName and lastName to lower case
		firstName = firstName.toLowerCase();
		lastName = lastName.toLowerCase();

		//concatenates
		username = firstName.charAt(0) + lastName.substring(0, 3) + randNum;

		//prints username		
		System.out.println("Your username is:");
		System.out.print(username);

	}
}