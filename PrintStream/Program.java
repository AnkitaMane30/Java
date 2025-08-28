package Demo4;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(1, "Star Wars", 7.5));
		list.add(new Movie(2, "Godfather", 8.0));
		list.add(new Movie(3, "Hidden Figures", 7.0));
		list.add(new Movie(4, "Bruce Almighty", 6.5));
		list.add(new Movie(5, "Forest Gump", 8.5));
		try(FileOutputStream fout=new FileOutputStream("Movies.db")){
			try(PrintStream out=new PrintStream(fout))
			{
				for(Movie m:list)
				{
					out.printf("%-50d %-50s %-50.2f",m.getId(),m.getTitle(),m.getRating());
				}
			}
			System.out.println("Movie Saved..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	

}
