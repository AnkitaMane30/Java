package Demo3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		writeData();
		readData();
	}
	public static void readData()
	{
		List<Movie> list=new ArrayList<Movie>();
		try(FileInputStream fin=new FileInputStream("Movies.db")){
		try(BufferedInputStream bin=new BufferedInputStream(fin))
		{try(DataInputStream din=new DataInputStream(bin))
			{while(true) {
				Movie m=new Movie();
				m.setId(din.readInt());
				m.setTitle(din.readUTF());
				m.setRating(din.readDouble());
				list.add(m);
			}
			}
		}
		} catch (Exception e) {
			//e.printStackTrace();
		} 
		list.forEach(e->System.out.println(e));
	}
	public static void writeData()
	{
		List<Movie> list=new ArrayList<Movie>();
		list.add(new Movie(1, "Star Wars", 7.5));
		list.add(new Movie(2, "Godfather", 8.0));
		list.add(new Movie(3, "Hidden Figures", 7.0));
		list.add(new Movie(4, "Bruce Almighty", 6.5));
		list.add(new Movie(5, "Forest Gump", 8.5));
		
		try(FileOutputStream fout=new FileOutputStream("Movies.db"))
		{	try(BufferedOutputStream bout=new BufferedOutputStream(fout) )
			{
			try(DataOutputStream dout=new DataOutputStream(bout))
			{
				for(Movie m:list)
				{
					dout.writeInt(m.getId());
					dout.writeUTF(m.getTitle());
					dout.writeDouble(m.getRating());
				}
				
			}
			}
			System.out.println("Movies saved");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
