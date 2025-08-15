package Demo5.dkte;
import java.util.*;
import java.util.Map.Entry;
public class MapDemo{

	public static void main(String[] args) {
		//Map<Integer,String> map = new HashMap<Integer, String>( );
		//Map<Integer,String> map = new LinkedHashMap<Integer, String>( );
		//Map<Integer,String> map = new TreeMap<Integer, String>( );
		Map<Integer,String> map = new Hashtable<Integer, String>( );
		map.put(415110, "Karad - Satara"); // returns -- null
		map.put(411052, "Hinjawadi - Pune"); // returns -- null
		map.put(411046, "Katraj - Pune"); // returns -- null
		map.put(400027, "Byculla - Mumbai"); // returns -- null
		map.put(411002, "Bajirao Rd - Pune"); // returns -- null
		map.put(411037, "Marketyard - Pune"); // returns -- null
		map.put(411007, "Aundh - Pune"); // returns -- null
		map.put(411052, "HINJEWADI - Pune"); // when key is duplicate, value is overwritten
	
		//System.out.println("size : "+map.size());
		
		//Scanner sc = new Scanner(System.in); 
		
		//System.out.println("Enter the pin : ");
		//int pin = sc.nextInt(); 
		
		//String area = map.get(pin);
		//String area = map.getOrDefault(pin, "Not avail"); 
		//System.out.println("Area : "+area);		
		
		Set<Integer> keys = map.keySet(); 
//		for(Integer key : keys)
//			System.out.println(key);
		
		Collection<String> vals = map.values(); 
//		for(String v : vals) {
//			System.out.println(v);
//		}
		
		Set<Entry<Integer, String>> keyVals = map.entrySet(); 
		for (Entry<Integer, String> en : keyVals) {
			System.out.println(en.getKey() + "---" + en.getValue());
		}
	}
	}







	


