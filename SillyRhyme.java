// Vicki Young
// CS 112-01
// 2021.03.02

// output of this program is based upon nursery rhyme "Mary Had a Little Lamb"
import java.util.Scanner;
public class SillyRhyme
{
	public static void main(String[] args)
	{
		//create Scanner enter
		Scanner enter = new Scanner(System.in);

		System.out.print("Enter a name: ");
		String name = enter.nextLine();

		System.out.print("Enter an animal: ");
		String animal = enter.nextLine();

		System.out.print("Enter a part of that animal: ");
		String animalPart = enter.nextLine();

		System.out.print("Enter a color: ");
		String color = enter.nextLine();

		System.out.print("Enter something that is " + color + ": ");
		String colorItem = enter.nextLine();

		System.out.print("Enter an action: ");
		String action = enter.nextLine();

		System.out.println("\nHERE IS YOUR SILLY RHYME: ");
		System.out.println(name + " had a little " + animal + ",");
		System.out.println("Whose " + animalPart + " was " + color + " as " + colorItem + ".");
		System.out.println("And everywhere that " + name + " went,");
		System.out.println("The " + animal + " was sure to " + action + ".");


	}
}