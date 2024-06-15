package day7;

public class Staticcalling {
	
	//global : inside a class but outside a method:	

	static String name  = "Ram";
	static int a = 10;
	static int b = 10;
	
	public static void main(String[] args) {
		
		//inside a method body : local	
		System.out.println(name);
		System.out.println(a);
		
		Add();
	}
	
	static void Add()
	{
		int c = a + b;
		System.out.println(c);
	}

}
