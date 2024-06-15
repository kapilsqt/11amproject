package day7;

public class A {
	//global 
	//non static
	
	int a = 10 , b= 20 , c;
	public static void main(String[] args) {		
		//classname obj = new classname();
		//obj.method();		
		A obj = new A();
		obj.Add();	
		obj.Sub();
	}
	
	void Add()
	{				
		c = a + b ;		
		System.out.println(c);
	}
	
	void Sub()
	{		
		c = a - b ;		
		System.out.println(c);
	}
}
