package Demo8.dkte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileIOProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the srcPath : ");
		String srcPath = sc.next();
		
		System.out.println("Enter the destPath : ");
		String destPath = sc.next();
		int data; 
		try(FileInputStream fin = new FileInputStream(srcPath)){
			try(FileOutputStream fout = new FileOutputStream(destPath)){
				while((data = fin.read())!=-1) {
					fout.write(data);
				}
			}//fout.close(); 
			System.out.println("File copied..");
		}//fin.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
