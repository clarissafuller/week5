import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {

        // create Scanner for user input
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the first 12 digits of an ISBN number
        System.out.print("Enter the first 12 digits of an ISBN number as a string: ");

        // read the input as a String
        String isbn = input.nextLine();

        // check if the input length is exactly 12
        if (isbn.length() != 12) {
            System.out.println(isbn + " is an invalid input");
            return;
        }

        // initialize sum variable for checksum calculation
        int sum = 0;

        // loop through each character in the string (index 0 to 11)
        for (int i = 0; i < isbn.length(); i++) {

            // convert the current character to an integer digit
            int digit = isbn.charAt(i) - '0';

            // if index is even, add digit * 1 to sum
            if (i % 2 == 0) {
                sum += digit;
            }
            // if index is odd, add digit * 3 to sum
            else {
                sum += digit * 3;
            }
        }

        // compute checksum using:
        // checksum = 10 - (sum % 10)
        int checksum = 10 - (sum % 10);

        // if checksum is 10, replace it with 0
        if (checksum == 10) {
            checksum = 0;
        }

        // display the full ISBN-13 number (input + checksum)
        System.out.println("The ISBN-13 number is " + isbn + checksum);
    }
}
