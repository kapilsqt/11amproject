package poly;

//parent || super || base 
class Par
{	
	void A() {
		System.out.println("par");
	}
}

public class Child extends Par{
	
	void A() {
		super.A();
		System.out.println("child");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.A();

	}
}
