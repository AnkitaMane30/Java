import java.util.*;
class Employee
{
	private String name;
	private int age;
	private double salary;
	public Employee()
	{
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
}
class TestEmployee{
	Employee em=new Employee();
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name:");
		em.setName(sc.nextLine());
		
		System.out.println("Enter age:");
		em.setAge(sc.nextInt());
		
		System.out.println("Enter Salary:");
		em.setSalary(sc.nextDouble());

	}
	public void printRecord()
	{
		System.out.println("Name:"+em.getName());
		System.out.println("Age:"+em.getAge());
		System.out.println("salary:"+em.getSalary());
	}
}
public class OOPClassWithGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEmployee test=new TestEmployee();
		test.acceptRecord();
		test.printRecord();
	}

}
