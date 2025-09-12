package clg.dkte;
import java.util.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Program2 {

	public static void main(String[] args) {
		//writeData();
		readData();
	}
	public static void readData()
	{
		//List<Vehicle> list =new ArrayList<Vehicle>();
		List<Vehicle> list =new LinkedList<Vehicle>();
		try(FileInputStream fin=new FileInputStream("Vehicles2.db")){
			try(DataInputStream din=new DataInputStream(fin)){
				while(true)
				{
					Vehicle v=new Vehicle();
					v.setVehicleId(din.readInt());
					v.setModel(din.readUTF());
					v.setType(din.readUTF());
					v.setPrice(din.readDouble());
					list.add(v);
					
				}
			}
		}
		catch(Exception e)
		{
			
		}
		class priceComparator implements Comparator<Vehicle>
		{

			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				int diff=-Double.compare(o1.getPrice(),o2.getPrice());
				return diff;
			}
			
		}
		Collections.sort(list,new priceComparator());
		//list.sort(new priceComparator());
		list.forEach(e->System.out.println(e));
	}
	public static void writeData()
	{
		List<Vehicle> list=new ArrayList<Vehicle>();
		list.add(new Vehicle(1,"Model 1","toyota",250000));
		list.add(new Vehicle(2,"Model 2","hero",50000));
		list.add(new Vehicle(3,"Model 3","tata",0));
		list.add(new Vehicle(4,"Model 4","xyz",30000));
		list.add(new Vehicle(5,"Model 5","ABC",0));
		
		try(FileOutputStream fout=new FileOutputStream("Vehicles2.db")){
			try(DataOutputStream dout=new DataOutputStream(fout))
			{
				for(Vehicle v:list)
				{
					if(v.getPrice()>0)
					{
						dout.writeInt(v.getVehicleId());
						dout.writeUTF(v.getModel());
						dout.writeUTF(v.getType());
						dout.writeDouble(v.getPrice());
						
					}
				}
			}
			System.out.println("vehicle Saved..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}