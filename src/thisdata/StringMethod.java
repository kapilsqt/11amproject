package thisdata;
public class StringMethod {	
	public static void main(String[] args) {		
		String name = "Hello";
		String name1 = "hello";		
		//System.out.println(name.isEmpty());		
		System.out.println(name);		
		System.out.println(name.length());		
		System.out.println(name.concat(name1));		
		System.out.println(name.charAt(0));		
		System.out.println(name.contains("He"));		
		System.out.println(name.endsWith("Hello"));
		System.out.println(name.startsWith("H"));		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());		
		System.out.println(name.equals(name1));
		System.out.println(name.trim());		
		System.out.println(name.replace("H", "A"));		
		System.out.println(name.equalsIgnoreCase(name1));		
	}
}
