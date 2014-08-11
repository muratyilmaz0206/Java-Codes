import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;


public class Conv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyPair p1 = new MyPair("XYZ","123");
		MyPair p2 = new MyPair("XAA","232");
		MyPair p3 = new MyPair("XAW","443");
		MyPair p4 = new MyPair("XXG","555");

		
		Vector<MyPair> myVector = new Vector<MyPair>();
		myVector.add(p1);
		myVector.add(p2);
		myVector.add(p3);
		myVector.add(p4);
		
		// write the function required to convert given Vector in to the Hash Map
		
		Map m = convertToMap(myVector);
		
		
		Set s = m.entrySet();
		Iterator i = s.iterator();
		
		while(i.hasNext()){
			Map.Entry<String, String> me = (Map.Entry) i.next();
			System.out.println(me.getKey() + ":" + me.getValue());
 		}
		
		
	}

	
	public static Map convertToMap(Vector<MyPair> pV){
		Map retVal = new HashMap<String, String>();
		
		for (MyPair myPair : pV){
			retVal.put(myPair.key,myPair.val);
	}
	return retVal;
}
}
