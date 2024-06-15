package col;
import java.util.HashMap;
import java.util.Map;
public class MAP {	
	public static void main(String[] args) {		
		Map obj = new HashMap<String, String>();		
		obj.put("id", "120abhi");
		obj.put("name", "Abhi");
		obj.put("address", "g 21");			
		Map obj2 = new HashMap<String, String>();		
		obj2.put("id", "120abhi");
		obj2.put("name", "Abhi");
		//obj2.put("address", "g 21");			
		System.out.println(obj);		
		System.out.println(obj.size());		
		System.out.println(obj.get("id"));
		System.out.println(obj.containsKey("id"));
		System.out.println(obj.containsValue("Abhi"));
		System.out.println(obj.isEmpty());
		System.out.println(obj.equals(obj2));
		
		
		
		
		
	}

}
