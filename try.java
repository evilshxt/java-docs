// Your first Java task will go here
// Follow the instructions below to get started!

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name:: ");
        String name = input.nextLine();

        System.out.println("What is your age:: ");
        int age = input.nextInt();
        input.nextLine(); // Consume leftover newline

        System.out.println("What is your height:: ");
        double height = input.nextDouble();
        input.nextLine(); // Consume leftover newline

        System.out.printf("Name: %s\nAge: %d\nHeight: %.1f", name, age, height);

        int age_in_5_years = age + 5;
        System.out.printf("Age in 5 years: %d\n", age_in_5_years);

        if (age<18) {
            System.out.println("You are a minor");
        } else {
            System.out.println("You are an adult");
        }

        if (height>5.5) {
            System.out.println("Your height is above average:: ");
        } else {
            System.out.println("You are short asf");
        }
        
        // There is also something called tenary statements we can use instead of if else for just 2 options
        String status = (age >= 18) ? "adult" : "minor";
        System.out.println("You are a " + status);

        // Switch statement example
        System.out.println("Enter favorite day number (1-7 for Monday-Sunday): ");
        int dayNumber = input.nextInt();
        input.nextLine(); // Consume leftover newline

        switch(dayNumber) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day number!");
        }

        // String methods demonstration
        System.out.println("Your name in uppercase: " + name.toUpperCase());
        System.out.println("Your name length: " + name.length());
        System.out.println("Your name contains 'a': " + name.contains("a"));
        System.out.println("Your name starts with 'E': " + name.startsWith("E"));

        // ==================== ARRAYS AND LOOPS SECTION ====================
        
        // Create an array of colors - fixed size of 5 elements
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Purple"};
        
        // Traditional for loop - full control with index, condition, and increment
        System.out.println("\n=== Traditional For Loop ===");
        System.out.println("Available colors:");
        for (int i = 0; i < colors.length; i++) {  // i=0, i<5, i++
            System.out.println((i + 1) + ". " + colors[i]);  // Access element by index
        }
        
        // Enhanced for-loop (for-each) - simpler when you don't need index
        System.out.println("\n=== Enhanced For-Loop ===");
        System.out.println("Colors using for-each:");
        for (String color : colors) {  // Automatically gets each element
            System.out.println("- " + color);
        }
        
        // While loop - condition only, manual increment required
        System.out.println("\n=== While Loop ===");
        int count = 0;  // Initialize counter outside loop
        System.out.println("Counting to 3:");
        while (count < 3) {  // Only condition check
            System.out.println("Count: " + (count + 1));
            count++;  // Manual increment - very important!
        }
        
        // Array operations and methods
        System.out.println("\n=== Array Operations ===");
        System.out.println("Array length: " + colors.length);  // Get array size
        System.out.println("First element: " + colors[0]);      // Access by index
        System.out.println("Last element: " + colors[colors.length - 1]);  // Last element
        colors[1] = "Light Blue";  // Modify element at index 1
        System.out.println("Modified second element: " + colors[1]);
        
        // Nested loops - loop inside another loop
        // IMPORTANT: Inner loop finishes COMPLETELY before outer loop increments again
        System.out.println("\n=== Nested Loops ===");
        System.out.println("Multiplication table 2x2:");
        System.out.println("Execution order will be:");
        System.out.println("i=1 → j=1, j=2 → i=2 → j=1, j=2");
        
        for (int i = 1; i <= 2; i++) {        // Outer loop: controls rows
            for (int j = 1; j <= 2; j++) {    // Inner loop: controls columns
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            // Inner loop completely finishes here, then outer loop increments
        }
        
        /*
        EXECUTION TREE (what actually happens):
        
        i = 1 (outer loop starts)
        ├── j = 1 (inner loop) → prints "1 x 1 = 1"
        ├── j = 2 (inner loop) → prints "1 x 2 = 2"
        └── inner loop FINISHED, outer loop increments i to 2
        
        i = 2 (outer loop continues)
        ├── j = 1 (inner loop RESETS) → prints "2 x 1 = 2"
        ├── j = 2 (inner loop) → prints "2 x 2 = 4"
        └── inner loop FINISHED, outer loop increments i to 3 (stops)
        
        Total: 4 prints, not just "2 x 2 = 4"!
        */
        
        // Break and continue in loops
        System.out.println("\n=== Break and Continue ===");
        System.out.println("Numbers 1-10 (skip 5, stop at 8):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;  // Skip this iteration
            }
            if (i == 8) {
                break;     // Exit loop completely
            }
            System.out.println("Number: " + i);
        }

        // ==================== METHODS SECTION ====================
        
        // Call our custom methods
        System.out.println("\n=== Methods Demonstration ===");
        
        // Call void method (no return value)
        printWelcome(name);
        
        // Call method with return value
        int sum = addNumbers(age, 5);
        System.out.println("Your age + 5 = " + sum);
        
        // Call boolean method
        System.out.println("Is your age even? " + isEven(age));
        
        // Call overloaded methods
        System.out.println(greet(name));
        System.out.println(greet(name, "Mr./Ms."));
        
        // Call method with array
        System.out.println("\nFirst color in array: " + getFirstColor(colors));

        input.close();
    }
    
    // ==================== CUSTOM METHODS ====================
    
    // Static method - no object needed, just prints welcome message
    public static void printWelcome(String name) {
        System.out.println("🎉 Welcome to Java Learning, " + name + "!");
    }
    
    // Static method with return value - adds two numbers and returns result
    public static int addNumbers(int a, int b) {
        return a + b;  // Return the sum
    }
    
    // Static method with boolean return - checks if number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;  // Return true if even, false if odd
    }
    
    // Method overloading - same name, different parameters
    public static String greet(String name) {
        return "Hello, " + name;
    }
    
    public static String greet(String name, String title) {
        return "Hello, " + title + " " + name;
    }
    
    // Method that works with arrays
    public static String getFirstColor(String[] colorArray) {
        if (colorArray.length > 0) {
            return colorArray[0];  // Return first element
        } else {
            return "No colors available";  // Return message if array is empty
        }
    }
}