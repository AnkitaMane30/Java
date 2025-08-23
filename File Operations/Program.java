package Demo7.dkte;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the srcPath : ");
		String srcPath = sc.next(); 
		
		File file = new File(srcPath); 
		boolean success = file.mkdir(); 
		System.out.println("Directory Created : "+success);
	}
	public static void main2(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the srcPath : ");
		String srcPath = sc.next(); 
		
		File file = new File(srcPath); 
		boolean success = file.createNewFile();  
		System.out.println("File Created : "+success);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the srcPath : ");
		String srcPath = sc.next(); 
		
		File file = new File(srcPath); 
		boolean success = file.delete();   
		System.out.println("Deleted : "+success);
	}

}
