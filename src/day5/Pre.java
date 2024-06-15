package day5;

public class Pre {
	
	public static void main(String[] args) {
		
		int a = 8;
	
		a = a++ + ++a + a-- - --a;
		
		//a = 8 + 10 + 10 - 8;
					
		System.out.println(a);
		
	}

}
