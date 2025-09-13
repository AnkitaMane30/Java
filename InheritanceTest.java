package Experiment5;

import java.time.LocalDate;
import java.time.Period;

class Person {
    protected String name;
    protected LocalDate birthDate;
    protected double height;
    protected double weight;
    protected String address;

    public Person(String name, LocalDate birthDate, double height, double weight, String address) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    public int calculateAge() {
        LocalDate today = LocalDate.now();
        return Period.between(birthDate, today).getYears();
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birthdate: " + birthDate);
        System.out.println("Age: " + calculateAge());
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Address: " + address);
    }
}

// Derived Class Student
class Student extends Person {
    private int rollNo;
    private double[] marks;

    public Student(String name, LocalDate birthDate, double height, double weight, String address,
                   int rollNo, double[] marks) {
        super(name, birthDate, height, weight, address);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public double calculateAvg() {
        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.length;
    }

    public void displayStudentInfo() {
        displayPersonInfo(); // calling base class method
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average Marks: " + calculateAvg());
    }
}

// Derived Class Employee
class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, LocalDate birthDate, double height, double weight, String address,
                    int empId, double salary) {
        super(name, birthDate, height, weight, address);
        this.empId = empId;
        this.salary = salary;
    }

    public double calculateTax() {
        if (salary > 50000)
            return salary * 0.10;
        else
            return 0.0;
    }

    public void displayEmployeeInfo() {
        displayPersonInfo(); 
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + calculateTax());
    }
}
public class InheritanceTest {
	public static void main(String[] args) {
        
        double[] marks = {85, 90, 78, 88, 92};
        Student student = new Student("Ankita", LocalDate.of(2005, 8, 30),
                165, 55, "Sangli", 101, marks);
        
        Employee employee = new Employee("vaishnavi", LocalDate.of(2005, 10, 12),
                175, 70, "Mumbai", 201, 60000);

        System.out.println("---- Student Details ----");
        student.displayStudentInfo();

        System.out.println("\n---- Employee Details ----");
        employee.displayEmployeeInfo();
    }
}
