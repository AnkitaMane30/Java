package Demo5;

import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		int data;
		try(FileReader fout =new FileReader("text1.txt.txt")){
			while((data=fout.read())!=-1)
			{
				//System.out.print("inside if");
				System.out.print((char)data);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
