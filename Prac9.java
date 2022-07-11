import java.util.Scanner;

public class Prac9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter number1 : ");
        int a = input.nextInt();
        System.out.print("Please, Enter number2 : ");
        int b = input.nextInt();
        int result = gcd(a, b); // method call
        System.out.println("GCD is : " + result);
    }

    public static int gcd(int a, int b) {
        int var = 1; // store the answer of gcd
        for (int i = 2; (i <= a && i <= b);) {
            if ((a % i) == 0 && (b % i) == 0) {
                var = var * i;
                a /= i;
                b /= i;
            } else if ((a % i) == 0)
                a /= i;
            else if ((b % i) == 0)
                b /= i;
            else
                i++;
        }

        return var;
    }

}
