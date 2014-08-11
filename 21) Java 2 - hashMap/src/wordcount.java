import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class wordcount {

	static String cnn = " (CNN) -- Throughout Mayor-elect Bill de Blasio's campaign for New York's top political act, his backup band seemed to overshadow the headliner." +
"His son Dante, a sophomore at a public high school in Brooklyn, appeared prominently "+
			"in campaign ads, his soaring Afro a topic of conversation in political"+
			"circles. Daughter Chiara, a college freshman, out-danced the rest of the"+
			"telegenic ";

	public static void main(String[] args) {
		
String []keywords = cnn.split(" ");
HashMap<String, Integer> hm = new HashMap<String, Integer>();

for(String key : keywords){
	
	int value = 0;
	
	
	if(hm.containsKey(key))
		value = hm.get(key);
	
	hm.put(key, value+1);
	
	
}

Set set = hm.entrySet();
Iterator i = set.iterator();

while(i.hasNext()){
	Map.Entry me = (Map.Entry)i.next();
	System.out.println(me.getKey() + ":" +me.getValue());
}


	}

}
