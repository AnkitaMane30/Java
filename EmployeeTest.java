package Experiment3;

import java.util.Scanner;

class Employee{
	private String firstName;
    private String lastName;
    private double monthlySalary;

    
    public Employee(String fName, String lName, double mSalary) {
        firstName = fName;
        lastName = lName;
        if (mSalary > 0)
            monthlySalary = mSalary;
        else
            monthlySalary = 0.0;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setMonthlySalary(double mSalary) {
        if (mSalary > 0)
            monthlySalary = mSalary;
        else
            monthlySalary = 0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
    public double getYearlySalary() {
        return monthlySalary * 12;
    }
    public void giveRaise(double percent) {
        monthlySalary = monthlySalary * (1 + percent / 100.0);
    }

}
public class EmployeeTest {
		public static void main(String [] args)
		{
			Employee emp1 = new Employee("Ankita", "Mane", 3000);
	        Employee emp2 = new Employee("vaishnavi", "vibhute", 4000);

	        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
	                " yearly salary: $" + emp1.getYearlySalary());

	        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
	                " yearly salary: $" + emp2.getYearlySalary());

	        emp1.giveRaise(10);
	        emp2.giveRaise(10);

	        System.out.println("\nAfter 10% raise:");

	        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
	                " yearly salary: $" + emp1.getYearlySalary());

	        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
	                " yearly salary: $" + emp2.getYearlySalary());
			
		}
	
}

