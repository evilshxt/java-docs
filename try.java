// Your first Java task will go here
// Follow the instructions below to get started!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // ==================== USER INPUT WITH SCANNER ====================
        System.out.println("What is your name:: ");
        String name = input.nextLine();

        System.out.println("What is your age:: ");
        int age = input.nextInt();
        input.nextLine(); // Consume leftover newline

        System.out.println("What is your height:: ");
        double height = input.nextDouble();
        input.nextLine(); // Consume leftover newline

        System.out.printf("Name: %s\nAge: %d\nHeight: %.1f\n", name, age, height);

        // Age in 5 years
        int age_in_5_years = age + 5;
        System.out.printf("Age in 5 years: %d\n", age_in_5_years);

        // Conditional logic
        if (age < 18) {
            System.out.println("You are a minor");
        } else {
            System.out.println("You are an adult");
        }

        if (height > 5.5) {
            System.out.println("Your height is above average.");
        } else {
            System.out.println("You are short asf");
        }

        // Ternary operator
        String status = (age >= 18) ? "adult" : "minor";
        System.out.println("You are a " + status);

        // Switch statement
        System.out.println("Enter favorite day number (1-7 for Monday-Sunday): ");
        int dayNumber = input.nextInt();
        input.nextLine(); // Consume newline

        switch (dayNumber) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day number!");
        }

        // String methods
        System.out.println("Your name in uppercase: " + name.toUpperCase());
        System.out.println("Your name length: " + name.length());
        System.out.println("Your name contains 'a': " + name.contains("a"));
        System.out.println("Your name starts with 'E': " + name.startsWith("E"));

        // ==================== NUMERIC OPERATIONS & TYPE CONVERSION ====================
        System.out.println("\n--- Numeric Types & Conversion ---");

        // 🔸 Integer vs floating-point division
        int intDiv = 5 / 2;           // Truncates → 2
        double floatDiv = 5.0 / 2;    // → 2.5
        System.out.println("5 / 2 (int) = " + intDiv);
        System.out.println("5.0 / 2 (double) = " + floatDiv);

        // 🔸 Casting: double → int (fractional part TRUNCATED, not rounded)
        double original = 123.99;
        int truncated = (int) original;
        System.out.println("Casting " + original + " to int → " + truncated);

        // ⚠️ DISCLAIMER: Unlike Python, Java is STRICTLY TYPED.
        // You CANNOT assign a double to an int without explicit casting.
        // Example: int x = 3.14; → COMPILER ERROR!
        // Always use (int) or parse methods for safe conversion.

        // 🔸 Increment/Decrement Operators
        int counter = 10;
        System.out.println("\n--- ++ and -- Operators ---");
        System.out.println("counter = " + counter);
        System.out.println("Post-increment (counter++): " + counter++); // prints 10, then 11
        System.out.println("Now counter = " + counter);
        System.out.println("Pre-decrement (--counter): " + --counter); // becomes 10, prints 10

        // 🔸 Math Class Utilities
        System.out.println("\n--- Math Functions ---");
        double radius = 5.0;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.printf("Circle area (r=5): %.2f\n", circleArea);

        System.out.println("√144 = " + Math.sqrt(144));
        System.out.println("Random [0,1): " + Math.random());

        // Round to 2 decimal places
        double precise = 3.14159;
        double rounded = Math.round(precise * 100.0) / 100.0;
        System.out.println("Rounded to 2 decimals: " + rounded);

        // 🔸 Character Handling
        System.out.println("\n--- Characters & Escape Sequences ---");
        char letter = 'A';
        System.out.println("Character: " + letter);
        System.out.println("Unicode value: " + (int) letter); // 65

        // Escape sequences
        System.out.println("He said: \"Java is fun!\"\n\t...and it really is.");

        // ==================== PRACTICAL ASSIGNMENTS FROM SLIDES ====================

        // 🔸 Time Conversion: Seconds → Minutes + Seconds
        System.out.println("\n--- Time Conversion (Seconds → Min:Sec) ---");
        System.out.print("Enter time in seconds: ");
        int totalSeconds = input.nextInt();
        input.nextLine();
        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;
        System.out.println(totalSeconds + " seconds = " + minutes + " min " + remainingSeconds + " sec");

        // 🔸 String-to-Number Parsing
        System.out.println("\n--- String-to-Number Parsing ---");
        System.out.print("Enter a number as text (e.g., \"42\"): ");
        String numText = input.nextLine();
        try {
            int parsedInt = Integer.parseInt(numText);
            System.out.println("Parsed integer: " + parsedInt);
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Not a valid integer!");
        }

        // ==================== BUFFEREDREADER DEMONSTRATION ====================
        System.out.println("\n--- BufferedReader Example (for large/fast input) ---");
        System.out.print("Enter a line using BufferedReader: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String brInput = br.readLine();
        System.out.println("You entered (via BufferedReader): " + brInput);

        // Note: To read numbers with BufferedReader, you must parse manually:
        // int num = Integer.parseInt(br.readLine());

        // Close resources
        br.close();
        input.close();

        // ==================== ARRAYS AND LOOPS SECTION ====================
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Purple"};

        System.out.println("\n=== Traditional For Loop ===");
        for (int i = 0; i < colors.length; i++) {
            System.out.println((i + 1) + ". " + colors[i]);
        }

        System.out.println("\n=== Enhanced For-Loop ===");
        for (String color : colors) {
            System.out.println("- " + color);
        }

        System.out.println("\n=== While Loop ===");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + (count + 1));
            count++;
        }

        System.out.println("\n=== Array Operations ===");
        System.out.println("Array length: " + colors.length);
        System.out.println("First element: " + colors[0]);
        System.out.println("Last element: " + colors[colors.length - 1]);
        colors[1] = "Light Blue";
        System.out.println("Modified second element: " + colors[1]);

        System.out.println("\n=== Nested Loops ===");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        System.out.println("\n=== Break and Continue ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue;
            if (i == 8) break;
            System.out.println("Number: " + i);
        }

        // ==================== METHODS SECTION ====================
        System.out.println("\n=== Methods Demonstration ===");
        printWelcome(name);
        int sum = addNumbers(age, 5);
        System.out.println("Your age + 5 = " + sum);
        System.out.println("Is your age even? " + isEven(age));
        System.out.println(greet(name));
        System.out.println(greet(name, "Mr./Ms."));
        System.out.println("First color: " + getFirstColor(colors));
    }

    // ==================== CUSTOM METHODS ====================
    public static void printWelcome(String name) {
        System.out.println("🎉 Welcome to Java Learning, " + name + "!");
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String greet(String name) {
        return "Hello, " + name;
    }

    public static String greet(String name, String title) {
        return "Hello, " + title + " " + name;
    }

    public static String getFirstColor(String[] colorArray) {
        if (colorArray.length > 0) {
            return colorArray[0];
        } else {
            return "No colors available";
        }
    }
}