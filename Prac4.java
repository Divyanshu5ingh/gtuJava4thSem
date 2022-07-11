import java.util.Scanner;
public class Prac4
{
		public static void main(String[] args)
		{	
			double weight, height,bmi;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter weight in pounds: ");
			weight = sc.nextDouble()*0.4539237;
			System.out.print("Enter height in inches: ");
			height=sc.nextDouble()*0.0254;
			bmi = weight/(height*height);
			System.out.print("BMI = "+ bmi);
		}
}
