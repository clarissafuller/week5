import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        // declare counters for positives and negatives
        int pos = 0;
        int neg = 0;
        // declare a variable for total (sum)
        double total = 0;
        // declare a variable for count of non-zero numbers
        int numberOfNumbers = 0;

        // prompt the user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        // loop: read integers until the user enters 0
        int number = input.nextInt();

        while (number != 0) {
            // classify number
           if(number >0) {
               // update totals and count
               // if number > 0, increment positive counter
               pos++;
           }
           // if number < 0, increment negative counter
           else {
               neg++;
           }
            // add number to total
           total += number;
            // increment count
           numberOfNumbers++;
            number = input.nextInt();
        }

        // if count is 0
        if(numberOfNumbers==0) {
            // display "No numbers are entered except 0"
            System.out.println("No numbers are entered except 0");
        }
        else {
            // else
            // compute average as a floating-point value
            double average = (double) total / numberOfNumbers;
            // display positives, negatives, total, and average
            System.out.println("The number of positives is "+ pos);
            System.out.println("The number of negatives is "+ neg);
            System.out.println("The total is "+ (double) total);
            System.out.println("The average is "+ average);
        }


    }
}