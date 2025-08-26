package Demo2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Demo1.Movie;

public class Program {

	public static void main(String[] args) {
		WriteData();
		//readData();
	}
	public static void readData()
	{
		List<Movie> list=new ArrayList<Movie>();
		try(FileInputStream fin=new FileInputStream("Movies.db")){
			try(ObjectInputStream oin=new ObjectInputStream(fin)){
				while(true)
				{
					Movie m=new Movie();
					m.setId(oin.readInt());
					m.setTitle(oin.readUTF());
					m.setRating(oin.readDouble());
					list.add(m);
				}
			}
		}
		catch(Exception e)
		{
			//DO-NOTHING
		}
		System.out.println("Movies list");
		list.forEach(e->System.out.println(e));
	}
	public static void WriteData()
	{
		List<Movie> list=new ArrayList<Movie>();
		list.add(new Movie(1, "Star Wars", 7.5));
		list.add(new Movie(2, "Godfather", 8.0));
		list.add(new Movie(3, "Hidden Figures", 7.0));
		list.add(new Movie(4, "Bruce Almighty", 6.5));
		list.add(new Movie(5, "Forest Gump", 8.5));
		try(FileOutputStream fout=new FileOutputStream("Movies.db")){
			try(ObjectOutputStream oout=new ObjectOutputStream(fout)){
				oout.writeObject(list);
			}
			System.out.println("Movie saved");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
