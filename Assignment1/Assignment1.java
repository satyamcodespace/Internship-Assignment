import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Prompt for two integers
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        // Task 2: Prompt for a floating-point number
        System.out.print("Enter a floating-point number: ");
        double floatNum = sc.nextDouble();

        
        sc.nextLine();

        // Task 3: Prompt for a single character
        System.out.print("Enter a single character: ");
        char character = sc.nextLine().charAt(0);

        // Task 4: Prompt for a boolean value
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = sc.nextBoolean();

        sc.nextLine();

        // Task 5: Prompt for the user's name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println(); // Add a blank line for better formatting

        // Integer Calculations
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
        System.out.println("Difference between " + num1 + " and " + num2 + " is: " + (num1 - num2));
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + (num1 * num2));
        System.out.println("Quotient of " + num1 + " / " + num2 + " is: " + (num1 / num2) + " and remainder is: " + (num1 % num2));

        // Floating-point Calculations
        System.out.println(floatNum + " multiplied by 2 is: " + (floatNum * 2));
        System.out.println("Square of " + floatNum + " is: " + (floatNum * floatNum));

        // Character Operations
        System.out.println("The next character after '" + character + "' is: " + (char)(character + 1));
        System.out.println("The previous character before '" + character + "' is: " + (char)(character - 1));

        // Boolean Operations
        System.out.println("The opposite of " + boolValue + " is: " + !boolValue);
        System.out.println("Was the original value true? " + (boolValue ? "Yes" : "No"));

        // Name Greeting
        System.out.println("HELLO, " + name.toUpperCase() + "!");

        sc.close();
    }
}