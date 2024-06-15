package day7;

public class NonStatic {
	
	int a=90 , b=80;

	public static void main(String[] args) {
		
		NonStatic obj = new NonStatic();
		obj.Add();
		
	}
	
	void Add()
	{
		int c = a + b;
		System.out.println(c);
	}

}
