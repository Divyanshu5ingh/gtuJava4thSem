import java.util.*;
public class Prac8
{
		public static void main(String[] args)
		{
			Scanner input= new Scanner(System.in);
			System.out.print("ENTER THE NUMBER: ");
			int num=input.nextInt();
			for(int i=2; i <= num;)
			{
				if(num%i==0)
				{
					System.out.print(i+",");
					num/=i;
				}	
				else
				{
					i++;
				}
			}
		}
}
