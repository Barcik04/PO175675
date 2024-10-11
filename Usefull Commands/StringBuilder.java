
# Important Java StringBuilder Methods

This file contains a list of essential Java `StringBuilder` methods along with brief explanations for each, useful for quick reference.

## 1. `append(String str)`
- **Description**: Appends the specified string to the end of the `StringBuilder`.
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder();
  sb.append("Hello");
  sb.append(" World");
  // Result: "Hello World"
  ```

## 2. `insert(int offset, String str)`
- **Description**: Inserts the specified string at the given offset.
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder("Hello World");
  sb.insert(5, ",");
  // Result: "Hello, World"
  ```

## 3. `delete(int start, int end)`
- **Description**: Removes characters from the `StringBuilder` from `start` (inclusive) to `end` (exclusive).
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder("Hello World");
  sb.delete(5, 6);
  // Result: "HelloWorld"
  ```

## 4. `deleteCharAt(int index)`
- **Description**: Removes the character at the specified index.
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder("Hello World");
  sb.deleteCharAt(5);
  // Result: "HelloWorld"
  ```

## 5. `replace(int start, int end, String str)`
- **Description**: Replaces the characters in a substring of this sequence with the specified string.
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder("Hello World");
  sb.replace(6, 11, "Java");
  // Result: "Hello Java"
  ```

## 6. `reverse()`
- **Description**: Reverses the character sequence in the `StringBuilder`.
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder("Hello");
  sb.reverse();
  // Result: "olleH"
  ```

## 7. `toString()`
- **Description**: Converts the `StringBuilder` to a `String`.
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder("Hello World");
  String result = sb.toString();
  ```

## 8. `charAt(int index)`
- **Description**: Returns the character at the specified index.
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder("Hello");
  char c = sb.charAt(1); // 'e'
  ```

## 9. `length()`
- **Description**: Returns the length (number of characters) in the `StringBuilder`.
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder("Hello");
  int length = sb.length(); // 5
  ```

## 10. `setCharAt(int index, char ch)`
- **Description**: Sets the character at the specified index to `ch`.
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder("Hello");
  sb.setCharAt(1, 'a');
  // Result: "Hallo"
  ```

## 11. `substring(int start)` and `substring(int start, int end)`
- **Description**: Returns a new `String` that is a substring of this sequence from `start` to `end` (exclusive).
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder("Hello World");
  String sub = sb.substring(6); // "World"
  String sub2 = sb.substring(0, 5); // "Hello"
  ```

## 12. `capacity()`
- **Description**: Returns the current capacity of the `StringBuilder`.
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder();
  int capacity = sb.capacity(); // Default is 16
  ```

## 13. `ensureCapacity(int minimumCapacity)`
- **Description**: Ensures that the capacity is at least equal to the specified minimum.
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder();
  sb.ensureCapacity(50);
  ```

## 14. `trimToSize()`
- **Description**: Attempts to reduce storage used for the character sequence.
- **Example**:
  ```java
  StringBuilder sb = new StringBuilder("Hello");
  sb.trimToSize();
  ```

Feel free to copy this file into your GitHub repository for a quick reference to commonly used Java `StringBuilder` methods.
