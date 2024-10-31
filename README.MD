# Pen and Student Classes in Java

This Java project demonstrates basic class design, including the use of constructors, methods, and the concept of a copy constructor.

## Project Structure

The program consists of three classes:

1. **Pen**: Represents a pen with attributes for color and type (e.g., gel, ballpoint) and a method to print these details.
2. **Student**: Represents a student with attributes for name and age, a default constructor, a parameterized constructor, and a copy constructor.
3. **AB**: The main class containing the `main` method, which serves as the entry point of the program. It creates objects for both `Pen` and `Student` and demonstrates various functionalities.

## Classes and Methods

### Pen Class

- **Attributes**:
  - `String color`: Color of the pen.
  - `String type`: Type of the pen (e.g., ballpoint, gel).

- **Method**:
  - `printpencolor()`: Prints the pen’s color and type.

### Student Class

- **Attributes**:
  - `String name`: Name of the student.
  - `int age`: Age of the student.

- **Constructors**:
  - `Student()`: Default constructor.
  - `Student(String name, int age)`: Parameterized constructor that initializes `name` and `age`.
  - `Student(Student student)`: Copy constructor that creates a new `Student` object with the same `name` and `age` as the provided `student` object.

- **Methods**:
  - `printInfo()`: Prints the student's name and age with a custom message.
  - `printInff()`: Prints the student's name and age without additional text.

### Main Class (AB)

- The `main` method in the `AB` class demonstrates:
  - Creating `Pen` objects and setting their attributes.
  - Printing `Pen` details.
  - Creating `Student` objects using the default, parameterized, and copy constructors.
  - Printing `Student` details.

## Usage

To run the program:

1. Compile all Java files.
2. Run the `AB` class.

```bash
javac AB.java
java AB
blue
gel
red
ballpoint
name of 1st student is Abdullah and age is 18
Sherry
25
Abdullah
18
