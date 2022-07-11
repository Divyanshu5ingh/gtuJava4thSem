import java.util.Scanner;

public class Prac15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Binary Number: ");
        String binaryNumber = input.next();
        try {
            int decNumber = bin2Dec(binaryNumber);
            System.out.print("Dec Number: " + decNumber);
        } catch (NumberFormatException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public static int bin2Dec(String binaryNumber) {
        int result = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            char currBinVal = binaryNumber.charAt(binaryNumber.length() - i - 1);
            if (currBinVal != '0' && currBinVal != '1')
                throw new NumberFormatException("Entered string is not a binary number.");
            else if (currBinVal == '1')
                result = result + (int) Math.pow(2, i);
        }
        return result;
    }
}