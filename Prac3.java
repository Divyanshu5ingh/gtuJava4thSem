import java.util.Scanner;
public class Prac3
{
	public static void main(String[] args)
	{
		System.out.print("Enter length in meter = ");
		Scanner input = new Scanner(System.in);
		double meter = input.nextDouble();
		double feet = meter*3.28084;
		System.out.print("Length in feet = "+ feet);
	}
}
