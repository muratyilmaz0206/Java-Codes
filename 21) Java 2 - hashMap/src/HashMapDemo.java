import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapDemo {

	
	public static void main(String[] args){
		
		HashMap< String, Float > hm = new HashMap< String, Float >();
		
		hm.put("Zara",new Float(1520.5));
		hm.put("Lara",new Float(2220.5));
		hm.put("Daisy",new Float(1820.15));
		hm.put("Mehmet",new Float(2520.3));
		
		Set  set = hm.entrySet();
		
		Iterator i = set.iterator();
		
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + ":" +me.getValue());
		}
		
		hm.remove("Daisy");
		
		System.out.println("\n\n After Daisy Removed \n");

		Set  set2 = hm.entrySet();
		
		Iterator i2 = set.iterator();
		
		while(i2.hasNext()){
			Map.Entry me = (Map.Entry)i2.next();
			System.out.println(me.getKey() + ":" +me.getValue());
		}
		//Float f = hm.get("Lara");
		//System.out.println(f);
		
		
	}
	
	
}
