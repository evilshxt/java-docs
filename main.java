import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, welcome to my app, first enter the details below.");
        
        System.out.println("Enter your full name: ");
        String name = input.nextLine();
        
        System.out.println("Enter the year you were born: ");
        int age = 2025 - input.nextInt();
        
        if (age >= 18) {
            System.out.printf("Hello %s, welcome to my app, you are %d years old, hence an adult.%n", name, age);
        } else {
            System.out.printf("Hello %s, welcome to my app, you are %d years old, hence not an adult.%n", name, age);
        }
        
        input.close();
    }
}
