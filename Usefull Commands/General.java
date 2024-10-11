
# General Useful Java Commands

This file contains a list of general Java commands and methods that are frequently useful during Java development.

## 1. `System.out.println()`
- **Description**: Prints a message to the standard output (console) followed by a newline.
- **Example**:
  ```java
  System.out.println("Hello, World!");
  ```

## 2. `System.out.print()`
- **Description**: Prints a message to the standard output (console) without a newline.
- **Example**:
  ```java
  System.out.print("Hello, ");
  System.out.print("World!");
  ```

## 3. `Math.max(int a, int b)` and `Math.min(int a, int b)`
- **Description**: Returns the maximum or minimum of two values.
- **Example**:
  ```java
  int max = Math.max(5, 10); // 10
  int min = Math.min(5, 10); // 5
  ```

## 4. `Math.sqrt(double a)`
- **Description**: Returns the square root of a number.
- **Example**:
  ```java
  double result = Math.sqrt(25); // 5.0
  ```

## 5. `Math.pow(double a, double b)`
- **Description**: Returns `a` raised to the power of `b`.
- **Example**:
  ```java
  double result = Math.pow(2, 3); // 8.0
  ```

## 6. `String.valueOf(int i)`
- **Description**: Converts a given primitive type (e.g., `int`) to a `String`.
- **Example**:
  ```java
  int number = 10;
  String str = String.valueOf(number); // "10"
  ```

## 7. `Integer.parseInt(String s)`
- **Description**: Converts a `String` into an `int`.
- **Example**:
  ```java
  String str = "123";
  int number = Integer.parseInt(str); // 123
  ```

## 8. `Double.parseDouble(String s)`
- **Description**: Converts a `String` into a `double`.
- **Example**:
  ```java
  String str = "123.45";
  double number = Double.parseDouble(str); // 123.45
  ```

## 9. `Arrays.sort(int[] array)`
- **Description**: Sorts an array in ascending order.
- **Example**:
  ```java
  int[] numbers = {3, 1, 4, 1, 5};
  Arrays.sort(numbers); // [1, 1, 3, 4, 5]
  ```

## 10. `for` loop
- **Description**: A control flow statement for iterating over a range of values.
- **Example**:
  ```java
  for (int i = 0; i < 5; i++) {
      System.out.println(i);
  }
  ```

## 11. `while` loop
- **Description**: A control flow statement that repeats as long as a condition is `true`.
- **Example**:
  ```java
  int i = 0;
  while (i < 5) {
      System.out.println(i);
      i++;
  }
  ```

## 12. `try-catch` block
- **Description**: Used for handling exceptions and errors during program execution.
- **Example**:
  ```java
  try {
      int result = 10 / 0;
  } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero.");
  }
  ```

## 13. `if-else` statement
- **Description**: A conditional statement that executes code blocks based on a boolean condition.
- **Example**:
  ```java
  int number = 5;
  if (number > 0) {
      System.out.println("Positive number");
  } else {
      System.out.println("Negative number");
  }
  ```

Feel free to copy this file into your GitHub repository for a quick reference to general Java commands and methods.
