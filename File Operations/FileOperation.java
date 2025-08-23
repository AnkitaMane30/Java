package Demo6.dkte;
import java.util.*;
import java.io.File;
public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file path:");
		String path=sc.next();
		File file=new File(path);
		if(!file.exists())
		{
			System.out.println("File Not Exits");
			System.exit(0);
		}
		if(file.isDirectory())
		{
			String[] listing=file.list();
			for(String lst:listing)
			{
				System.out.println(lst);
			}
		}
		else if(file.isFile()) {
			System.out.println("Name : "+file.getName());
			System.out.println("Parent : "+file.getParent());
			System.out.println("File Permissions : ");
			
			if(file.canRead())
				System.out.println("Readable");
			if(file.canWrite())
				System.out.println("Writable");
			if(file.canExecute())
				System.out.println("Execute");
			
			long lastModified = file.lastModified(); 
			System.out.println("Last Modified : "+ new Date(lastModified));
		}
		else 
			System.out.println("Niether a file nor a directory");

	}

}
