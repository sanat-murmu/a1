// 1. Write a single program to show Multilevel Inheritance, Function Overloading, Constructor Overloading
// Function Overriding, Constructor Chaining, Compile time polymorphism, and Run time polymorphism.

// 2. Write a Java program to create a class Employee with attributes such as name, age, and employeelD.
// Create two subclasses, Manager and Engineer.
// The Manager class should have additional attributes like department and numberOfEmployees.
// The Engineer class should have additional attributes like specialization and yearsOfExperience.
// Ensure that employeeID is automatically generated and unique for every employee.
// Write a program that creates a manager and an engineer, displays their details,
// and includes methods to calculate the bonus based on their roles, such as a fixed percentage of their base salary.

// 3. Create a Java program to model a hierarchy of vehicles using inheritance.
// Create a base class Vehicle with attributes like brand, model, and year.
// Create two subclasses: Car: Add attributes such as number of doors and fuel type. 
// Bike: Add attributes such as type of bike (e.g., sports, cruiser) and engine capacity. 
// Each subclass should have its own constructor to initialize all the attributes, including those inherited from the base class. 
// Implement a method in the Vehicle class called displayinfo() that prints all the vehicle details.
// Override this method in both subclasses to include their specific details. Write a main() method to Create objects of Car and Bike. \
// Display their further information using the displayInfo() method.

// 4. Write a Java program to demonstrate constructor chaining.
// Create a class Person with three constructors.
// The first constructor takes no arguments and initializes the name as "Unknown" and age as 0.
// The second constructor takes only the name as an argument and initializes the age as 0.
// The third constructor takes both name and age as arguments and initializes them.
// Use constructor chaining to call one constructor from another.
// Create objects using all three constructors and display the initialized values.

class Person {
    String name;
    int age;
    Person() {
        name = "unknown";
        age = 0;
    }

    Person(String a) {
        this();
        name = a;
    }

    Person(String a, int b) {
        this(a);
        age = b;
    }

    void Show() {
        System.out.println("Name: " + name + "\nAge: " + age + "\n");
    }
}


public class program4 {
    public static void main(String[] args) {
        Person m1 = new Person();
        m1.Show();

        Person m2 = new Person("John");
        m2.Show();

        Person m3 = new Person("Scott", 30);
        m3.Show();
    }
}
