package dev.jessicabathel;

public class Main {

    public static void main(String[] args) {
	    /*
	    Using the for statement, call the calculateInterest method with
        the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        and print the results to the console window
        */
        for (int i = 2; i <= 8; i++) {
            System.out.println("$10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        /*
        How would you modify the for loop above to do the same thing as
        shown but to start at 8% and work back to 2%
         */
        for (int i = 8; i >= 2; i--) {
            System.out.println("$10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        /*
        Create a for statement using any range of numbers
        Determine if the number is a prime number using the isPrime method
        if it is a prime number, print it out AND increment a count of the
        number of prime numbers found
        if that count is 3 exit the for loop
        hint: Use the break; statement to exit
         */
        int count = 0;
        for (int i = 6; i <= 100; i++) {

            if (isPrime(i)) {
                System.out.println(i);
                count++;
                if (count == 3) {
                    break;
                }
            }

        }
        System.out.println("Total Prime Numbers: " + count);
    }

    // Check if Prime Number
    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Calculate Interest Rate
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


}
