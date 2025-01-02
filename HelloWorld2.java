// HelloWorld2.java

/**
 * A simple Java program with multiple features to demonstrate various aspects of Java programming.
 */

import java.util.*;

public class HelloWorld {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Print a greeting message
        System.out.println("Hello, World!");

        // Demonstrate working with variables
        String name = "Java Programmer";
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Welcome, " + name + "! The current year is " + year + ".");

        // Demonstrate a simple loop
        System.out.println("Here are the first 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Demonstrate using methods
        System.out.println("Factorial of 5 is: " + calculateFactorial(5));

        // Demonstrate array usage
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("The array contains:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Demonstrate working with lists
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println("Fruits in the list:");
        fruits.forEach(System.out::println);

        // Demonstrate exception handling
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Method to calculate the factorial of a number
    public static int calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    // Method to divide two numbers
    public static int divide(int a, int b) {
        return a / b;
    }
}
