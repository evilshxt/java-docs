# 📚 Java Programming Documentation

> **Comprehensive Java Guide** - From basics to advanced concepts

---

## 1. Basic Java Program

```java
class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### Explanation

* `class Main`
  Defines a class.
  **NB:** Class names should start with a capital letter.

* `public static void main(String[] args)`
  This is the **entry point** of every Java program.

* `System.out.println("Hello World");`
  Prints text to the terminal and moves to a new line.

---

## 2. Data Types in Java

### Primitive Data Types

1. **int** – whole numbers

   ```java
   int num = 123;
   ```

2. **long** – large whole numbers

   ```java
   long bigNum = 123L;
   ```

3. **float** – decimal numbers (lower precision)

   ```java
   float value = 123.0f;
   ```

4. **double** – decimal numbers (higher precision)

   ```java
   double pi = 3.14159;
   ```

5. **char** – single character

   ```java
   char letter = 'a';
   ```

6. **boolean** – true or false

   ```java
   boolean isActive = true;
   ```

---

### Non-Primitive Data Type

7. **String** – sequence of characters

```java
String text = "Hello";
```

> **NB:** `String` is not a primitive data type. It is a class.

---

## 3. Variables in Java

### Types of Variables

### 1. Local Variables

* Declared **inside a method**
* Exist only while the method is executing

```java
public static void main(String[] args) {
    String name = "John"; // Local variable
}
```

---

### 2. Instance Variables

* Declared **inside a class**
* Outside all methods
* Belong to an object

```java
class Person {
    String name; // Instance variable
}
```

---

### 3. Static Variables

* Declared using the `static` keyword
* Belong to the **class**
* Shared across all objects

```java
class Example {
    static int num = 123; // Static variable
}
```

> **NB:** Static variables **can change**, but the value is shared across all instances of the class.

---

## 4. Example with All Variable Types

```java
class Main {

    static int staticNum = 100; // Static variable

    String instanceName = "Default"; // Instance variable

    public static void main(String[] args) {

        Main obj = new Main(); // Object creation

        String localName = "John"; // Local variable

        System.out.println(localName);
        System.out.println(obj.instanceName);
        System.out.println(staticNum);
    }
}
```

### Explanation

* `staticNum` → belongs to the class
* `instanceName` → belongs to the object
* `localName` → exists only inside `main`

---

## 5. Printing Output

```java
System.out.println("Hello World");
```

* Prints text
* Adds a new line

```java
System.out.print("Hello");
```

* Prints text
* Does **not** add a new line

---

## 6. User Input in Java (Scanner)

### Import Scanner

```java
import java.util.Scanner;
```

---

### Create Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

* `System.in` refers to keyboard input

---

### Read Input

```java
int num = sc.nextInt();
String name = sc.nextLine();
```

---

### Close Scanner

```java
sc.close();
```

---

### Complete Example

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);

        sc.close();
    }
  ```python
  name = input()
  ```
- After using `nextInt()`, handle the newline before calling `nextLine()` to avoid bugs

---

## 🔀 7. Control Flow in Java

### 7.1 📝 Conditional Statements (`if`, `else if`, `else`)

#### 📋 Basic `if / else`

```java
int age = 20;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

**📖 Explanation**

- `if (age >= 18)` → checks the condition
- If `true` → executes first block
- If `false` → executes `else` block

---

#### 🔀 `else if` (Multiple conditions)

```java
int score = 85;

if (score >= 90) {
    System.out.println("Grade A");
} else if (score >= 80) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C or below");
}
```

**⚠️ NB (Important Notes)**

- Conditions are evaluated **top to bottom**
- First `true` condition is executed
- Always use `{}` even for single statements

---

#### 🔄 Comparison: Primitives vs Objects

| Type | Comparison Method | Example |
|------|-------------------|---------|
| **Primitives** | `==` | `if (a == 5) { }` |
| **Objects** | `.equals()` | `if (name.equals("John")) { }` |

**❌ Don't use `==` for Strings** (compares references, not value)

---

### 7.2 🔀 Ternary Operator (`?:`)

#### 📝 Syntax

```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

#### 🎯 Example: Simple

```java
int age = 20;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result);
```

#### 📋 Step-by-step

1. Evaluate condition → `true` or `false`
2. If `true` → select first value
3. If `false` → select second value
4. Assign to variable

---

### Example: Numeric

```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;
System.out.println("Max: " + max);
```

---

### Example: Boolean

```java
int score = 75;
boolean passed = (score >= 50) ? true : false;
```

> NB: You can simplify to `boolean passed = score >= 50;`

---

### Example: Nested Ternary (use carefully)

```java
int marks = 85;
String grade = (marks >= 90) ? "A" :
               (marks >= 80) ? "B" :
               (marks >= 70) ? "C" : "F";

System.out.println("Grade: " + grade);
```

> NB: Nested ternaries are readable for 2–3 conditions, avoid more than that.

---

### Summary

* `if / else` → decision making
* `else if` → multiple conditions
* `.equals()` → compare objects
* `?:` ternary → shorthand for simple decisions

---

8. Primitive vs Non-Primitive (Object) Types
8.1 Primitive Types
Examples

int, long, float, double, char, boolean

int a = 5;
boolean isActive = true;
double pi = 3.14159;

Key Points

Store actual values

Comparison: use ==

Cannot use methods like .equals(), .isEmpty(), .length()

Fast and memory-efficient

Example: Comparison
int x = 10;
int y = 10;

if (x == y) {  // ✅ Correct
    System.out.println("x and y are equal");
}


NB: No .equals() for primitives — this will give a compile-time error.

8.2 Non-Primitive Types (Objects)
Examples

String, Scanner, ArrayList, custom classes

String name1 = "John";
String name2 = "John";

Key Points

Store references to objects

Comparison: use .equals() to check content/value

Can use object methods like .isEmpty(), .length(), .contains(), .charAt()

Example: String Comparison
if (name1.equals(name2)) {  // ✅ Correct
    System.out.println("Names are equal");
}

if (name1 == name2) {  // ❌ Only true if both references point to same object
    System.out.println("References are equal");
}

String Methods
Method	Example	Description
.equals()	str1.equals(str2)	Compare string content
.equalsIgnoreCase()	str1.equalsIgnoreCase(str2)	Compare ignoring case
.isEmpty()	str.isEmpty()	True if string length is 0
.length()	str.length()	Returns number of characters
.charAt()	str.charAt(0)	Character at index
.contains()	str.contains("abc")	Checks if substring exists
.startsWith() / .endsWith()	str.startsWith("Hi")	Check prefix/suffix
8.3 Quick NB (Beginner Survival)

Primitives: int, boolean, double → only == comparisons, no methods

Objects (Non-Primitives): String, Scanner, ArrayList → use .equals(), .isEmpty(), etc.

Strings: always use .equals() for value comparison, == only for reference comparison

8.4 Example Combining Both
int a = 10;
int b = 10;

String str1 = "Hello";
String str2 = new String("Hello");

if (a == b) {  // ✅ compares values
    System.out.println("a and b are equal");
}

if (str1.equals(str2)) {  // ✅ compares string content
    System.out.println("str1 and str2 content is equal");
}

if (str1 == str2) {  // ❌ compares references
    System.out.println("This will NOT print");
}


NB: Always remember — primitives store values, objects store references.

Loops in Java

Loops are used to repeat a block of code multiple times.

9.1 for Loop
Syntax
for (initialization; condition; update) {
    // code to execute
}

Example
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}

Explanation

Initialization: int i = 1 → sets starting value

Condition: i <= 5 → loop continues while true

Update: i++ → increments i after each iteration

Body: prints the current value of i

NB: All three parts (initialization, condition, update) are optional, but usually included.

9.2 Enhanced for Loop (for-each)
Syntax
for (datatype variable : collection) {
    // code to execute
}

Example
String[] fruits = {"Apple", "Banana", "Cherry"};

for (String fruit : fruits) {
    System.out.println(fruit);
}

Explanation

Loops through all elements in an array or collection

Variable fruit takes the value of each element in order

NB: Cannot modify the collection while using an enhanced for loop.

9.3 while Loop
Syntax
while (condition) {
    // code to execute
}

Example
int i = 1;
while (i <= 5) {
    System.out.println("Count: " + i);
    i++;
}

Explanation

Checks condition before each iteration

Executes the body only if condition is true

Remember to update variables inside the loop to avoid infinite loops

9.4 do-while Loop
Syntax
do {
    // code to execute
} while (condition);

Example
int i = 1;
do {
    System.out.println("Count: " + i);
    i++;
} while (i <= 5);

Explanation

Executes the body at least once, even if condition is false

Condition is checked after execution

9.5 NB (Beginner Notes)

Infinite loops occur if the condition never becomes false

while(true) { }


Use break; to exit a loop early

Use continue; to skip the current iteration

10. Switch Statements in Java

Switch statements are an alternative to long if-else chains when comparing a single variable against multiple values.

10.1 Basic Syntax
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}

Example
int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    default:
        dayName = "Unknown";
}

System.out.println("Day: " + dayName);

Explanation

switch(variable) → evaluates the variable

case value: → checks for match

break; → exits the switch block (prevents "fall-through")

default: → executed if no cases match

10.2 Switch with Strings
String fruit = "Apple";

switch (fruit) {
    case "Apple":
        System.out.println("Red or Green");
        break;
    case "Banana":
        System.out.println("Yellow");
        break;
    default:
        System.out.println("Unknown fruit");
}


NB: Switch can work with int, byte, short, char, String, and enum types in Java.

10.3 NB (Beginner Notes)

Always include break; unless you want fall-through behavior

default: is optional but recommended

Avoid using switch for complex conditions; if-else may be clearer

---

11. Methods in Java

Methods are blocks of code that perform a specific task. They help you reuse code, organize logic, and make programs easier to read.

11.1 Basic Syntax
returnType methodName(parameters) {
    // code to execute
    return value; // if returnType is not void
}

Explanation

returnType → data type the method returns (int, String, void if nothing is returned)

methodName → name of the method (follow naming conventions, e.g., calculateSum)

parameters → values passed to the method (optional)

return → returns a value (optional if void)

11.2 Example: Simple Method
class Main {
    // Method that adds two numbers
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(5, 3);  // Call the method
        System.out.println("Sum: " + sum);
    }
}

Explanation

static int add(int a, int b) → defines a method called add that returns an int

return a + b; → sends the sum back to where the method was called

int sum = add(5, 3); → calls the method with values 5 and 3

System.out.println → prints the result

NB: Using static means you can call the method without creating an object.

11.3 Methods with void (no return)
class Main {
    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        greet("John");
    }
}


void → the method does not return any value

Can still perform actions (printing, calculations, modifying objects)

11.4 Instance Methods (non-static)
class Person {
    String name;

    // Instance method
    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alice";
        p.sayHello();
    }
}

Explanation

sayHello() is an instance method, so you need to create an object to call it (p.sayHello())

Instance methods can access instance variables (name)

11.5 Methods with Multiple Parameters
static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
}

public static void main(String[] args) {
    String name = fullName("John", "Doe");
    System.out.println(name);
}


NB: The number of arguments must match the number of parameters in the method definition.

11.6 Method Overloading (Same method name, different parameters)
static int multiply(int a, int b) {
    return a * b;
}

static double multiply(double a, double b) {
    return a * b;
}

public static void main(String[] args) {
    System.out.println(multiply(2, 3));     // Calls int version
    System.out.println(multiply(2.5, 3.5)); // Calls double version
}

Explanation

Java chooses the correct method based on parameter types

Makes your code more readable and reusable

11.7 NB (Beginner Notes)

Static methods → belong to the class, no object needed

Instance methods → belong to objects, require object creation

Return type → must match the type of value you return

Parameters → can pass multiple values, but types and order matter

Method calls can be nested inside other methods

✅ Summary

Methods organize code into reusable blocks

Can have parameters and return values

Use static for class-level methods, instance methods for objects

Method overloading allows multiple methods with the same name but different parameters

-- 

12. Arrays and Collections in Java

Java uses arrays and collections to store multiple values in a single variable.

12.1 Arrays
What is an Array?

Fixed-size container for elements of the same type

Index starts at 0

Can store primitives or objects

12.1.1 Syntax & Declaration
int[] numbers;          // declare
numbers = new int[5];   // allocate memory for 5 elements


Or in one line:

int[] numbers = new int[5];


Or initialize directly:

int[] numbers = {1, 2, 3, 4, 5};

12.1.2 Accessing Array Elements
System.out.println(numbers[0]);  // prints first element
numbers[2] = 10;                 // change third element


NB: Accessing an invalid index (e.g., numbers[5]) will throw ArrayIndexOutOfBoundsException.

12.1.3 Iterating Over Arrays

Using for loop:

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}


Using enhanced for loop (for-each):

for (int num : numbers) {
    System.out.println(num);
}

12.1.4 Multi-dimensional Arrays
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

System.out.println(matrix[1][2]); // prints 6


NB: Arrays are fixed-size. To "resize," you need Collections.

12.2 Collections (List / ArrayList)
What is a Collection?

Dynamic-size container

Can add, remove, or modify elements

Part of java.util package

12.2.1 Importing Collection Classes
import java.util.ArrayList;
import java.util.List;

12.2.2 ArrayList Example
ArrayList<String> fruits = new ArrayList<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Cherry");

System.out.println(fruits); // [Apple, Banana, Cherry]

12.2.3 Accessing Elements
System.out.println(fruits.get(0));  // Apple
fruits.set(1, "Blueberry");         // Replace Banana with Blueberry
fruits.remove(2);                    // Remove Cherry

12.2.4 Iterating Over ArrayList

Using for-each loop:

for (String fruit : fruits) {
    System.out.println(fruit);
}


Using standard for loop:

for (int i = 0; i < fruits.size(); i++) {
    System.out.println(fruits.get(i));
}

12.2.5 List Interface
List<String> colors = new ArrayList<>();
colors.add("Red");
colors.add("Green");
colors.add("Blue");


NB: ArrayList is one implementation of the List interface. Other types exist (LinkedList, Vector), but ArrayList is most commonly used.

12.3 Arrays vs ArrayList (Quick Comparison)
Feature	Array	ArrayList
Size	Fixed	Dynamic
Can store	Primitives or objects	Objects only
Access	array[index]	list.get(index)
Add/Remove	No	Yes (add, remove)
Iteration	for or for-each	for, for-each, iterator
12.4 NB (Beginner Notes)

Arrays are faster but less flexible

ArrayLists are dynamic but store objects only (wrap primitives with Integer, Double, etc.)

Java does not have tuples; small fixed groups of values can be stored in arrays, ArrayList, or custom classes/records

Looping over arrays/ArrayLists works with for, while, and enhanced for

12.5 Example Combining Loops and ArrayList
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        // Loop through students
        for (String student : students) {
            System.out.println("Hello " + student);
        }

        // Remove a student
        students.remove("Bob");

        System.out.println("Updated list: " + students);
    }
}


Output:

Hello Alice
Hello Bob
Hello Charlie
Updated list: [Alice, Charlie]

✅ Summary

Arrays: fixed-size, typed, indexed

ArrayLists / Collections: dynamic-size, flexible, object-based

Loops + Collections: essential for iterating and modifying lists

No tuples: use arrays, ArrayLists, or small classes/records for grouped data

---

## 13. Type Casting in Java

Type casting is converting one data type to another. Java supports two types of casting: primitive casting and String parsing.

### 13.1 Primitive Type Casting

#### Widening Casting (Automatic)
Smaller type → Larger type (no data loss)

```java
int age = 46;
double newAge = age;  // Automatic: int to double
```

#### Narrowing Casting (Manual)
Larger type → Smaller type (possible data loss)

```java
double height = 5.879;
int newHeight = (int)height;  // Manual: double to int
```

**⚠️ NB**: Narrowing casting truncates decimals (doesn't round)

### 13.2 String to Primitive Conversion

Use wrapper class methods:

```java
String weight = "89";
String distance = "23.4657";

int intWeight = Integer.parseInt(weight);
double doubleDistance = Double.parseDouble(distance);
```

### 13.3 Complete Example

```java
public class TypeCasting {
    public static void main(String[] args) {
        int age = 46;
        double height = 5.879;
        String weight = "89";
        String distance = "23.4657";

        // Primitive casting
        double newAge = (double)age;
        int newHeight = (int)height;

        // String parsing
        int intWeight = Integer.parseInt(weight);
        double doubleDistance = Double.parseDouble(distance);

        System.out.printf("Original age (int): %d -> Converted to double: %.1f\n", age, newAge);
        System.out.printf("Original height (double): %.3f -> Converted to int: %d\n", height, newHeight);
        System.out.printf("Original weight (String): \"%s\" -> Converted to int: %d\n", weight, intWeight);
        System.out.printf("Original distance (String): \"%s\" -> Converted to double: %.4f\n", distance, doubleDistance);
    }
}
```

### 13.4 Common Casting Scenarios

#### Arithmetic Operations
```java
int result = 5 / 2;        // Result: 2 (integer division)
double result = 5.0 / 2;   // Result: 2.5 (double division)
```

#### User Input Conversion
```java
Scanner input = new Scanner(System.in);
String userInput = input.nextLine();
int number = Integer.parseInt(userInput);
```

### 13.5 NB (Beginner Notes)

- **Widening**: Automatic, safe (int → double)
- **Narrowing**: Manual, potential data loss (double → int)
- **String parsing**: Use `Integer.parseInt()`, `Double.parseDouble()`
- **Error handling**: String parsing throws `NumberFormatException` for invalid input

---

## 14. Math Functions in Java

Java's `Math` class provides comprehensive mathematical functions and constants.

### 14.1 Math Constants

```java
System.out.println(Math.PI);   // 3.141592653589793
System.out.println(Math.E);    // 2.718281828459045
```

### 14.2 Trigonometric Functions

```java
// Convert degrees to radians first
double angle = 90;
double radians = Math.toRadians(angle);

System.out.println(Math.sin(radians));    // 1.0
System.out.println(Math.cos(radians));    // 0.0
System.out.println(Math.tan(Math.toRadians(45))); // 1.0

// Inverse functions
System.out.println(Math.asin(1.0));        // π/2
System.out.println(Math.acos(0.0));        // π/2
System.out.println(Math.atan(1.0));        // π/4

// Convert back to degrees
System.out.println(Math.toDegrees(Math.PI/2)); // 90.0
```

### 14.3 Exponential and Logarithmic Functions

```java
// Exponential
System.out.println(Math.exp(25));          // e^25
System.out.println(Math.pow(3, 5));        // 3^5 = 243
System.out.println(Math.sqrt(64));          // √64 = 8.0
System.out.println(Math.cbrt(27));          // ∛27 = 3.0

// Logarithmic
System.out.println(Math.log(58));          // Natural log (ln)
System.out.println(Math.log10(58));         // Base-10 log
```

### 14.4 Rounding Functions

```java
double value = 58.8;

// Ceiling (round up)
System.out.println(Math.ceil(58.8));   // 59.0
System.out.println(Math.ceil(58.1));   // 59.0

// Floor (round down)
System.out.println(Math.floor(58.8));  // 58.0
System.out.println(Math.floor(58.1));  // 58.0

// Round to nearest integer
System.out.println(Math.round(58.8));  // 59 (long)
System.out.println(Math.round(58.1));  // 58 (long)

// Rint (round to nearest integer, returns double)
System.out.println(Math.rint(58.8));   // 59.0
System.out.println(Math.rint(58.1));   // 58.0
```

### 14.5 Rounding to Specific Decimal Places

```java
// Round to 2 decimal places
double value = 2.0/6;  // 0.333333...
double rounded = Math.round(value * 100) / 100.0;  // 0.33

// Round to 5 decimal places
double precise = Math.round((2.0/6) * 100000) / 100000.0;  // 0.33333
```

### 14.6 Min, Max, and Absolute Value

```java
System.out.println(Math.max(34, 50));        // 50
System.out.println(Math.min(34, 50));        // 34
System.out.println(Math.abs(-56));            // 56

// Multiple values (chaining)
System.out.println(Math.max(3.67, Math.max(1.34, 54.98))); // 54.98
System.out.println(Math.min(Math.min(2.3, 3.4), 4.5));     // 2.3
```

### 14.7 Random Number Generation

```java
// Random double between 0.0 (inclusive) and 1.0 (exclusive)
double random = Math.random();
System.out.println(random);  // e.g., 0.723489

// Random integer in range
int random1to5 = 1 + (int)(Math.random() * 5);  // 1-5
int random0to10 = (int)(Math.random() * 11);     // 0-10

// Random decimal in range
double random0to5 = Math.random() * 5;          // 0.0-5.0
```

### 14.8 Practical Examples

#### Circle Calculations
```java
double radius = 3;
double circumference = 2 * Math.PI * radius;
double area = Math.PI * Math.pow(radius, 2);
```

#### Financial Calculations
```java
double principal = 1000;
double rate = 0.05;
int years = 5;

// Compound interest
double amount = principal * Math.pow(1 + rate, years);
```

### 14.9 NB (Beginner Notes)

- All `Math` methods are `static` - call directly: `Math.sqrt()`
- Trigonometric functions use **radians**, not degrees
- Use `Math.toRadians()` and `Math.toDegrees()` for conversions
- `Math.random()` returns `double` between 0.0 (inclusive) and 1.0 (exclusive)
- For integer ranges, multiply and cast to `int`

---

## 15. Character Methods in Java

The `Character` class provides utility methods for working with individual characters.

### 15.1 Character Classification Methods

```java
char letter = 'B';
char digit = '2';
char symbol = '$';

// Check if character is a digit
System.out.println(Character.isDigit(letter));    // false
System.out.println(Character.isDigit(digit));     // true

// Check if character is a letter
System.out.println(Character.isLetter(letter));   // true
System.out.println(Character.isLetter(digit));    // false

// Check if letter or digit
System.out.println(Character.isLetterOrDigit(symbol)); // false
```

### 15.2 Case Checking Methods

```java
char upper = 'A';
char lower = 'a';
char number = '2';

// Upper case check
System.out.println(Character.isUpperCase(upper));  // true
System.out.println(Character.isUpperCase(lower));  // false
System.out.println(Character.isUpperCase(number)); // false

// Lower case check
System.out.println(Character.isLowerCase(upper));  // false
System.out.println(Character.isLowerCase(lower));  // true
System.out.println(Character.isLowerCase(number)); // false

// Title case (rarely used)
System.out.println(Character.isTitleCase(upper));  // false
```

### 15.3 Character Conversion Methods

```java
char lower = 'a';
char upper = 'A';

// Convert to upper case
System.out.println(Character.toUpperCase(lower));  // 'A'

// Convert to lower case
System.out.println(Character.toLowerCase(upper));  // 'a'

// Convert to title case
System.out.println(Character.toTitleCase('a'));    // 'A'
```

### 15.4 Character Properties

```java
// Check if character is whitespace
System.out.println(Character.isWhitespace(' '));   // true
System.out.println(Character.isWhitespace('\t'));  // true
System.out.println(Character.isWhitespace('\n'));  // true

// Check if character is defined in Unicode
System.out.println(Character.isDefined('A'));      // true
System.out.println(Character.isDefined('\u03A9'));  // true (Greek Omega)

// Check for specific character types
System.out.println(Character.isJavaIdentifierStart('A')); // true
System.out.println(Character.isJavaIdentifierPart('1'));  // true
```

### 15.5 Character Values and Unicode

```java
// Get numeric value of character
System.out.println(Character.getNumericValue('5'));  // 5
System.out.println(Character.getNumericValue('A'));  // 10 (hexadecimal)

// Get character code point
System.out.println((int)'A');  // 65
System.out.println((int)'a');  // 97

// Unicode representation
System.out.println(Integer.toHexString('A'));  // "41"
System.out.println("\\u" + Integer.toHexString('A'));  // "\u0041"
```

### 15.6 Practical Example: Password Strength Checker

```java
String password = "MyP@ssw0rd123";
int strength = 0;

// Check for uppercase letters
for (char c : password.toCharArray()) {
    if (Character.isUpperCase(c)) {
        strength++;
        break;
    }
}

// Check for lowercase letters
for (char c : password.toCharArray()) {
    if (Character.isLowerCase(c)) {
        strength++;
        break;
    }
}

// Check for digits
for (char c : password.toCharArray()) {
    if (Character.isDigit(c)) {
        strength++;
        break;
    }
}

// Check for special characters (non-alphanumeric)
for (char c : password.toCharArray()) {
    if (!Character.isLetterOrDigit(c)) {
        strength++;
        break;
    }
}
```

### 15.7 NB (Beginner Notes)

- `char` is a primitive type, but `Character` is the wrapper class
- Use `Character` methods for character analysis and manipulation
- Characters are stored as Unicode values (can cast to `int` to see code)
- Numbers are neither uppercase nor lowercase
- Use `toCharArray()` to convert strings to character arrays for iteration

---

## 16. String Methods in Java

Strings are objects with many useful methods for manipulation and analysis.

### 16.1 Basic String Information

```java
String text = "  Hello World  ";

// Length
System.out.println(text.length());  // 15 (includes spaces)

// Trim whitespace
System.out.println(text.trim());    // "Hello World"
System.out.println(text.trim().length()); // 11
```

### 16.2 Character Access and Substrings

```java
String word = "Programming";

// Character at position
System.out.println(word.charAt(0));     // 'P'
System.out.println(word.charAt(4));     // 'r'

// Substring
System.out.println(word.substring(4));      // "ramming"
System.out.println(word.substring(0, 7));   // "Program"
System.out.println(word.substring(4, 7));   // "ram"
```

### 16.3 String Comparison Methods

```java
String name1 = "Edwin";
String name2 = "Edwin";
String name3 = "edwin";
String name4 = "  Edwin  ";

// Case-sensitive comparison
System.out.println(name1.equals(name2));           // true
System.out.println(name1.equals(name3));           // false

// Case-insensitive comparison
System.out.println(name1.equalsIgnoreCase(name3));  // true

// Compare with trimmed string
System.out.println(name1.equals(name4.trim()));      // true
```

### 16.4 String Search Methods

```java
String sentence = "Java Programming is Fun";

// Check if contains substring
System.out.println(sentence.contains("Java"));       // true
System.out.println(sentence.contains("Python"));     // false

// Check prefix and suffix
System.out.println(sentence.startsWith("Java"));      // true
System.out.println(sentence.endsWith("Fun"));        // true

// Find position of substring
System.out.println(sentence.indexOf("Program"));     // 5
System.out.println(sentence.indexOf("Python"));      // -1 (not found)
System.out.println(sentence.lastIndexOf("a"));       // 15 (last 'a')
```

### 16.5 String Manipulation Methods

```java
String text = "hello world";

// Convert case
System.out.println(text.toUpperCase());  // "HELLO WORLD"
System.out.println(text.toLowerCase());  // "hello world"

// Replace characters or substrings
System.out.println(text.replace('l', 'L'));        // "heLLo worLd"
System.out.println(text.replace("world", "Java"));  // "hello Java"

// Replace all (regex support)
System.out.println(text.replaceAll("l", "L"));      // "heLLo worLd"
System.out.println(text.replaceAll("\\s", "_"));     // "hello_world"
```

### 16.6 String Splitting and Joining

```java
String csv = "apple,banana,cherry,date";

// Split into array
String[] fruits = csv.split(",");
for (String fruit : fruits) {
    System.out.println(fruit);
}

// Join array into string
String[] words = {"Java", "is", "awesome"};
String sentence = String.join(" ", words);
System.out.println(sentence);  // "Java is awesome"
```

### 16.7 String Formatting

```java
// Using String.format()
String name = "Alice";
int age = 25;
double gpa = 3.85;

String formatted = String.format("Name: %s, Age: %d, GPA: %.2f", name, age, gpa);
System.out.println(formatted);

// Padding with spaces
String padded = String.format("%10s", "Hello");
System.out.println(padded);  // "     Hello"

// Zero-padding numbers
String paddedNum = String.format("%05d", 42);
System.out.println(paddedNum);  // "00042"
```

### 16.8 String Validation Examples

```java
// Validate email format
String email = "user@example.com";
boolean isValidEmail = email.contains("@") && email.contains(".") && 
                       email.indexOf("@") < email.lastIndexOf(".");

// Validate phone number (simple)
String phone = "123-456-7890";
boolean isValidPhone = phone.length() == 12 && 
                       phone.charAt(3) == '-' && phone.charAt(7) == '-';

// Check if string is numeric
String number = "12345";
boolean isNumeric = number.matches("\\d+");
```

### 16.9 String Builder for Efficient Manipulation

```java
// Inefficient: creates many String objects
String result = "";
for (int i = 0; i < 1000; i++) {
    result += i;  // Creates new String each time
}

// Efficient: uses StringBuilder
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i);
}
String efficientResult = sb.toString();
```

### 16.10 NB (Beginner Notes)

- Strings are **immutable** - methods return new strings, don't modify original
- Use `equals()` for comparison, not `==` (compares references)
- `trim()` removes leading and trailing whitespace
- `substring(beginIndex, endIndex)` - endIndex is exclusive
- Use `StringBuilder` for frequent string modifications
- String concatenation with `+` is fine for small numbers of strings

---

## 17. Exception Handling in Java

Exception handling allows your program to handle errors gracefully without crashing.

### 17.1 Basic Try-Catch Structure

```java
try {
    // Code that might throw an exception
    int number = Integer.parseInt("abc");
} catch (Exception e) {
    // Handle the exception
    System.out.println("Error: " + e.getMessage());
}
```

### 17.2 Common Exception Types

#### NumberFormatException
```java
try {
    int number = Integer.parseInt("123abc");
} catch (NumberFormatException e) {
    System.out.println("Invalid number format");
}
```

#### InputMismatchException
```java
Scanner input = new Scanner(System.in);
try {
    System.out.print("Enter age: ");
    int age = input.nextInt();
} catch (java.util.InputMismatchException e) {
    System.out.println("Please enter a valid integer");
}
```

#### ArrayIndexOutOfBoundsException
```java
int[] numbers = {1, 2, 3};
try {
    System.out.println(numbers[5]);  // Invalid index
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index out of bounds");
}
```

### 17.3 Multiple Catch Blocks

```java
try {
    String input = "123abc";
    int number = Integer.parseInt(input);
    int[] array = new int[number];
} catch (NumberFormatException e) {
    System.out.println("Invalid number format");
} catch (NegativeArraySizeException e) {
    System.out.println("Array size cannot be negative");
} catch (Exception e) {
    System.out.println("General error: " + e.getMessage());
}
```

### 17.4 Finally Block

```java
Scanner input = new Scanner(System.in);
try {
    System.out.print("Enter number: ");
    int number = input.nextInt();
    System.out.println("You entered: " + number);
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
} finally {
    input.close();  // Always executed
    System.out.println("Scanner closed");
}
```

### 17.5 Throwing Exceptions

```java
public static void setAge(int age) {
    if (age < 0 || age > 150) {
        throw new IllegalArgumentException("Age must be between 0 and 150");
    }
    // Set age logic here
}
```

### 17.6 Practical Example: Robust Input

```java
Scanner input = new Scanner(System.in);
int age = 0;

while (true) {
    try {
        System.out.print("Enter your age: ");
        age = input.nextInt();
        
        if (age < 0 || age > 150) {
            System.out.println("Age must be between 0 and 150");
            continue;
        }
        
        break;  // Valid input, exit loop
        
    } catch (java.util.InputMismatchException e) {
        System.out.println("Please enter a valid integer");
        input.nextLine();  // Clear invalid input
    }
}

System.out.println("Your age is: " + age);
input.close();
```

### 17.7 NB (Beginner Notes)

- Use try-catch for code that might fail (user input, file operations, network)
- Catch specific exceptions when possible, not just `Exception`
- `finally` block always executes (useful for cleanup)
- Don't catch exceptions you can't handle properly
- Use `input.nextLine()` after `nextInt()` to consume newline

---

## 18. Escape Sequences in Java

Escape sequences allow you to include special characters in strings.

### 18.1 Common Escape Sequences

```java
System.out.println("Hello\tWorld");     // Tab
System.out.println("Hello\nWorld");     // New line
System.out.println("Hello\"World\"");    // Double quote
System.out.println("Hello\'World\'");    // Single quote
System.out.println("Hello\\World");      // Backslash
System.out.println("Hello\bWorld");      // Backspace
System.out.println("Hello\rWorld");      // Carriage return
System.out.println("Hello\fWorld");      // Form feed
```

### 18.2 Practical Examples

```java
// Formatted output with tabs
System.out.println("Name\t\tAge\tScore");
System.out.println("Alice\t\t25\t95.5");
System.out.println("Bob\t\t30\t87.2");

// Multi-line string
String message = "Dear User,\n" +
                "\n" +
                "Thank you for your purchase.\n" +
                "Total: $100.00\n" +
                "\n" +
                "Best regards,\n" +
                "The Store";

// File paths (Windows)
String path = "C:\\Users\\Documents\\file.txt";

// JSON strings
String json = "{\"name\":\"John\",\"age\":30}";
```

### 18.3 Unicode Escape Sequences

```java
// Unicode characters
System.out.println("\u00A9");  // 
System.out.println("\u00AE");  // 
System.out.println("\u03A9");  // (Greek Omega)
System.out.println("\u2660");  // (Spade)
```

### 18.4 NB (Beginner Notes)

- Escape sequences start with backslash `\`
- Use `\"` for double quotes inside strings
- Use `\\` for actual backslash character
- `\n` for new line, `\t` for tab
- Unicode: `\uXXXX` where XXXX is 4-digit hex code

---

## 19. Practical Examples and Applications

### 19.1 Student Management System

```java
import java.util.Scanner;
import java.util.ArrayList;

class Student {
    String name;
    int age;
    double gpa;
    
    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    String getGrade() {
        return (gpa >= 3.7) ? "A" :
               (gpa >= 3.3) ? "B+" :
               (gpa >= 3.0) ? "B" : "C";
    }
}

public class StudentSystem {
    static ArrayList<Student> students = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Student Management ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Calculate Statistics");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            
            try {
                int choice = input.nextInt();
                input.nextLine();  // Consume newline
                
                switch (choice) {
                    case 1: addStudent(input); break;
                    case 2: viewStudents(); break;
                    case 3: calculateStatistics(); break;
                    case 4: System.exit(0);
                    default: System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number");
                input.nextLine();  // Clear invalid input
            }
        }
    }
    
    static void addStudent(Scanner input) {
        try {
            System.out.print("Name: ");
            String name = input.nextLine();
            
            System.out.print("Age: ");
            int age = input.nextInt();
            
            System.out.print("GPA: ");
            double gpa = input.nextDouble();
            
            if (age < 16 || age > 100) {
                System.out.println("Age must be between 16 and 100");
                return;
            }
            
            if (gpa < 0.0 || gpa > 4.0) {
                System.out.println("GPA must be between 0.0 and 4.0");
                return;
            }
            
            students.add(new Student(name, age, gpa));
            System.out.println("Student added successfully!");
            
        } catch (Exception e) {
            System.out.println("Invalid input format");
            input.nextLine();  // Clear buffer
        }
    }
    
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        
        System.out.println("\n=== Student List ===");
        System.out.printf("%-20s %-5s %-5s %s\n", "Name", "Age", "GPA", "Grade");
        System.out.println("----------------------------------------");
        
        for (Student s : students) {
            System.out.printf("%-20s %-5d %-5.1f %s\n", 
                             s.name, s.age, s.gpa, s.getGrade());
        }
    }
    
    static void calculateStatistics() {
        if (students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        
        double totalGpa = 0;
        double maxGpa = 0;
        Student topStudent = null;
        
        for (Student s : students) {
            totalGpa += s.gpa;
            if (s.gpa > maxGpa) {
                maxGpa = s.gpa;
                topStudent = s;
            }
        }
        
        double averageGpa = totalGpa / students.size();
        
        System.out.println("\n=== Statistics ===");
        System.out.printf("Total Students: %d\n", students.size());
        System.out.printf("Average GPA: %.2f\n", averageGpa);
        System.out.printf("Top Student: %s (%.1f)\n", 
                         topStudent.name, topStudent.gpa);
    }
}
```

### 19.2 Bank Account System

```java
import java.util.Scanner;

public class SimpleBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String accountName = "";
        double balance = 0.0;
        String password = "";
        boolean accountCreated = false;
        
        while (true) {
            System.out.println("\n=== SIMPLE BANK ===");
            
            if (!accountCreated) {
                System.out.println("1. Create Account");
                System.out.println("2. Exit");
            } else {
                System.out.println("Account: " + accountName);
                System.out.printf("Balance: $%.2f\n", balance);
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
            }
            
            System.out.print("Choice: ");
            int choice = input.nextInt();
            
            if (!accountCreated) {
                switch (choice) {
                    case 1:
                        input.nextLine();  // Clear buffer
                        System.out.print("Enter name: ");
                        accountName = input.nextLine().trim();
                        
                        if (accountName.length() < 2) {
                            System.out.println("Name too short!");
                            break;
                        }
                        
                        // Capitalize first letter
                        accountName = accountName.substring(0, 1).toUpperCase() + 
                                     accountName.substring(1).toLowerCase();
                        
                        System.out.print("Set password: ");
                        password = input.nextLine();
                        
                        System.out.print("Initial deposit: ");
                        balance = input.nextDouble();
                        
                        if (balance < 0) {
                            System.out.println("Invalid amount! Setting to $0");
                            balance = 0.0;
                        }
                        
                        accountCreated = true;
                        System.out.println("Account created!");
                        break;
                        
                    case 2:
                        System.out.println("Goodbye!");
                        System.exit(0);
                }
            } else {
                switch (choice) {
                    case 1: // Deposit
                        System.out.print("Deposit amount: ");
                        double deposit = input.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.printf("Deposited: $%.2f\n", deposit);
                            System.out.printf("New balance: $%.2f\n", balance);
                        } else {
                            System.out.println("Invalid amount!");
                        }
                        break;
                        
                    case 2: // Withdraw
                        System.out.print("Withdrawal amount: ");
                        double withdraw = input.nextDouble();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.printf("Withdrew: $%.2f\n", withdraw);
                            System.out.printf("New balance: $%.2f\n", balance);
                        } else if (withdraw > balance) {
                            System.out.println("Insufficient funds!");
                        } else {
                            System.out.println("Invalid amount!");
                        }
                        break;
                        
                    case 3: // Check Balance
                        System.out.printf("Current balance: $%.2f\n", balance);
                        break;
                        
                    case 4: // Exit
                        System.out.println("Thank you for banking!");
                        System.exit(0);
                }
            }
        }
    }
}
```

### 19.3 Time Conversion Utility

```java
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter time in seconds: ");
        try {
            int totalSeconds = input.nextInt();
            
            if (totalSeconds < 0) {
                System.out.println("Time cannot be negative");
                return;
            }
            
            // Calculate time components
            int days = totalSeconds / 86400;
            int remainingSeconds = totalSeconds % 86400;
            int hours = remainingSeconds / 3600;
            remainingSeconds %= 3600;
            int minutes = remainingSeconds / 60;
            int seconds = remainingSeconds % 60;
            
            System.out.printf("Time: %d days, %d hours, %d minutes, %d seconds\n",
                             days, hours, minutes, seconds);
            
        } catch (Exception e) {
            System.out.println("Please enter a valid integer");
        }
        
        input.close();
    }
}
```

### 19.4 Password Strength Checker

```java
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter password to check: ");
        String password = input.nextLine();
        
        int strength = 0;
        
        // Length check
        if (password.length() >= 8) strength++;
        
        // Check for digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (hasDigit) strength++;
        
        // Check for uppercase
        boolean hasUpper = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
                break;
            }
        }
        if (hasUpper) strength++;
        
        // Check for lowercase
        boolean hasLower = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLower = true;
                break;
            }
        }
        if (hasLower) strength++;
        
        // Check for special character
        boolean hasSpecial = false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
                break;
            }
        }
        if (hasSpecial) strength++;
        
        // Display result
        String strengthText = switch (strength) {
            case 5 -> "Very Strong";
            case 4 -> "Strong";
            case 3 -> "Medium";
            case 2 -> "Weak";
            default -> "Very Weak";
        };
        
        System.out.println("Password strength: " + strengthText);
        System.out.println("Score: " + strength + "/5");
        
        input.close();
    }
}
```

### 19.5 NB (Beginner Notes)

- Combine multiple concepts in real applications
- Always validate user input
- Use appropriate data types for different scenarios
- Handle exceptions gracefully
- Format output for better user experience
- Use meaningful variable names and comments
- Test your code with different inputs