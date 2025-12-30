import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * 🎓 Advanced Student Management System
 * 
 * This project demonstrates all Java concepts covered in the documentation:
 * - Primitive and non-primitive data types
 * - Variables (local, instance, static)
 * - Control flow (if-else, ternary, switch)
 * - Loops (for, while, do-while, enhanced for)
 * - Methods (static, instance, overloaded)
 * - Arrays and ArrayList
 * - Scanner for user input
 * - String manipulation
 * - Object-oriented programming basics
 */

public class Main {
    
    // Static variable - belongs to the class, shared across all instances
    private static int totalStudents = 0;
    private static final String SCHOOL_NAME = "Java Academy";
    
    // Instance variable - belongs to each object
    private String adminName;
    
    /**
     * 🏗️ Constructor - initializes instance variables
     * Question: How do we initialize object-specific data?
     * Solution: Use constructors to set initial values for instance variables
     */
    public Main(String adminName) {
        // Question: What's the difference between this.adminName and adminName?
        // Solution: this.adminName refers to the instance variable, adminName is the parameter
        this.adminName = adminName;
        System.out.println("🎉 Student Management System initialized");
        System.out.println("👤 Admin: " + this.adminName);
        System.out.println("🏫 School: " + SCHOOL_NAME);
    }
    
    /**
     * 🚀 Main method - entry point of the program
     * Question: Why is main method static?
     * Solution: It needs to be called without creating an object first
     */
    public static void main(String[] args) {
        // Question: How do we handle user input in Java?
        // Solution: Use Scanner class with System.in for keyboard input
        Scanner scanner = new Scanner(System.in);
        
        // Create instance of Main class
        Main system = new Main("System Administrator");
        
        // Demonstrate all concepts through interactive menu
        runInteractiveMenu(scanner, system);
        
        // Question: Why is it important to close Scanner?
        // Solution: Prevents resource leaks and frees up system resources
        scanner.close();
        
        // Final statistics using static variable
        System.out.println("\n📊 Final Statistics:");
        System.out.println("Total students processed: " + totalStudents);
        System.out.println("Thank you for using " + SCHOOL_NAME + " Management System!");
    }
    
    /**
     * 🎯 Interactive menu system
     * Question: How do we create a user-friendly interface?
     * Solution: Use loops for continuous operation and switch for menu options
     */
    private static void runInteractiveMenu(Scanner scanner, Main system) {
        boolean running = true;
        
        // Question: Why use a while loop instead of for loop here?
        // Solution: We don't know how many times user will interact, while loop is better for unknown iterations
        while (running) {
            displayMenu();
            
            System.out.print("🔹 Enter your choice (1-8): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline - important bug fix!
            
            // Question: How do we handle multiple menu options efficiently?
            // Solution: Use switch statement for cleaner code than multiple if-else
            switch (choice) {
                case 1:
                    system.addStudent(scanner);
                    break;
                case 2:
                    system.viewAllStudents();
                    break;
                case 3:
                    system.searchStudent(scanner);
                    break;
                case 4:
                    system.calculateStatistics();
                    break;
                case 5:
                    system.demonstrateDataTypes();
                    break;
                case 6:
                    system.demonstrateLoops();
                    break;
                case 7:
                    system.demonstrateMethods();
                    break;
                case 8:
                    running = false;
                    System.out.println("👋 Exiting system...");
                    break;
                default:
                    System.out.println("❌ Invalid choice! Please try again.");
            }
            
            if (running) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }
    }
    
    /**
     * 📋 Display menu options
     * Question: How do we organize menu display?
     * Solution: Use separate method for better code organization
     */
    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("📚 " + SCHOOL_NAME + " - Student Management System");
        System.out.println("=".repeat(50));
        System.out.println("1. ➕ Add New Student");
        System.out.println("2. 👁️  View All Students");
        System.out.println("3. 🔍 Search Student");
        System.out.println("4. 📊 Calculate Statistics");
        System.out.println("5. 🎯 Demonstrate Data Types");
        System.out.println("6. 🔄 Demonstrate Loops");
        System.out.println("7. 🔧 Demonstrate Methods");
        System.out.println("8. 🚪 Exit");
        System.out.println("=".repeat(50));
    }
    
    /**
     * ➕ Add new student to the system
     * Question: How do we handle different data types when collecting student info?
     * Solution: Use appropriate Scanner methods for each data type and handle type conversion
     */
    private void addStudent(Scanner scanner) {
        System.out.println("\n➕ Adding New Student");
        System.out.println("-".repeat(30));
        
        // Question: How do we collect string input with spaces?
        // Solution: Use nextLine() instead of next() to read entire line
        System.out.print("📝 Enter student name: ");
        String name = scanner.nextLine();
        
        // Question: How do we validate string input?
        // Solution: Use String methods like isEmpty() and equals()
        if (name.trim().isEmpty()) {
            System.out.println("❌ Name cannot be empty!");
            return;
        }
        
        // Question: How do we handle numeric input safely?
        // Solution: Use appropriate Scanner methods and validate ranges
        System.out.print("🎂 Enter age (16-100): ");
        int age = scanner.nextInt();
        
        // Question: How do we validate numeric input?
        // Solution: Use if-else statements and ternary operators
        String ageValidation = (age >= 16 && age <= 100) ? 
            "✅ Valid age" : "❌ Invalid age range";
        System.out.println(ageValidation);
        
        if (age < 16 || age > 100) {
            System.out.println("❌ Age must be between 16 and 100!");
            return;
        }
        
        // Question: How do we handle decimal numbers?
        // Solution: Use double for GPA with proper precision
        System.out.print("📊 Enter GPA (0.0-4.0): ");
        double gpa = scanner.nextDouble();
        
        // Question: How do we use ternary operator for GPA validation?
        // Solution: (condition) ? value_if_true : value_if_false
        String gpaStatus = (gpa >= 3.5) ? "🌟 Excellent" : 
                          (gpa >= 3.0) ? "👍 Good" : 
                          (gpa >= 2.0) ? "📚 Average" : "⚠️ Needs Improvement";
        
        System.out.println("GPA Status: " + gpaStatus);
        
        // Question: How do we handle boolean input?
        // Solution: Parse string input to boolean
        System.out.print("🎓 Is the student active? (true/false): ");
        boolean isActive = scanner.nextBoolean();
        
        // Create student object and add to list
        Student student = new Student(name, age, gpa, isActive);
        StudentDatabase.addStudent(student);
        
        // Update static counter
        totalStudents++;
        
        // Display success message with formatted output
        System.out.printf("✅ Student %s added successfully!%n", name);
        System.out.printf("📈 Total students in database: %d%n", StudentDatabase.getStudentCount());
    }
    
    /**
     * 👁️ View all students in the system
     * Question: How do we iterate through collections efficiently?
     * Solution: Use enhanced for-loop for cleaner code
     */
    private void viewAllStudents() {
        System.out.println("\n👁️ All Students in Database");
        System.out.println("-".repeat(50));
        
        // Question: How do we check if collection is empty?
        // Solution: Use isEmpty() method from ArrayList
        if (StudentDatabase.getStudents().isEmpty()) {
            System.out.println("📭 No students in database yet!");
            return;
        }
        
        // Question: How do we display data in tabular format?
        // Solution: Use printf with formatting for aligned columns
        System.out.printf("%-20s %-6s %-6s %-10s %-8s%n", 
            "NAME", "AGE", "GPA", "STATUS", "GRADE");
        System.out.println("-".repeat(50));
        
        // Enhanced for-loop - iterate through each student
        for (Student student : StudentDatabase.getStudents()) {
            // Question: How do we format output nicely?
            // Solution: Use printf with format specifiers
            System.out.printf("%-20s %-6d %-6.2f %-10s %-8s%n",
                student.getName(),
                student.getAge(),
                student.getGpa(),
                student.isActive() ? "✅ Active" : "❌ Inactive",
                student.getGrade());
        }
        
        System.out.println("-".repeat(50));
        System.out.printf("📊 Total Students: %d%n", StudentDatabase.getStudentCount());
    }
    
    /**
     * 🔍 Search for a specific student
     * Question: How do we search through collections?
     * Solution: Use loops and String comparison methods
     */
    private void searchStudent(Scanner scanner) {
        System.out.println("\n🔍 Search Student");
        System.out.println("-".repeat(30));
        
        System.out.print("📝 Enter student name to search: ");
        String searchName = scanner.nextLine();
        
        // Question: How do we perform case-insensitive search?
        // Solution: Use equalsIgnoreCase() instead of equals()
        boolean found = false;
        
        // Traditional for-loop with index - useful when we need index
        for (int i = 0; i < StudentDatabase.getStudents().size(); i++) {
            Student student = StudentDatabase.getStudents().get(i);
            
            // Question: Why use equalsIgnoreCase()?
            // Solution: Makes search user-friendly (case-insensitive)
            if (student.getName().equalsIgnoreCase(searchName)) {
                System.out.println("✅ Student found!");
                displayStudentDetails(student);
                found = true;
                break; // Exit loop once found
            }
        }
        
        // Question: How do we handle not found case?
        // Solution: Use boolean flag to track if student was found
        if (!found) {
            System.out.println("❌ Student '" + searchName + "' not found!");
        }
    }
    
    /**
     * 📊 Calculate and display statistics
     * Question: How do we perform calculations on collections?
     * Solution: Use loops to iterate and accumulate values
     */
    private void calculateStatistics() {
        System.out.println("\n📊 Student Statistics");
        System.out.println("-".repeat(30));
        
        List<Student> students = StudentDatabase.getStudents();
        
        if (students.isEmpty()) {
            System.out.println("📭 No data available for statistics!");
            return;
        }
        
        // Initialize variables for calculations
        int totalAge = 0;
        double totalGpa = 0.0;
        int activeCount = 0;
        
        // Question: How do we calculate averages?
        // Solution: Accumulate values in loop, then divide by count
        for (Student student : students) {
            totalAge += student.getAge();
            totalGpa += student.getGpa();
            if (student.isActive()) {
                activeCount++;
            }
        }
        
        // Calculate averages using double division
        double averageAge = (double) totalAge / students.size();
        double averageGpa = totalGpa / students.size();
        
        // Display statistics with formatted output
        System.out.printf("📊 Total Students: %d%n", students.size());
        System.out.printf("🎂 Average Age: %.2f years%n", averageAge);
        System.out.printf("📈 Average GPA: %.2f%n", averageGpa);
        System.out.printf("✅ Active Students: %d (%.1f%%)%n", 
            activeCount, (double) activeCount / students.size() * 100);
        
        // Question: How do we find the best student?
        // Solution: Track maximum GPA while iterating
        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
        
        System.out.println("🏆 Top Student: " + topStudent.getName() + 
                          " (GPA: " + topStudent.getGpa() + ")");
    }
    
    /**
     * 🎯 Demonstrate all data types
     * Question: How do we show all primitive and non-primitive types?
     * Solution: Create examples of each type with explanations
     */
    private void demonstrateDataTypes() {
        System.out.println("\n🎯 Java Data Types Demonstration");
        System.out.println("-".repeat(50));
        
        // Primitive Data Types
        System.out.println("🔢 PRIMITIVE DATA TYPES:");
        
        byte byteVar = 127;        // 8-bit integer
        short shortVar = 32767;    // 16-bit integer
        int intVar = 2147483647;   // 32-bit integer
        long longVar = 9223372036854775807L; // 64-bit integer
        
        float floatVar = 3.14f;    // 32-bit floating point
        double doubleVar = 3.14159265359; // 64-bit floating point
        
        char charVar = 'A';         // 16-bit Unicode character
        boolean booleanVar = true;  // true or false
        
        System.out.println("  byte: " + byteVar);
        System.out.println("  short: " + shortVar);
        System.out.println("  int: " + intVar);
        System.out.println("  long: " + longVar);
        System.out.println("  float: " + floatVar);
        System.out.println("  double: " + doubleVar);
        System.out.println("  char: " + charVar);
        System.out.println("  boolean: " + booleanVar);
        
        // Non-Primitive Data Types
        System.out.println("\n🏷️ NON-PRIMITIVE DATA TYPES:");
        
        String stringVar = "Hello Java!"; // String object
        int[] arrayVar = {1, 2, 3, 4, 5}; // Array object
        ArrayList<String> listVar = new ArrayList<>(); // ArrayList object
        listVar.add("Java");
        listVar.add("Programming");
        
        System.out.println("  String: " + stringVar);
        System.out.println("  Array: " + java.util.Arrays.toString(arrayVar));
        System.out.println("  ArrayList: " + listVar);
        
        // Demonstrate String methods
        System.out.println("\n🔤 STRING METHODS DEMONSTRATION:");
        System.out.println("  Length: " + stringVar.length());
        System.out.println("  Uppercase: " + stringVar.toUpperCase());
        System.out.println("  Contains 'Java': " + stringVar.contains("Java"));
        System.out.println("  Starts with 'Hello': " + stringVar.startsWith("Hello"));
        System.out.println("  Char at index 0: " + stringVar.charAt(0));
        
        // Demonstrate comparison
        System.out.println("\n🔄 COMPARISON DEMONSTRATION:");
        String str1 = "Hello";
        String str2 = new String("Hello");
        
        System.out.println("  str1 == str2: " + (str1 == str2)); // Reference comparison
        System.out.println("  str1.equals(str2): " + str1.equals(str2)); // Value comparison
        
        int prim1 = 5;
        int prim2 = 5;
        System.out.println("  prim1 == prim2: " + (prim1 == prim2)); // Primitive comparison
    }
    
    /**
     * 🔄 Demonstrate all types of loops
     * Question: How do we show different loop types?
     * Solution: Create examples of for, while, do-while, and enhanced for loops
     */
    private void demonstrateLoops() {
        System.out.println("\n🔄 Java Loops Demonstration");
        System.out.println("-".repeat(50));
        
        // Traditional for loop
        System.out.println("📝 TRADITIONAL FOR LOOP:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("  Count: " + i);
        }
        
        // Enhanced for loop (for-each)
        System.out.println("\n🔄 ENHANCED FOR LOOP:");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("  Fruit: " + fruit);
        }
        
        // While loop
        System.out.println("\n⏳ WHILE LOOP:");
        int counter = 1;
        while (counter <= 3) {
            System.out.println("  While iteration: " + counter);
            counter++;
        }
        
        // Do-while loop
        System.out.println("\n🔄 DO-WHILE LOOP:");
        int doCounter = 1;
        do {
            System.out.println("  Do-while iteration: " + doCounter);
            doCounter++;
        } while (doCounter <= 2);
        
        // Nested loops
        System.out.println("\n🔀 NESTED LOOPS:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("  Nested: i=" + i + ", j=" + j);
            }
        }
        
        // Loop with break and continue
        System.out.println("\n⚡ BREAK AND CONTINUE:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip iteration 5
            }
            if (i == 8) {
                break; // Exit loop at 8
            }
            System.out.println("  Number: " + i);
        }
    }
    
    /**
     * 🔧 Demonstrate method concepts
     * Question: How do we show different method types?
     * Solution: Create static, instance, and overloaded methods
     */
    private void demonstrateMethods() {
        System.out.println("\n🔧 Java Methods Demonstration");
        System.out.println("-".repeat(50));
        
        // Static method call
        System.out.println("📊 STATIC METHOD:");
        int sum = addNumbers(5, 3);
        System.out.println("  addNumbers(5, 3) = " + sum);
        
        // Instance method call
        System.out.println("\n🏷️ INSTANCE METHOD:");
        String greeting = generateGreeting("Student");
        System.out.println("  generateGreeting('Student') = " + greeting);
        
        // Method overloading
        System.out.println("\n🔄 METHOD OVERLOADING:");
        System.out.println("  multiply(2, 3) = " + multiply(2, 3));
        System.out.println("  multiply(2.5, 3.5) = " + multiply(2.5, 3.5));
        System.out.println("  multiply(2, 3, 4) = " + multiply(2, 3, 4));
        
        // Void method
        System.out.println("\n🔇 VOID METHOD:");
        printMessage("This is a void method demonstration");
        
        // Method with return value and parameters
        System.out.println("\n📤 METHOD WITH RETURN VALUE:");
        boolean result = isEvenNumber(7);
        System.out.println("  isEvenNumber(7) = " + result);
        
        // Recursive method demonstration
        System.out.println("\n🔄 RECURSIVE METHOD:");
        int factorial = calculateFactorial(5);
        System.out.println("  calculateFactorial(5) = " + factorial);
    }
    
    // Static methods - belong to class, no object needed
    /**
     * 📊 Static method - adds two numbers
     * Question: Why make this method static?
     * Solution: It doesn't need instance variables, can be called directly
     */
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    /**
     * 🔄 Method overloading - multiply integers
     */
    public static int multiply(int a, int b) {
        System.out.println("  Called integer version");
        return a * b;
    }
    
    /**
     * 🔄 Method overloading - multiply doubles
     */
    public static double multiply(double a, double b) {
        System.out.println("  Called double version");
        return a * b;
    }
    
    /**
     * 🔄 Method overloading - multiply three integers
     */
    public static int multiply(int a, int b, int c) {
        System.out.println("  Called three-integer version");
        return a * b * c;
    }
    
    // Instance methods - belong to object, need object creation
    /**
     * 🏷️ Instance method - generates greeting
     * Question: Why is this instance method?
     * Solution: It could potentially use instance variables in future
     */
    public String generateGreeting(String name) {
        return "Hello, " + name + "! Welcome to " + SCHOOL_NAME;
    }
    
    /**
     * 🔇 Void method - prints message
     * Question: When to use void return type?
     * Solution: When method performs action but doesn't need to return value
     */
    public void printMessage(String message) {
        System.out.println("  📢 " + message);
    }
    
    /**
     * 📤 Method with boolean return
     */
    public boolean isEvenNumber(int number) {
        // Question: How to check if number is even?
        // Solution: Use modulo operator (%)
        return number % 2 == 0;
    }
    
    /**
     * 🔄 Recursive method - calculates factorial
     * Question: How does recursion work?
     * Solution: Method calls itself with smaller problem until base case
     */
    public int calculateFactorial(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }
        // Recursive case
        return n * calculateFactorial(n - 1);
    }
    
    /**
     * 📋 Helper method to display student details
     */
    private static void displayStudentDetails(Student student) {
        System.out.println("-".repeat(30));
        System.out.println("👤 Student Details:");
        System.out.println("  Name: " + student.getName());
        System.out.println("  Age: " + student.getAge());
        System.out.println("  GPA: " + student.getGpa());
        System.out.println("  Grade: " + student.getGrade());
        System.out.println("  Status: " + (student.isActive() ? "✅ Active" : "❌ Inactive"));
        System.out.println("-".repeat(30));
    }
}

/**
 * 🎓 Student class - represents a student entity
 * Question: Why create a separate Student class?
 * Solution: Better organization, encapsulation, and reusability
 */
class Student {
    // Instance variables - each student has their own
    private String name;
    private int age;
    private double gpa;
    private boolean isActive;
    
    /**
     * 🏗️ Constructor - initializes student object
     */
    public Student(String name, int age, double gpa, boolean isActive) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isActive = isActive;
    }
    
    // Getter methods - provide read access to private variables
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    public boolean isActive() { return isActive; }
    
    /**
     * 🎯 Calculate grade based on GPA
     * Question: How do we convert GPA to letter grade?
     * Solution: Use if-else statements or ternary operators
     */
    public String getGrade() {
        // Using ternary operator for concise grade calculation
        return (gpa >= 3.7) ? "A" :
               (gpa >= 3.3) ? "B+" :
               (gpa >= 3.0) ? "B" :
               (gpa >= 2.7) ? "C+" :
               (gpa >= 2.3) ? "C" :
               (gpa >= 2.0) ? "D" : "F";
    }
    
    /**
     * 📝 Override toString for better object representation
     */
    @Override
    public String toString() {
        return String.format("Student{name='%s', age=%d, gpa=%.2f, grade=%s, active=%s}",
            name, age, gpa, getGrade(), isActive);
    }
}

/**
 * 🗄️ StudentDatabase class - manages student data
 * Question: Why separate database logic?
 * Solution: Single responsibility principle - each class has one job
 */
class StudentDatabase {
    // Static variable - shared across all instances
    private static final ArrayList<Student> students = new ArrayList<>();
    
    /**
     * ➕ Add student to database
     */
    public static void addStudent(Student student) {
        students.add(student);
    }
    
    /**
     * 📋 Get all students
     */
    public static ArrayList<Student> getStudents() {
        return students;
    }
    
    /**
     * 📊 Get student count
     */
    public static int getStudentCount() {
        return students.size();
    }
    
    /**
     * 🗑️ Clear database
     */
    public static void clearDatabase() {
        students.clear();
    }
}
