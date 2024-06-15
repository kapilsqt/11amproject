package oops;
//parent | base | super
class P{
	//attributes 
	int a = 10;
	int b = 20;
	//method 
	void Add()
	{
		int  c = a + b;
		System.out.println(c);
	}
}

//child | drived | sub class
public class Child extends P {		
	//method 
	void Sub()
	{
		int  c = a - b;
		System.out.println(c);
	}			
	public static void main(String[] args) {		
		Child obj = new Child();
		obj.Add();		
		obj.Sub();
	}
	
}
