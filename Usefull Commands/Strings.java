
# Important Java String Methods

This file contains a list of essential Java String methods along with brief explanations for each, useful for quick reference.

## 1. `contains(String str)`
- **Description**: Checks if a string contains a specified substring.
- **Returns**: `true` if `str` is found in the string, otherwise `false`.
- **Example**: 
  ```java
  String s = "Hello world";
  boolean result = s.contains("world"); // true
  ```

## 2. `startsWith(String prefix)`
- **Description**: Checks if a string starts with the specified prefix.
- **Returns**: `true` if the string starts with `prefix`, otherwise `false`.
- **Example**:
  ```java
  String s = "Hello world";
  boolean result = s.startsWith("Hello"); // true
  ```

## 3. `endsWith(String suffix)`
- **Description**: Checks if a string ends with the specified suffix.
- **Returns**: `true` if the string ends with `suffix`, otherwise `false`.
- **Example**:
  ```java
  String s = "Hello world";
  boolean result = s.endsWith("world"); // true
  ```

## 4. `equals(String anotherString)`
- **Description**: Compares two strings for equality based on their content.
- **Returns**: `true` if the strings are the same, otherwise `false`.
- **Example**:
  ```java
  String s1 = "Hello";
  String s2 = "Hello";
  boolean result = s1.equals(s2); // true
  ```

## 5. `equalsIgnoreCase(String anotherString)`
- **Description**: Compares two strings for equality, ignoring case differences.
- **Returns**: `true` if the strings are the same ignoring case, otherwise `false`.
- **Example**:
  ```java
  String s1 = "hello";
  String s2 = "Hello";
  boolean result = s1.equalsIgnoreCase(s2); // true
  ```

## 6. `charAt(int index)`
- **Description**: Returns the character at the specified index.
- **Note**: Indexing starts from `0`.
- **Example**:
  ```java
  String s = "Hello";
  char result = s.charAt(1); // 'e'
  ```

## 7. `length()`
- **Description**: Returns the length of the string (number of characters).
- **Example**:
  ```java
  String s = "Hello";
  int length = s.length(); // 5
  ```

## 8. `substring(int beginIndex)` and `substring(int beginIndex, int endIndex)`
- **Description**: Returns a substring from `beginIndex` to the end of the string or from `beginIndex` to `endIndex` (exclusive).
- **Example**:
  ```java
  String s = "Hello world";
  String result1 = s.substring(6); // "world"
  String result2 = s.substring(0, 5); // "Hello"
  ```

## 9. `toLowerCase()` and `toUpperCase()`
- **Description**: Converts all characters in the string to lowercase or uppercase.
- **Example**:
  ```java
  String s = "Hello World";
  String lower = s.toLowerCase(); // "hello world"
  String upper = s.toUpperCase(); // "HELLO WORLD"
  ```

## 10. `trim()`
- **Description**: Removes leading and trailing whitespace from the string.
- **Example**:
  ```java
  String s = "   Hello World   ";
  String trimmed = s.trim(); // "Hello World"
  ```

## 11. `replace(char oldChar, char newChar)` and `replaceAll(String regex, String replacement)`
- **Description**: Replaces all occurrences of `oldChar` with `newChar` or matches of `regex` with `replacement`.
- **Example**:
  ```java
  String s = "Hello World";
  String replaced = s.replace('o', '0'); // "Hell0 W0rld"
  String replacedAll = s.replaceAll("World", "Java"); // "Hello Java"
  ```

## 12. `indexOf(String str)` and `lastIndexOf(String str)`
- **Description**: Returns the index of the first or last occurrence of `str` in the string. Returns `-1` if not found.
- **Example**:
  ```java
  String s = "Hello world";
  int index1 = s.indexOf("o"); // 4
  int index2 = s.lastIndexOf("o"); // 7
  ```

## 13. `split(String regex)`
- **Description**: Splits the string into an array of substrings based on the specified regular expression.
- **Example**:
  ```java
  String s = "one,two,three";
  String[] parts = s.split(","); // ["one", "two", "three"]
  ```

## 14. `isEmpty()`
- **Description**: Checks if the string is empty (length is `0`).
- **Returns**: `true` if the string is empty, otherwise `false`.
- **Example**:
  ```java
  String s = "";
  boolean result = s.isEmpty(); // true
  ```

## 15. `compareTo(String anotherString)`
- **Description**: Compares two strings lexicographically.
- **Returns**: `0` if the strings are equal, a negative number if the current string is lexicographically less, or a positive number if it is greater.
- **Example**:
  ```java
  String s1 = "apple";
  String s2 = "banana";
  int result = s1.compareTo(s2); // Negative value because "apple" < "banana"
  ```


