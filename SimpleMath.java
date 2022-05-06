// Vicki Young
// CS 112-01
// 2021.03.02

//asks the user for three floating-point numbers x, y, and z
//prints out 4 values
import java.util.Scanner;
public class SimpleMath
{
	public static void main(String[] args)
	{
		//creates new Scanner object
		Scanner enter = new Scanner(System.in);

		System.out.println("Please give me 3 values for x, y and z.");
		double x = enter.nextDouble();
		double y = enter.nextDouble();
		double z = enter.nextDouble();

		//x to the power of z
		double num1 = Math.pow(x, z);
		//x to the power of (y to the power of z)
		double num2 = Math.pow(x, Math.pow(y, z));
		//the absolute value of y
		double num3 = Math.abs(y);
		//square root of (xy to the power of z)
		double num4 = Math.sqrt(Math.pow(x * y, z));

		System.out.println("The output is:");
		System.out.println("x to the power of y: " + num1);
		System.out.println("x to the power of (y to the power of z): " + num2);
		System.out.println("the absolute value of y: " + num3);
		System.out.println("square root of (xy to the power of z): " + num4);

	}
}