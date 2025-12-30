# Java Docs

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
}
```

---

### NB (Important Notes)

* `Scanner` is a **class**, not a primitive data type
* Java equivalent of Python:

  ```python
  name = input()
  ```
* After using `nextInt()`, handle the newline before calling `nextLine()` to avoid bugs

---

# 7. Control Flow in Java

## 7.1 Conditional Statements (`if`, `else if`, `else`)

### Basic `if / else`

```java
int age = 20;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

### Explanation

* `if (age >= 18)` → checks the condition
* If `true` → executes first block
* If `false` → executes `else` block

---

### `else if` (Multiple conditions)

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

### NB (Important Notes)

* Conditions are evaluated **top to bottom**
* First `true` condition is executed
* Always use `{}` even for single statements

---

### Comparison: Primitives vs Objects

* For **primitives**: use `==`

```java
int a = 5;
if (a == 5) { }
```

* For **objects** like `String`: use `.equals()`

```java
String name = "John";
if (name.equals("John")) { }
```

Don’t use `==` for Strings (compares references, not value)

---

## 7.2 Ternary Operator (`?:`)

### Syntax

```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

### Example: Simple

```java
int age = 20;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result);
```

### Step-by-step

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