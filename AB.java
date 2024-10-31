
class Pen {

    String color;  // color of the pen
    String type;   // type of the pen (e.g., ballpoint, gel)

    // Method to print the pen's color and type
    public void printpencolor() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student {

    String name;
    int age;
// Default constructor for Student class
//Defining constructor because 

    Student() {
        // Initializes the Student object with default values (optional)
    }

    // Method to print the student's name and age
    public void printInfo() {
        System.out.println("name of 1st student is " + this.name + " and age is " + this.age);
        // or
        // System.out.println(this.name);
        // System.out.println(this.age);

    }

    // Method to print the student's name and age
    public void printInff() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Parameterized constructor for initializing student details
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor to create a new Student object with same name and age as another Student object
    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }
}

public class AB {

    // Main method: entry point of the program
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "ballpoint";

        // Printing details of each pen
        pen1.printpencolor();
        pen2.printpencolor();

        // Creating Student objects
        Student student1 = new Student();
        student1.name = "Abdullah";
        student1.age = 18;

        Student student2 = new Student("Sherry", 25);  // Using parameterized constructor

        Student student3 = new Student(student1);

        student1.printInfo();
        student2.printInff();
        student3.printInff();

    }
}
