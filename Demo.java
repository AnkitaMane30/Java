//Upcasting and downcasting
package clg.dkte;
class Person{
	String name;
	int age;
	public Person() {
		
}
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void printRecord()
	{
		System.out.println("name:"+this.name);
		System.out.println("Age:"+this.age);
	}
}
class Employee extends Person{
	//private String name;
	//private int age;
	int id;
	double salary;
	public Employee() {

	}
	public Employee(String name,int age,int id,double salary)
	{
		super(name,age);
		this.id=id;
		this.salary=salary;
	}
	public void showRecord()
	{
		printRecord();
		System.out.println("Id:"+this.id);
		System.out.println("Salary:"+this.salary);

	}
}
public class Demo {

	public static void main(String[] args) {
		Person p = new Employee("Ketan", 31, 1, 1000.00); // Upcasting 
		System.out.println(p.name); // OK 
		System.out.println(p.age);// OK 
		//System.out.println(p.empid);
		//System.out.println(p.salary);
		Employee emp = (Employee) p; // downcasting 
		System.out.println(emp.name);
		System.out.println(emp.id);
		System.out.println(emp.age);
		System.out.println(emp.salary);
		
	}

}
