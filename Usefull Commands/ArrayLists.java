
# Important Java ArrayList Methods

This file contains a list of essential Java `ArrayList` methods along with brief explanations for each, useful for quick reference.

## 1. `add(E element)`
- **Description**: Adds the specified element to the end of the `ArrayList`.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("Hello");
  ```

## 2. `add(int index, E element)`
- **Description**: Inserts the specified element at the specified position in the `ArrayList`.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("Hello");
  list.add(0, "Hi"); // "Hi" is inserted at index 0.
  ```

## 3. `get(int index)`
- **Description**: Returns the element at the specified position in the list.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("Hello");
  String element = list.get(0); // "Hello"
  ```

## 4. `set(int index, E element)`
- **Description**: Replaces the element at the specified position with the specified element.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("Hello");
  list.set(0, "Hi"); // Replaces "Hello" with "Hi"
  ```

## 5. `remove(int index)`
- **Description**: Removes the element at the specified position in the list.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("Hello");
  list.remove(0); // Removes "Hello"
  ```

## 6. `remove(Object o)`
- **Description**: Removes the first occurrence of the specified element from the list.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("Hello");
  list.remove("Hello"); // Removes "Hello" from the list
  ```

## 7. `size()`
- **Description**: Returns the number of elements in the `ArrayList`.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  int size = list.size(); // Returns 0
  ```

## 8. `clear()`
- **Description**: Removes all elements from the list.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("Hello");
  list.clear(); // List is now empty
  ```

## 9. `isEmpty()`
- **Description**: Checks if the `ArrayList` is empty.
- **Returns**: `true` if the list contains no elements, otherwise `false`.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  boolean isEmpty = list.isEmpty(); // true
  ```

## 10. `contains(Object o)`
- **Description**: Checks if the list contains the specified element.
- **Returns**: `true` if the list contains the element, otherwise `false`.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("Hello");
  boolean contains = list.contains("Hello"); // true
  ```

## 11. `indexOf(Object o)`
- **Description**: Returns the index of the first occurrence of the specified element in the list, or `-1` if it is not present.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("Hello");
  int index = list.indexOf("Hello"); // 0
  ```

## 12. `lastIndexOf(Object o)`
- **Description**: Returns the index of the last occurrence of the specified element in the list, or `-1` if it is not present.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("Hello");
  list.add("World");
  int index = list.lastIndexOf("Hello"); // 0
  ```

## 13. `toArray()`
- **Description**: Converts the `ArrayList` into a regular array.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("Hello");
  Object[] array = list.toArray(); // Converts to an array
  ```

Feel free to copy this file into your GitHub repository for a quick reference to commonly used Java `ArrayList` methods.
