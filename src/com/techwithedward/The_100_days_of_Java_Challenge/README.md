# **100 Days of Java Challenge – Part 1 (Days 1–20)**



### **Day 1 – Print Personal Information**

**Problem Description:**
Write a program that declares variables for your name, age, and country, and prints them in a formatted way.

**Constraints:**

* `age` must be a positive integer.
* `name` and `country` are strings.
* Output must exactly match the format shown.

**Starter Code:**

```java
public class Day1 {
    public static void main(String[] args) {
        // TODO: declare variables and print them
    }
}
```

**Test Cases:**

Input:

```
name = "Edward", age = 22, country = "Kenya"
```

Output:

```
Name: Edward
Age: 22
Country: Kenya
```

Input:

```
name = "Alice", age = 30, country = "USA"
```

Output:

```
Name: Alice
Age: 30
Country: USA
```

---

### **Day 2 – Simple Calculator**

**Problem Description:**
Write a program that takes two integers and calculates their:

* Sum
* Difference
* Product
* Quotient

**Constraints:**

* Both numbers must be integers.
* The divisor must not be zero.

**Starter Code:**

```java
public class Day2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        // TODO: print sum, difference, product, and quotient
    }
}
```

**Test Cases:**

Input:

```
a = 10, b = 5
```

Output:

```
Sum: 15
Difference: 5
Product: 50
Quotient: 2
```

Input:

```
a = 20, b = 4
```

Output:

```
Sum: 24
Difference: 16
Product: 80
Quotient: 5
```

---

### **Day 3 – Even or Odd**

**Problem Description:**
Write a program that checks whether a given number is even or odd.

**Constraints:**

* Input must be an integer.
* Number can be positive, negative, or zero.

**Starter Code:**

```java
public class Day3 {
    public static void main(String[] args) {
        int num = 7;
        // TODO: check even or odd
    }
}
```

**Test Cases:**

Input:

```
num = 7
```

Output:

```
7 is Odd
```

Input:

```
num = 10
```

Output:

```
10 is Even
```

Input:

```
num = 0
```

Output:

```
0 is Even
```

---

### **Day 4 – Find Maximum**

**Problem Description:**
Write a program to find the largest among three integers.

**Constraints:**

* All three numbers must be integers.
* Numbers can be equal.

**Starter Code:**

```java
public class Day4 {
    public static void main(String[] args) {
        int a = 12, b = 25, c = 7;
        // TODO: find maximum
    }
}
```

**Test Cases:**

Input:

```
a = 12, b = 25, c = 7
```

Output:

```
Maximum: 25
```

Input:

```
a = 10, b = 10, c = 10
```

Output:

```
Maximum: 10
```

---

### **Day 5 – Swap Two Numbers**

**Problem Description:**
Write a program to swap two integers without using a third variable.

**Constraints:**

* Both numbers must be integers.
* Output should display before and after swapping.

**Starter Code:**

```java
public class Day5 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        // TODO: swap values
    }
}
```

**Test Cases:**

Input:

```
x = 10, y = 20
```

Output:

```
Before Swap: x=10, y=20
After Swap: x=20, y=10
```

Input:

```
x = -5, y = 15
```

Output:

```
Before Swap: x=-5, y=15
After Swap: x=15, y=-5
```

---

### **Day 6 – Multiplication Table**

**Problem Description:**
Write a program that prints the multiplication table of a given number from 1 to 10.

**Constraints:**

* Input number must be an integer.
* Table should go up to `num x 10`.

**Starter Code:**

```java
public class Day6 {
    public static void main(String[] args) {
        int num = 7;
        // TODO: print multiplication table
    }
}
```

**Test Cases:**

Input:

```
num = 7
```

Output (partial):

```
7 x 1 = 7
7 x 2 = 14
...
7 x 10 = 70
```

---

### **Day 7 – Factorial of a Number**

**Problem Description:**
Write a program that calculates the factorial of a given number using a loop.

**Constraints:**

* Input must be a non-negative integer.
* Factorial of 0 is 1.

**Starter Code:**

```java
public class Day7 {
    public static void main(String[] args) {
        int num = 5;
        // TODO: calculate factorial
    }
}
```

**Test Cases:**

Input:

```
num = 5
```

Output:

```
Factorial of 5 = 120
```

Input:

```
num = 0
```

Output:

```
Factorial of 0 = 1
```

---

### **Day 8 – Fibonacci Series**

**Problem Description:**
Write a program that prints the first `n` terms of the Fibonacci sequence.

**Constraints:**

* Input `n` must be a positive integer.
* First two terms are `0` and `1`.

**Starter Code:**

```java
public class Day8 {
    public static void main(String[] args) {
        int n = 10;
        // TODO: print Fibonacci series
    }
}
```

**Test Cases:**

Input:

```
n = 10
```

Output:

```
0 1 1 2 3 5 8 13 21 34
```

Input:

```
n = 5
```

Output:

```
0 1 1 2 3
```

---

### **Day 9 – Reverse a Number**

**Problem Description:**
Write a program that reverses the digits of a given integer.

**Constraints:**

* Input must be an integer.
* Works for positive and negative numbers.

**Starter Code:**

```java
public class Day9 {
    public static void main(String[] args) {
        int num = 1234;
        // TODO: reverse number
    }
}
```

**Test Cases:**

Input:

```
num = 1234
```

Output:

```
4321
```

Input:

```
num = -456
```

Output:

```
-654
```

---

### **Day 10 – Palindrome Number**

**Problem Description:**
Write a program that checks whether a given number is a palindrome.
(A palindrome reads the same forwards and backwards.)

**Constraints:**

* Input must be an integer.
* Works for positive numbers only.

**Starter Code:**

```java
public class Day10 {
    public static void main(String[] args) {
        int num = 121;
        // TODO: check palindrome
    }
}
```

**Test Cases:**

Input:

```
num = 121
```

Output:

```
121 is a Palindrome
```

Input:

```
num = 123
```

Output:

```
123 is Not a Palindrome
```


---

# **100 Days of Java Challenge – Part 1 (Days 11–20)**

---

### **Day 11 – Prime Number Check**

**Problem Description:**
Write a program that checks whether a given integer is a prime number.
A prime number is a number greater than 1 that has no divisors other than 1 and itself.

**Constraints:**

* Input must be an integer.
* Numbers ≤ 1 are not prime.

**Starter Code:**

```java
public class Day11 {
    public static void main(String[] args) {
        int num = 29;
        // TODO: check if prime
    }
}
```

**Test Cases:**

Input:

```
num = 29
```

Output:

```
29 is Prime
```

Input:

```
num = 15
```

Output:

```
15 is Not Prime
```

Input:

```
num = 1
```

Output:

```
1 is Not Prime
```

---

### **Day 12 – Armstrong Number**

**Problem Description:**
An Armstrong number of `n` digits is a number that is equal to the sum of its digits each raised to the power `n`.
Example: `153 = 1³ + 5³ + 3³`.

**Constraints:**

* Input must be a non-negative integer.

**Starter Code:**

```java
public class Day12 {
    public static void main(String[] args) {
        int num = 153;
        // TODO: check Armstrong number
    }
}
```

**Test Cases:**

Input:

```
num = 153
```

Output:

```
153 is an Armstrong Number
```

Input:

```
num = 123
```

Output:

```
123 is Not an Armstrong Number
```

---

### **Day 13 – Sum of Digits**

**Problem Description:**
Write a program that finds the sum of the digits of a given integer.

**Constraints:**

* Input must be an integer.
* Works for positive numbers only.

**Starter Code:**

```java
public class Day13 {
    public static void main(String[] args) {
        int num = 987;
        // TODO: calculate sum of digits
    }
}
```

**Test Cases:**

Input:

```
num = 987
```

Output:

```
Sum of digits = 24
```

Input:

```
num = 12345
```

Output:

```
Sum of digits = 15
```

---

### **Day 14 – Count Digits**

**Problem Description:**
Write a program that counts the number of digits in a given integer.

**Constraints:**

* Input must be an integer.
* Works for positive numbers only.

**Starter Code:**

```java
public class Day14 {
    public static void main(String[] args) {
        int num = 12345;
        // TODO: count digits
    }
}
```

**Test Cases:**

Input:

```
num = 12345
```

Output:

```
Number of digits = 5
```

Input:

```
num = 7
```

Output:

```
Number of digits = 1
```

---

### **Day 15 – GCD of Two Numbers**

**Problem Description:**
Write a program to find the Greatest Common Divisor (GCD) of two integers.

**Constraints:**

* Both inputs must be integers.
* GCD of two numbers is the largest integer that divides both numbers.

**Starter Code:**

```java
public class Day15 {
    public static void main(String[] args) {
        int a = 56, b = 98;
        // TODO: find GCD
    }
}
```

**Test Cases:**

Input:

```
a = 56, b = 98
```

Output:

```
GCD = 14
```

Input:

```
a = 20, b = 30
```

Output:

```
GCD = 10
```

---

### **Day 16 – LCM of Two Numbers**

**Problem Description:**
Write a program to find the Least Common Multiple (LCM) of two integers.

**Constraints:**

* Both inputs must be integers.
* LCM of two numbers is the smallest integer that is a multiple of both.

**Starter Code:**

```java
public class Day16 {
    public static void main(String[] args) {
        int a = 15, b = 20;
        // TODO: find LCM
    }
}
```

**Test Cases:**

Input:

```
a = 15, b = 20
```

Output:

```
LCM = 60
```

Input:

```
a = 7, b = 5
```

Output:

```
LCM = 35
```

---

### **Day 17 – Power of a Number**

**Problem Description:**
Write a program to calculate `base^exponent` using a loop.

**Constraints:**

* Base and exponent must be integers.
* Exponent must be non-negative.

**Starter Code:**

```java
public class Day17 {
    public static void main(String[] args) {
        int base = 2, exponent = 5;
        // TODO: calculate power
    }
}
```

**Test Cases:**

Input:

```
base = 2, exponent = 5
```

Output:

```
2^5 = 32
```

Input:

```
base = 3, exponent = 3
```

Output:

```
3^3 = 27
```


### **Day 18 – Leap Year Check**

**Problem Description:**
Write a program that checks whether a given year is a leap year.
A year is a leap year if:

* It is divisible by 4 but not by 100, OR
* It is divisible by 400.

**Constraints:**

* Input must be a positive integer (year > 0).

**Starter Code:**

```java
public class Day18 {
    public static void main(String[] args) {
        int year = 2024;
        // TODO: check leap year
    }
}
```

**Test Cases:**

Input:

```
year = 2024
```

Output:

```
2024 is a Leap Year
```

Input:

```
year = 1900
```

Output:

```
1900 is Not a Leap Year
```

Input:

```
year = 2000
```

Output:

```
2000 is a Leap Year
```

---

### **Day 19 – ASCII Value of a Character**

**Problem Description:**
Write a program that finds and prints the ASCII value of a given character.

**Constraints:**

* Input must be a single character.

**Starter Code:**

```java
public class Day19 {
    public static void main(String[] args) {
        char ch = 'A';
        // TODO: print ASCII value
    }
}
```

**Test Cases:**

Input:

```
ch = 'A'
```

Output:

```
ASCII value of A = 65
```

Input:

```
ch = 'z'
```

Output:

```
ASCII value of z = 122
```

---

### **Day 20 – Vowel or Consonant**

**Problem Description:**
Write a program that checks whether a character is a vowel or a consonant.

**Constraints:**

* Input must be a single alphabet character.
* Consider both lowercase and uppercase.

**Starter Code:**

```java
public class Day20 {
    public static void main(String[] args) {
        char ch = 'e';
        // TODO: check vowel or consonant
    }
}
```

**Test Cases:**

Input:

```
ch = 'e'
```

Output:

```
e is a Vowel
```

Input:

```
ch = 'B'
```

Output:

```
B is a Consonant
```


---

# **100 Days of Java Challenge – Part 2 (Days 21–40)**

---

### **Day 21 – Array Sum**

**Problem Description:**
Write a program that calculates the sum of all elements in an integer array.

**Constraints:**

* Array must contain at least one element.
* All elements are integers.

**Starter Code:**

```java
public class Day21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // TODO: calculate sum
    }
}
```

**Test Cases:**

Input:

```
arr = {1, 2, 3, 4, 5}
```

Output:

```
Sum = 15
```

Input:

```
arr = {10, -2, 7}
```

Output:

```
Sum = 15
```

---

### **Day 22 – Find Minimum and Maximum in Array**

**Problem Description:**
Write a program that finds the smallest and largest numbers in an array.

**Constraints:**

* Array must not be empty.

**Starter Code:**

```java
public class Day22 {
    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62};
        // TODO: find min and max
    }
}
```

**Test Cases:**

Input:

```
arr = {34, 7, 23, 32, 5, 62}
```

Output:

```
Min = 5
Max = 62
```

Input:

```
arr = {-10, 0, 50, 20}
```

Output:

```
Min = -10
Max = 50
```

---

### **Day 23 – Reverse an Array**

**Problem Description:**
Write a program that reverses the elements of an array.

**Constraints:**

* Array must not be empty.

**Starter Code:**

```java
public class Day23 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // TODO: reverse array
    }
}
```

**Test Cases:**

Input:

```
arr = {1, 2, 3, 4, 5}
```

Output:

```
{5, 4, 3, 2, 1}
```

Input:

```
arr = {10, 20}
```

Output:

```
{20, 10}
```

---

### **Day 24 – Linear Search**

**Problem Description:**
Write a program that searches for an element in an array using linear search.

**Constraints:**

* Array must not be empty.
* If the element is not found, return -1.

**Starter Code:**

```java
public class Day24 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 40, 50};
        int target = 30;
        // TODO: implement linear search
    }
}
```

**Test Cases:**

Input:

```
arr = {10, 25, 30, 40, 50}, target = 30
```

Output:

```
Element found at index 2
```

Input:

```
arr = {1, 2, 3, 4}, target = 9
```

Output:

```
Element not found
```

---

### **Day 25 – Binary Search**

**Problem Description:**
Write a program that searches for an element in a **sorted array** using binary search.

**Constraints:**

* Array must be sorted in ascending order.
* If the element is not found, return -1.

**Starter Code:**

```java
public class Day25 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30};
        int target = 20;
        // TODO: implement binary search
    }
}
```

**Test Cases:**

Input:

```
arr = {5, 10, 15, 20, 25, 30}, target = 20
```

Output:

```
Element found at index 3
```

Input:

```
arr = {1, 3, 5, 7, 9}, target = 4
```

Output:

```
Element not found
```

---

### **Day 26 – Bubble Sort**

**Problem Description:**
Write a program that sorts an array using the Bubble Sort algorithm.

**Constraints:**

* Array must not be empty.

**Starter Code:**

```java
public class Day26 {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        // TODO: implement bubble sort
    }
}
```

**Test Cases:**

Input:

```
arr = {64, 34, 25, 12, 22, 11, 90}
```

Output:

```
{11, 12, 22, 25, 34, 64, 90}
```

Input:

```
arr = {5, 1, 4, 2, 8}
```

Output:

```
{1, 2, 4, 5, 8}
```

---

### **Day 27 – String Palindrome**

**Problem Description:**
Write a program that checks whether a given string is a palindrome.

**Constraints:**

* Ignore case (e.g., "Level" is a palindrome).
* Input must be a string with no spaces.

**Starter Code:**

```java
public class Day27 {
    public static void main(String[] args) {
        String str = "level";
        // TODO: check palindrome
    }
}
```

**Test Cases:**

Input:

```
str = "level"
```

Output:

```
level is a Palindrome
```

Input:

```
str = "hello"
```

Output:

```
hello is Not a Palindrome
```

---

### **Day 28 – Count Vowels and Consonants in String**

**Problem Description:**
Write a program that counts the number of vowels and consonants in a string.

**Constraints:**

* Input string must contain only alphabets.
* Both uppercase and lowercase should be counted.

**Starter Code:**

```java
public class Day28 {
    public static void main(String[] args) {
        String str = "JavaProgramming";
        // TODO: count vowels and consonants
    }
}
```

**Test Cases:**

Input:

```
str = "JavaProgramming"
```

Output:

```
Vowels = 5
Consonants = 10
```

Input:

```
str = "Hello"
```

Output:

```
Vowels = 2
Consonants = 3
```

---

### **Day 29 – String Reverse**

**Problem Description:**
Write a program that reverses a given string.

**Constraints:**

* Input string must not be empty.

**Starter Code:**

```java
public class Day29 {
    public static void main(String[] args) {
        String str = "Java";
        // TODO: reverse string
    }
}
```

**Test Cases:**

Input:

```
str = "Java"
```

Output:

```
avaJ
```

Input:

```
str = "OpenAI"
```

Output:

```
IAnepO
```

---

### **Day 30 – Count Words in String**

**Problem Description:**
Write a program that counts the number of words in a sentence.

**Constraints:**

* Words are separated by spaces.
* Input string must not be empty.

**Starter Code:**

```java
public class Day30 {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        // TODO: count words
    }
}
```

**Test Cases:**

Input:

```
sentence = "Java is powerful"
```

Output:

```
Number of words = 3
```

Input:

```
sentence = "I love coding in Java"
```

Output:

```
Number of words = 5
```


---

# **100 Days of Java Challenge – Part 2 (Days 31–40)**

---

### **Day 31 – Define a Class and Create an Object**

**Problem Description:**
Create a class `Car` with fields `brand` and `year`. Then, in the main method, create an object of the class and print its details.

**Constraints:**

* Brand should be a non-empty string.
* Year should be a positive integer.

**Starter Code:**

```java
class Car {
    String brand;
    int year;

    // TODO: define constructor and a method to display details
}

public class Day31 {
    public static void main(String[] args) {
        // TODO: create object and call display method
    }
}
```

**Test Cases:**

Output (with example data):

```
Brand: Toyota
Year: 2020
```

Output:

```
Brand: Tesla
Year: 2022
```

---

### **Day 32 – Constructor Overloading**

**Problem Description:**
Create a class `Student` with fields `name` and `age`.

* Define two constructors: one that initializes only the name, and another that initializes both name and age.
* Print student details.

**Constraints:**

* Age should be positive if provided.

**Starter Code:**

```java
class Student {
    String name;
    int age;

    // TODO: constructor overloading
}

public class Day32 {
    public static void main(String[] args) {
        // TODO: test both constructors
    }
}
```

**Test Cases:**

Output:

```
Name: Alice, Age: 0
Name: Bob, Age: 21
```

---

### **Day 33 – Method Overloading**

**Problem Description:**
Create a class `Calculator` that overloads the `add()` method to:

* Add two integers.
* Add three integers.
* Add two doubles.

**Constraints:**

* Methods must have the same name but different parameter lists.

**Starter Code:**

```java
class Calculator {
    // TODO: overload add() method
}

public class Day33 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // TODO: test overloaded methods
    }
}
```

**Test Cases:**

Output:

```
Sum of 2 integers: 7
Sum of 3 integers: 12
Sum of 2 doubles: 10.5
```

---

### **Day 34 – Encapsulation**

**Problem Description:**
Create a class `BankAccount` with private fields `accountNumber` and `balance`.

* Provide `get` and `set` methods.
* Ensure balance cannot be negative.

**Constraints:**

* Use getters and setters to access private fields.

**Starter Code:**

```java
class BankAccount {
    private String accountNumber;
    private double balance;

    // TODO: implement getter and setter methods
}

public class Day34 {
    public static void main(String[] args) {
        // TODO: create object and use getter/setter
    }
}
```

**Test Cases:**

Output:

```
Account Number: 12345
Balance: 500.0
```

---

### **Day 35 – Inheritance Basics**

**Problem Description:**
Create a base class `Animal` with a method `makeSound()`.
Create a derived class `Dog` that overrides the `makeSound()` method.

**Constraints:**

* Use `extends` keyword for inheritance.

**Starter Code:**

```java
class Animal {
    // TODO: define makeSound() method
}

class Dog extends Animal {
    // TODO: override makeSound() method
}

public class Day35 {
    public static void main(String[] args) {
        // TODO: test inheritance
    }
}
```

**Test Cases:**

Output:

```
Animal sound
Woof Woof
```

---

### **Day 36 – Multilevel Inheritance**

**Problem Description:**
Create a class hierarchy:

* `Person` → `Employee` → `Manager`.
  Each subclass should add one extra field and a method to display details.

**Constraints:**

* Use constructor chaining with `super()`.

**Starter Code:**

```java
class Person {
    // TODO: fields and constructor
}

class Employee extends Person {
    // TODO: extend Person
}

class Manager extends Employee {
    // TODO: extend Employee
}

public class Day36 {
    public static void main(String[] args) {
        // TODO: test multilevel inheritance
    }
}
```

**Test Cases:**

Output:

```
Name: Alice
Employee ID: E123
Department: HR
```

---

### **Day 37 – Method Overriding (Polymorphism)**

**Problem Description:**
Create a base class `Shape` with a method `area()`.
Override `area()` in subclasses `Circle` and `Rectangle`.

**Constraints:**

* Use `@Override` annotation.

**Starter Code:**

```java
class Shape {
    // TODO: define area() method
}

class Circle extends Shape {
    // TODO: override area()
}

class Rectangle extends Shape {
    // TODO: override area()
}

public class Day37 {
    public static void main(String[] args) {
        // TODO: demonstrate polymorphism
    }
}
```

**Test Cases:**

Output:

```
Area of Circle = 78.5
Area of Rectangle = 20
```

---

### **Day 38 – Abstract Class**

**Problem Description:**
Create an abstract class `Vehicle` with an abstract method `start()`.
Implement this method in subclasses `Car` and `Bike`.

**Constraints:**

* Abstract methods must be implemented in subclasses.

**Starter Code:**

```java
abstract class Vehicle {
    // TODO: abstract method start()
}

class Car extends Vehicle {
    // TODO: implement start()
}

class Bike extends Vehicle {
    // TODO: implement start()
}

public class Day38 {
    public static void main(String[] args) {
        // TODO: test abstract class
    }
}
```

**Test Cases:**

Output:

```
Car starts with a key
Bike starts with a button
```

---

### **Day 39 – Interface Implementation**

**Problem Description:**
Create an interface `Playable` with a method `play()`.
Implement this interface in classes `Guitar` and `Piano`.

**Constraints:**

* Classes must implement all interface methods.

**Starter Code:**

```java
interface Playable {
    // TODO: declare play() method
}

class Guitar implements Playable {
    // TODO: implement play()
}

class Piano implements Playable {
    // TODO: implement play()
}

public class Day39 {
    public static void main(String[] args) {
        // TODO: test interface
    }
}
```

**Test Cases:**

Output:

```
Playing Guitar
Playing Piano
```

---

### **Day 40 – Multiple Interfaces**

**Problem Description:**
Create two interfaces:

* `Flyable` with method `fly()`.
* `Swimmable` with method `swim()`.

Create a class `Duck` that implements both interfaces.

**Constraints:**

* Class must implement all methods from both interfaces.

**Starter Code:**

```java
interface Flyable {
    // TODO: declare fly()
}

interface Swimmable {
    // TODO: declare swim()
}

class Duck implements Flyable, Swimmable {
    // TODO: implement both methods
}

public class Day40 {
    public static void main(String[] args) {
        // TODO: test multiple interfaces
    }
}
```

**Test Cases:**

Output:

```
Duck can fly
Duck can swim
```

---


Great 💪 Let’s push forward into **Days 41–60 (Data Structures & Algorithms)**.
We’ll start simple (linked lists, stacks, queues) and move into trees, recursion, and sorting/searching algorithms.

---

# **100 Days of Java Challenge – Part 3 (Days 41–60: Data Structures & Algorithms)**

---

### **Day 41 – Singly Linked List (Insert & Display)**

**Problem Description:**
Implement a singly linked list with two operations:

1. Insert a new node at the end.
2. Display all nodes in the list.

**Constraints:**

* Each node contains an integer.
* Display nodes in order separated by `->`.

**Starter Code:**

```java
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day41 {
    Node head;

    // TODO: implement insert() and display()

    public static void main(String[] args) {
        Day41 list = new Day41();
        // Test insert and display
    }
}
```

**Test Cases:**
Input: Insert \[10, 20, 30]
Output:

```
10 -> 20 -> 30
```

Input: Insert \[5, 15]
Output:

```
5 -> 15
```

---

### **Day 42 – Linked List (Delete Node)**

**Problem Description:**
Extend the linked list from Day 41 to support deleting a node by value.

**Constraints:**

* If the value is not found, display a message.

**Starter Code:**

```java
public class Day42 {
    Node head;

    // TODO: implement insert(), delete(int value), display()

    public static void main(String[] args) {
        Day42 list = new Day42();
        // Test delete and display
    }
}
```

**Test Cases:**
Input: Insert \[10, 20, 30], Delete 20
Output:

```
10 -> 30
```

Input: Insert \[1, 2, 3], Delete 5
Output:

```
Value not found
```

---

### **Day 43 – Stack Using Array**

**Problem Description:**
Implement a stack using an array with operations:

1. `push()` → insert element
2. `pop()` → remove element
3. `peek()` → return top element

**Constraints:**

* Stack size must be fixed.
* Handle stack overflow and underflow.

**Starter Code:**

```java
public class Day43 {
    int top;
    int[] stack;
    int capacity;

    // TODO: implement push, pop, peek

    public static void main(String[] args) {
        // Test stack
    }
}
```

**Test Cases:**

```
Push: 10, 20, 30
Peek -> 30
Pop -> 30
Peek -> 20
```

---

### **Day 44 – Stack Using Linked List**

**Problem Description:**
Implement a stack using linked list with `push()`, `pop()`, and `peek()`.

**Constraints:**

* No array allowed.

**Starter Code:**

```java
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class Day44 {
    Node top;

    // TODO: implement push, pop, peek

    public static void main(String[] args) {
        // Test stack
    }
}
```

**Test Cases:**

```
Push: 5, 15
Peek -> 15
Pop -> 15
Peek -> 5
```

---

### **Day 45 – Queue Using Array**

**Problem Description:**
Implement a queue using an array with operations:

1. `enqueue()` → insert element
2. `dequeue()` → remove element
3. `peek()` → return front element

**Constraints:**

* Queue size is fixed.
* Handle overflow and underflow.

**Starter Code:**

```java
public class Day45 {
    int front, rear, size, capacity;
    int[] queue;

    // TODO: implement enqueue, dequeue, peek

    public static void main(String[] args) {
        // Test queue
    }
}
```

**Test Cases:**

```
Enqueue: 10, 20
Peek -> 10
Dequeue -> 10
Peek -> 20
```

---

### **Day 46 – Queue Using Linked List**

**Problem Description:**
Implement a queue using linked list with `enqueue()` and `dequeue()`.

**Constraints:**

* No array allowed.

**Starter Code:**

```java
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class Day46 {
    Node front, rear;

    // TODO: implement enqueue, dequeue

    public static void main(String[] args) {
        // Test queue
    }
}
```

**Test Cases:**

```
Enqueue: 5, 10
Dequeue -> 5
Peek -> 10
```

---

### **Day 47 – Circular Queue**

**Problem Description:**
Implement a circular queue using an array.

**Constraints:**

* Must wrap around when rear reaches end.

**Starter Code:**

```java
public class Day47 {
    int front, rear, size, capacity;
    int[] queue;

    // TODO: implement circular enqueue, dequeue

    public static void main(String[] args) {
        // Test circular queue
    }
}
```

**Test Cases:**

```
Enqueue: 1, 2, 3
Dequeue -> 1
Enqueue: 4
Queue = [2, 3, 4]
```

---

### **Day 48 – Binary Tree (Insert & Inorder Traversal)**

**Problem Description:**
Implement a binary tree with `insert()` and `inorderTraversal()`.

**Constraints:**

* Each node contains an integer.

**Starter Code:**

```java
class Node {
    int data;
    Node left, right;
    Node(int data) { this.data = data; }
}

public class Day48 {
    Node root;

    // TODO: implement insert, inorderTraversal

    public static void main(String[] args) {
        // Test binary tree
    }
}
```

**Test Cases:**
Input: Insert \[50, 30, 70, 20, 40, 60, 80]
Output (Inorder):

```
20 30 40 50 60 70 80
```

---

### **Day 49 – Binary Search Tree (Search Node)**

**Problem Description:**
Implement a search operation in a BST.

**Constraints:**

* Return true if found, else false.

**Starter Code:**

```java
public class Day49 {
    Node root;

    // TODO: implement insert, search

    public static void main(String[] args) {
        // Test BST
    }
}
```

**Test Cases:**

```
Insert: [50, 30, 70]
Search 30 -> Found
Search 90 -> Not Found
```

---

### **Day 50 – Binary Tree (Preorder & Postorder Traversal)**

**Problem Description:**
Extend binary tree to support preorder and postorder traversals.

**Constraints:**

* Use recursion.

**Starter Code:**

```java
public class Day50 {
    Node root;

    // TODO: implement preorder, postorder

    public static void main(String[] args) {
        // Test traversals
    }
}
```

**Test Cases:**
Input: Insert \[10, 20, 30]
Preorder:

```
10 20 30
```

Postorder:

```
30 20 10
```

---

### **Day 51 – Recursion: Factorial**

**Problem Description:**
Write a recursive function to compute factorial of a number.

**Constraints:**

* Input must be non-negative.

**Starter Code:**

```java
public class Day51 {
    public static int factorial(int n) {
        // TODO: recursive factorial
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
```

**Test Cases:**

```
Input: 5 -> Output: 120
Input: 0 -> Output: 1
```

---

### **Day 52 – Recursion: Fibonacci**

**Problem Description:**
Write a recursive function to compute the nth Fibonacci number.

**Constraints:**

* n ≥ 0.
* Fib(0)=0, Fib(1)=1.

**Starter Code:**

```java
public class Day52 {
    public static int fibonacci(int n) {
        // TODO: recursive fibonacci
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}
```

**Test Cases:**

```
Input: 6 -> Output: 8
Input: 0 -> Output: 0
```

---

### **Day 53 – Power Function (Recursion)**

**Problem Description:**
Write a recursive function to compute `a^b`.

**Constraints:**

* b ≥ 0.

**Starter Code:**

```java
public class Day53 {
    public static int power(int a, int b) {
        // TODO: recursive power
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
```

**Test Cases:**

```
Input: 2^5 -> Output: 32
Input: 3^3 -> Output: 27
```

---

### **Day 54 – Merge Sort**

**Problem Description:**
Implement merge sort to sort an array.

**Constraints:**

* Use recursion.

**Starter Code:**

```java
public class Day54 {
    // TODO: implement merge sort

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
    }
}
```

**Test Cases:**
Input: `{38, 27, 43, 3, 9, 82, 10}`
Output: `{3, 9, 10, 27, 38, 43, 82}`

---

### **Day 55 – Quick Sort**

**Problem Description:**
Implement quick sort to sort an array.

**Constraints:**

* Use recursion.

**Starter Code:**

```java
public class Day55 {
    // TODO: implement quick sort

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
    }
}
```

**Test Cases:**
Input: `{10, 7, 8, 9, 1, 5}`
Output: `{1, 5, 7, 8, 9, 10}`

---

### **Day 56 – Heap Sort**

**Problem Description:**
Implement heap sort to sort an array.

**Constraints:**

* Use max-heap.

**Starter Code:**

```java
public class Day56 {
    // TODO: implement heap sort

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
    }
}
```

**Test Cases:**
Input: `{12, 11, 13, 5, 6, 7}`
Output: `{5, 6, 7, 11, 12, 13}`

---

### **Day 57 – Graph Representation (Adjacency List)**

**Problem Description:**
Implement a graph using adjacency list representation.

**Constraints:**

* Graph is undirected.

**Starter Code:**

```java
import java.util.*;

public class Day57 {
    Map<Integer, List<Integer>> adjList = new HashMap<>();

    // TODO: implement addEdge, printGraph

    public static void main(String[] args) {
        // Test graph
    }
}
```

**Test Cases:**

```
Add edges: (0,1), (0,2), (1,2), (2,3)
Graph:
0 -> 1 2
1 -> 0 2
2 -> 0 1 3
3 -> 2
```

---

### **Day 58 – BFS (Breadth-First Search)**

**Problem Description:**
Implement BFS traversal for a graph using adjacency list.

**Constraints:**

* Start from a given node.

**Starter Code:**

```java
import java.util.*;

public class Day58 {
    Map<Integer, List<Integer>> adjList = new HashMap<>();

    // TODO: addEdge, bfs(start)

    public static void main(String[] args) {
        // Test BFS
    }
}
```

**Test Cases:**
Graph edges: (0,1), (0,2), (1,2), (2,3)
BFS from 0 →

```
0 1 2 3
```

---

### **Day 59 – DFS (Depth-First Search)**

**Problem Description:**
Implement DFS traversal for a graph using adjacency list.

**Constraints:**

* Use recursion.

**Starter Code:**

```java
import java.util.*;

public class Day59 {
    Map<Integer, List<Integer>> adjList = new HashMap<>();

    // TODO: addEdge, dfs(start)

    public static void main(String[] args) {
        // Test DFS
    }
}
```

**Test Cases:**
Graph edges: (0,1), (0,2), (1,2), (2,3)
DFS from 0 →

```
0 1 2 3
```

---

### **Day 60 – Dijkstra’s Algorithm**

**Problem Description:**
Implement Dijkstra’s algorithm to find the shortest path from a source node to all other nodes in a weighted graph.

**Constraints:**

* Graph must be weighted and non-negative.

**Starter Code:**

```java
import java.util.*;

public class Day60 {
    // TODO: implement Dijkstra’s algorithm

    public static void main(String[] args) {
        // Test shortest path
    }
}
```

**Test Cases:**
Graph:

```
0 -> (1,4), (2,1)
2 -> (1,2), (3,5)
1 -> (3,1)
```

Source = 0
Output shortest distances:

```
0: 0
1: 3
2: 1
3: 4
```

---


Perfect 🚀 Let’s move to **Days 61–80 (Backend with Java: JDBC, Servlets, Spring Boot basics, REST APIs, etc.)**.
Here you’ll start bridging from Java fundamentals + DSA into **real-world backend development**.

---

# **100 Days of Java Challenge – Part 4 (Days 61–80: Backend Development)**

---

### **Day 61 – JDBC: Connect to Database**

**Problem Description:**
Write a program that connects to a MySQL database using JDBC. Print "Connection successful" if connected.

**Constraints:**

* Use `DriverManager.getConnection()`.
* Handle exceptions properly.

**Starter Code:**

```java
import java.sql.*;

public class Day61 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try {
            // TODO: connect to database
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

**Test Cases:**
Output:

```
Connection successful
```

---

### **Day 62 – JDBC: Insert Record**

**Problem Description:**
Insert a new record into a `students` table with fields (id, name, age).

**Constraints:**

* Use `PreparedStatement`.
* Age must be positive.

**Starter Code:**

```java
import java.sql.*;

public class Day62 {
    public static void main(String[] args) {
        // TODO: insert into students table
    }
}
```

**Test Cases:**
Insert → `(1, "Alice", 20)`
Output:

```
Record inserted successfully
```

---

### **Day 63 – JDBC: Read Records**

**Problem Description:**
Read and display all records from the `students` table.

**Constraints:**

* Use `ResultSet`.

**Starter Code:**

```java
import java.sql.*;

public class Day63 {
    public static void main(String[] args) {
        // TODO: read from students table
    }
}
```

**Test Cases:**
Output:

```
ID: 1, Name: Alice, Age: 20
```

---

### **Day 64 – JDBC: Update Record**

**Problem Description:**
Update the age of a student based on their ID.

**Constraints:**

* Use `PreparedStatement`.

**Starter Code:**

```java
import java.sql.*;

public class Day64 {
    public static void main(String[] args) {
        // TODO: update student age
    }
}
```

**Test Cases:**
Input: Update ID=1, Age=21
Output:

```
Record updated successfully
```

---

### **Day 65 – JDBC: Delete Record**

**Problem Description:**
Delete a student record based on ID.

**Constraints:**

* Use `PreparedStatement`.

**Starter Code:**

```java
import java.sql.*;

public class Day65 {
    public static void main(String[] args) {
        // TODO: delete student record
    }
}
```

**Test Cases:**
Input: Delete ID=1
Output:

```
Record deleted successfully
```

---

### **Day 66 – JDBC: Transactions**

**Problem Description:**
Implement a transaction where two insert operations happen together. If one fails, rollback both.

**Constraints:**

* Use `commit()` and `rollback()`.

**Starter Code:**

```java
import java.sql.*;

public class Day66 {
    public static void main(String[] args) {
        // TODO: implement transaction
    }
}
```

**Test Cases:**
If second insert fails → Output:

```
Transaction rolled back
```

---

### **Day 67 – Servlet: Hello World**

**Problem Description:**
Create a servlet that prints "Hello, World" in the browser.

**Constraints:**

* Extend `HttpServlet`.
* Override `doGet()`.

**Starter Code:**

```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Day67 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // TODO: print Hello World
    }
}
```

**Test Cases:**
Request → `/hello`
Response →

```
Hello, World
```

---

### **Day 68 – Servlet: HTML Form Handling**

**Problem Description:**
Create a servlet that accepts `name` and `email` from an HTML form and prints them.

**Constraints:**

* Use `doPost()`.

**Starter Code:**

```java
public class Day68 extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // TODO: read parameters and print
    }
}
```

**Test Cases:**
Form input: Name=Alice, Email=[alice@mail.com](mailto:alice@mail.com)
Output:

```
Name: Alice
Email: alice@mail.com
```

---

### **Day 69 – Servlet: Session Tracking**

**Problem Description:**
Create a servlet that uses `HttpSession` to store and retrieve username across requests.

**Constraints:**

* Store `username` in session.

**Starter Code:**

```java
public class Day69 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // TODO: session handling
    }
}
```

**Test Cases:**
First request → set session username
Second request → retrieve username

```
Welcome back, Alice
```

---

### **Day 70 – Servlet: Cookie Handling**

**Problem Description:**
Create a servlet that stores a cookie with user preference (e.g., theme=dark).

**Constraints:**

* Use `Cookie` class.

**Starter Code:**

```java
public class Day70 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // TODO: set and read cookies
    }
}
```

**Test Cases:**
First visit → sets cookie
Next visit →

```
Theme preference: dark
```

---

### **Day 71 – Spring Boot: Hello World**

**Problem Description:**
Create a Spring Boot project and expose a REST endpoint `/hello` that returns "Hello, Spring Boot!".

**Constraints:**

* Use `@RestController` and `@GetMapping`.

**Starter Code:**

```java
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class Day71 {
    @GetMapping("/hello")
    public String hello() {
        // TODO: return message
    }

    public static void main(String[] args) {
        SpringApplication.run(Day71.class, args);
    }
}
```

**Test Cases:**
Request: `/hello`
Response:

```
Hello, Spring Boot!
```

---

### **Day 72 – Spring Boot: Path Variables**

**Problem Description:**
Create a Spring Boot endpoint `/user/{name}` that returns "Hello {name}".

**Constraints:**

* Use `@PathVariable`.

**Starter Code:**

```java
@RestController
public class Day72 {
    @GetMapping("/user/{name}")
    public String greet(@PathVariable String name) {
        // TODO: return greeting
    }
}
```

**Test Cases:**
Request: `/user/Edward`
Response:

```
Hello Edward
```

---

### **Day 73 – Spring Boot: Query Parameters**

**Problem Description:**
Create an endpoint `/search` that accepts query parameter `q` and prints "Searching for q".

**Constraints:**

* Use `@RequestParam`.

**Starter Code:**

```java
@RestController
public class Day73 {
    @GetMapping("/search")
    public String search(@RequestParam String q) {
        // TODO: return search message
    }
}
```

**Test Cases:**
Request: `/search?q=Java`
Response:

```
Searching for Java
```

---

### **Day 74 – Spring Boot: POST Request**

**Problem Description:**
Create a POST endpoint `/addUser` that accepts JSON `{ "name": "Alice", "age": 25 }` and prints it.

**Constraints:**

* Use `@RequestBody`.

**Starter Code:**

```java
@RestController
public class Day74 {
    @PostMapping("/addUser")
    public String addUser(@RequestBody String user) {
        // TODO: return received data
    }
}
```

**Test Cases:**
Request:

```
POST /addUser
{ "name": "Alice", "age": 25 }
```

Response:

```
User received: { "name": "Alice", "age": 25 }
```

---

### **Day 75 – Spring Boot: CRUD – Create**

**Problem Description:**
Implement a REST API to add a `User` with `id`, `name`, and `email`. Store in a list.

**Constraints:**

* Use `POST`.

**Starter Code:**

```java
import java.util.*;

@RestController
public class Day75 {
    List<String> users = new ArrayList<>();

    @PostMapping("/user")
    public String addUser(@RequestBody String user) {
        // TODO: add user
    }
}
```

**Test Cases:**
Request:

```
POST /user
{ "id": 1, "name": "Alice", "email": "alice@mail.com" }
```

Response:

```
User added
```

---

### **Day 76 – Spring Boot: CRUD – Read**

**Problem Description:**
Implement a `GET /users` endpoint that returns all users.

**Constraints:**

* Return a list of users.

**Starter Code:**

```java
@RestController
public class Day76 {
    List<String> users = new ArrayList<>();

    @GetMapping("/users")
    public List<String> getUsers() {
        // TODO: return users
    }
}
```

**Test Cases:**
Response:

```
[{ "id": 1, "name": "Alice", "email": "alice@mail.com" }]
```

---

### **Day 77 – Spring Boot: CRUD – Update**

**Problem Description:**
Implement a `PUT /user/{id}` endpoint to update a user’s details.

**Constraints:**

* If user not found, return error message.

**Starter Code:**

```java
@RestController
public class Day77 {
    List<String> users = new ArrayList<>();

    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable int id, @RequestBody String user) {
        // TODO: update user
    }
}
```

**Test Cases:**
Request:

```
PUT /user/1
{ "id": 1, "name": "Alice", "email": "alice_new@mail.com" }
```

Response:

```
User updated
```

---

### **Day 78 – Spring Boot: CRUD – Delete**

**Problem Description:**
Implement a `DELETE /user/{id}` endpoint to delete a user.

**Constraints:**

* If user not found, return error.

**Starter Code:**

```java
@RestController
public class Day78 {
    List<String> users = new ArrayList<>();

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id) {
        // TODO: delete user
    }
}
```

**Test Cases:**
Request:

```
DELETE /user/1
```

Response:

```
User deleted
```

---

### **Day 79 – Spring Boot: Exception Handling**

**Problem Description:**
Create a REST API that throws a custom exception if user not found. Handle it with `@ExceptionHandler`.

**Constraints:**

* Define a custom `UserNotFoundException`.

**Starter Code:**

```java
@RestController
public class Day79 {
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable int id) {
        // TODO: throw exception if not found
    }

    @ExceptionHandler(UserNotFoundException.class)
    public String handleException(UserNotFoundException e) {
        // TODO: return error message
    }
}
```

**Test Cases:**
Request: `/user/99`
Response:

```
Error: User not found
```

---

### **Day 80 – Spring Boot: REST + Service Layer**

**Problem Description:**
Create a `UserService` class that handles logic for adding, retrieving, updating, and deleting users. Inject it into a controller.

**Constraints:**

* Use `@Service` and `@Autowired`.

**Starter Code:**

```java
@Service
class UserService {
    // TODO: implement user logic
}

@RestController
public class Day80 {
    @Autowired
    UserService userService;

    // TODO: map CRUD endpoints to service methods
}
```

**Test Cases:**

```
POST /user -> adds user
GET /users -> returns users
PUT /user/{id} -> updates user
DELETE /user/{id} -> deletes user
```

---


🔥 Awesome! Now we’re in the **final stretch: Days 81–100 (Projects & Capstones)**.
Here you’ll apply everything (Java, DSA, JDBC, Servlets, Spring Boot) to **real-world mini-projects**. Each day builds toward production-ready skills.

---

# **100 Days of Java Challenge – Part 5 (Days 81–100: Projects & Capstones)**

---

### **Day 81 – Console Project: Library Management System**

**Problem:**
Build a **Library System** in console Java.

* Add, search, and delete books.
* Each book: `id`, `title`, `author`.

**Starter Code:**

```java
class Book {
    int id;
    String title;
    String author;
    // TODO: constructor, toString()
}

public class Day81 {
    public static void main(String[] args) {
        // TODO: implement menu system for library
    }
}
```

**Test Cases:**

```
1. Add Book
2. Search Book
3. Delete Book
4. Exit
```

---

### **Day 82 – Console Project: Banking Application**

**Problem:**
Build a banking app with:

* Deposit, withdraw, check balance.
* Prevent overdraft.

**Starter Code:**

```java
class Account {
    int id;
    double balance;
    // TODO: methods deposit(), withdraw(), checkBalance()
}
```

**Test Cases:**

```
Deposit 1000 → Balance = 1000
Withdraw 500 → Balance = 500
```

---

### **Day 83 – Mini DSA Project: Student Marks Analyzer**

**Problem:**
Input marks of students, then compute:

* Average
* Highest
* Lowest

**Starter Code:**

```java
public class Day83 {
    public static void main(String[] args) {
        int[] marks = {78, 56, 89, 90, 45};
        // TODO: compute average, min, max
    }
}
```

**Test Cases:**

```
Average: 71.6
Highest: 90
Lowest: 45
```

---

### **Day 84 – JDBC Project: Simple To-Do List (Console)**

**Problem:**
Build a **To-Do List** stored in MySQL.

* Add task, list tasks, delete task.

**Starter Code:**

```java
import java.sql.*;

public class Day84 {
    public static void main(String[] args) {
        // TODO: implement JDBC-based To-Do List
    }
}
```

**Test Cases:**

```
Added: "Finish homework"
Tasks:
1. Finish homework
Deleted: 1
```

---

### **Day 85 – Servlet Project: Online Poll System**

**Problem:**
Create a servlet-based poll system.

* Question: "Which language do you prefer?"
* Options: Java, Python, C++
* Store and display votes.

**Starter Code:**

```java
public class Day85 extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // TODO: record vote
    }
}
```

**Test Cases:**

```
Vote submitted for Java
Results: Java=5, Python=3, C++=2
```

---

### **Day 86 – Spring Boot Project: RESTful To-Do API**

**Problem:**
Build a **To-Do REST API** with CRUD.

* Task: `id`, `title`, `done`.
* Endpoints: `/tasks`, `/tasks/{id}`.

**Starter Code:**

```java
@RestController
public class Day86 {
    @GetMapping("/tasks")
    public List<String> getTasks() {
        // TODO: return tasks
    }
}
```

**Test Cases:**

```
POST /tasks → add task
GET /tasks → list tasks
```

---

### **Day 87 – Spring Boot Project: User Authentication (Basic)**

**Problem:**
Implement a REST login API.

* `/register` → add user.
* `/login` → verify username & password.

**Starter Code:**

```java
@RestController
public class Day87 {
    @PostMapping("/register")
    public String register(@RequestBody String user) {
        // TODO: add user
    }
}
```

**Test Cases:**

```
POST /register { "username": "edward", "password": "1234" }
POST /login { "username": "edward", "password": "1234" }
```

---

### **Day 88 – Spring Boot Project: Notes API**

**Problem:**
Build a **Notes REST API**.

* Add, view, delete notes.
* Note: `id`, `title`, `content`.

**Starter Code:**

```java
@RestController
public class Day88 {
    @PostMapping("/note")
    public String addNote(@RequestBody String note) {
        // TODO: add note
    }
}
```

**Test Cases:**

```
POST /note { "title": "Shopping", "content": "Buy milk" }
GET /notes
```

---

### **Day 89 – Spring Boot Project: Blog API**

**Problem:**
Build a simple **Blog REST API**.

* CRUD blog posts: `id`, `title`, `content`.

**Starter Code:**

```java
@RestController
public class Day89 {
    @PostMapping("/post")
    public String addPost(@RequestBody String post) {
        // TODO
    }
}
```

**Test Cases:**

```
POST /post { "title": "My First Blog", "content": "Hello World!" }
GET /posts
```

---

### **Day 90 – Spring Boot Project: File Upload API**

**Problem:**
Implement `/upload` API to upload and save files locally.

**Starter Code:**

```java
@RestController
public class Day90 {
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        // TODO: save file
    }
}
```

**Test Cases:**

```
Upload file → returns "File uploaded: filename.txt"
```

---

### **Day 91 – Spring Boot Project: Chat API (REST)**

**Problem:**
Build a REST chat API.

* Endpoint `/message` → send message.
* Endpoint `/messages` → list all messages.

**Starter Code:**

```java
@RestController
public class Day91 {
    List<String> messages = new ArrayList<>();
}
```

**Test Cases:**

```
POST /message { "text": "Hello" }
GET /messages → ["Hello"]
```

---

### **Day 92 – Spring Boot Project: Weather API (Mock)**

**Problem:**
Create `/weather/{city}` endpoint that returns mock weather data.

**Starter Code:**

```java
@RestController
public class Day92 {
    @GetMapping("/weather/{city}")
    public String getWeather(@PathVariable String city) {
        // TODO: return mock data
    }
}
```

**Test Cases:**

```
GET /weather/Nairobi → "Nairobi: Sunny 28°C"
```

---

### **Day 93 – Spring Boot Project: Calculator API**

**Problem:**
Create endpoints for add, subtract, multiply, divide.

**Starter Code:**

```java
@RestController
public class Day93 {
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        // TODO
    }
}
```

**Test Cases:**

```
/add?a=5&b=3 → 8
```

---

### **Day 94 – Spring Boot Project: E-commerce Cart**

**Problem:**
Implement a cart API with:

* Add item
* View cart
* Remove item

**Starter Code:**

```java
@RestController
public class Day94 {
    List<String> cart = new ArrayList<>();
}
```

**Test Cases:**

```
POST /cart { "item": "Laptop" }
GET /cart → ["Laptop"]
```

---

### **Day 95 – Spring Boot Project: URL Shortener**

**Problem:**
Build a service to shorten URLs.

* `/shorten?url=...` → returns short code.
* `/s/{code}` → redirects.

**Starter Code:**

```java
@RestController
public class Day95 {
    Map<String, String> urlMap = new HashMap<>();
}
```

**Test Cases:**

```
/shorten?url=example.com → code=abc123
/s/abc123 → redirects to example.com
```

---

### **Day 96 – Spring Boot Project: Expense Tracker**

**Problem:**
Track expenses with fields: `id`, `category`, `amount`.

**Starter Code:**

```java
@RestController
public class Day96 {
    List<String> expenses = new ArrayList<>();
}
```

**Test Cases:**

```
POST /expense { "category": "Food", "amount": 500 }
GET /expenses
```

---

### **Day 97 – Spring Boot Project: Event Booking**

**Problem:**
Create an API for booking events.

* Event: `id`, `name`, `seats`.
* Book seat → reduce seat count.

**Starter Code:**

```java
@RestController
public class Day97 {
    // TODO: events list and booking method
}
```

**Test Cases:**

```
POST /book/1 → "Seat booked"
```

---

### **Day 98 – Spring Boot Project: Online Quiz API**

**Problem:**
Build a quiz API.

* `/questions` → returns list of questions.
* `/answer` → checks answer.

**Starter Code:**

```java
@RestController
public class Day98 {
    // TODO: quiz logic
}
```

**Test Cases:**

```
GET /questions
POST /answer { "id": 1, "answer": "A" }
```

---

### **Day 99 – Spring Boot Project: Inventory Management**

**Problem:**
Build API to manage products:

* Add, update, delete products.

**Starter Code:**

```java
@RestController
public class Day99 {
    List<String> inventory = new ArrayList<>();
}
```

**Test Cases:**

```
POST /product { "id": 1, "name": "Phone", "qty": 10 }
```

---

### **Day 100 – Final Capstone: Full Stack Java App**

**Problem:**
Build a **full-stack app** using **Spring Boot + JDBC + HTML/JS frontend**.

* User login system.
* CRUD notes/tasks.
* Database persistence.

**Starter Code:**

* Backend: Spring Boot + JDBC.
* Frontend: HTML + JS fetch API.

**Expected Features:**

```
User registers → logs in → adds tasks → views tasks → updates → deletes
Data stored in MySQL
```

---

✅ Congratulations 🎉 — after **Day 100**, you’ll have:

* Mastered **Java fundamentals, OOP, DSA, JDBC, Servlets, Spring Boot**.
* Built **20+ mini-projects** + 1 **capstone full-stack app**.
* A **portfolio** ready for jobs & internships.

---

