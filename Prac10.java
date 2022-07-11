import java.util.Scanner;
public class Prac10
{
		public static void main(String[] args)
		{
			int[] list = new int[10];
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter 10 numbers: ");
			for(int i = 0; i < list.length; i++)
				list [i]=input.nextInt();
			System.out.println("\nOriginal array: ");
			for(int i = 0; i < list.length; i++)
				System.out.print(list[i] + " ");
			reverse(list);
			System.out.println("\nReversed array: ");
			for(int i = 0; i < list.length; i++)
				System.out.print(list[i] + " ");
		}
		public static void reverse(int[] list)
		{
			for(int i = 0; i < list.length/2; i++)
			{
				int temp = list[i];
				list[i] = list[list.length-1-i];
				list[list.length-1-i] = temp;
			}
		}
}
