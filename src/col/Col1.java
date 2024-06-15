package col;
import java.util.ArrayList;
public class Col1 {	
	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("hello");
		obj.add("hello");
		obj.add("hello");
		obj.add("hello");		
		
		System.out.println(obj.size());
		System.out.println(obj.contains("hello"));
		System.out.println(obj.get(0));
		System.out.println(obj.isEmpty());
		obj.clear();
		System.out.println(obj);
		
	}

}
