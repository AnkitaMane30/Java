package Demo3;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		 Employee[] arr = new Employee[] {
			        new Employee(4, "B", "Clerk", "Sales", 723.44),
			        new Employee(8, "X", "Manager", "Accounts", 823.23),
			        new Employee(2, "P", "Clerk", "Research", 234.23),
			        new Employee(9, "N", "Manger", "Sales", 252.53),
			        new Employee(5, "D", "Clerk", "Accounts", 923.23),
			        new Employee(1, "Q", "Analyst", "Research", 826.23),
			        new Employee(7, "H", "Clerk", "Research", 845.24),
			        new Employee(6, "A", "Analyst", "Research", 832.23),
			        new Employee(3, "G", "Analyst", "Sales", 952.44)
			    };
		 class IdComparator implements Comparator<Employee>
		 {

			@Override
			public int compare(Employee x, Employee y) {
				int diff=Integer.compare(x.getId(),y.getId());
				return diff;
			}
			 
		 }
		 Arrays.sort(arr,new IdComparator());
		 System.out.println("sort By Id");
		 for(Employee emp:arr)
		 {
			 System.out.println(emp);
		 }
		 System.out.println("Sort By Name:");//Anonymous Inner class
		 Comparator<Employee> empNamecomparator=new Comparator<Employee>()
		 {
			@Override
			public int compare(Employee x, Employee y) {
				int diff=x.getName().compareTo(y.getName());
				return diff;
			}	 
		 };
		 Arrays.sort(arr,empNamecomparator);//Anonymous Inner class and Anonymous object
		 for(Employee emp:arr)
		 {
			 System.out.println(emp);
		 }
		 System.out.println("sort by job:");
		 Arrays.sort(arr,new Comparator<Employee>()
				 {
					@Override
					public int compare(Employee x, Employee y) {
						int diff=x.getJob().compareTo(y.getJob());
						return diff;
					}
			 
				 });
		 for(Employee emp:arr)
		 {
			 System.out.println(emp);
		 }
		 System.out.println("Employee sort By job desc:");
		 Arrays.sort(arr,(Employee x, Employee y) -> {
				int diff = -x.getJob().compareTo(y.getJob()); 
				return diff; 
			});
		 for(Employee emp:arr)
		 {
			 System.out.println(emp);
		 }
		 System.out.println("NAme desc"); //type Inferance
		 Arrays.sort(arr,( x, y) ->
		 {
			 int diff=-x.getName().compareTo(y.getName());
			 return diff;
		 });
		 for(Employee emp:arr)
		 {
			 System.out.println(emp);
		 }
		 
		 System.out.println("salary Ascending:");
		 Arrays.sort(arr,(x,y) ->{
			 return Double.compare(x.getSal(), y.getSal());
		 });
		 for(Employee emp:arr)
		 {
			 System.out.println(emp);
		 }
		 
		 System.out.println("Salary desc:");
		 Arrays.sort(arr,(x,y) -> -Double.compare(x.getSal(), y.getSal()));
		 for(Employee emp:arr)
		 {
			 System.out.println(emp);
		 }
		 System.out.println("Array As List:");
		 List<Employee> list=Arrays.asList(arr);
		 list.sort((x,y)->Integer.compare(x.getId(),y.getId()));
		 list.forEach(e-> System.out.println(e) );
	}

}
