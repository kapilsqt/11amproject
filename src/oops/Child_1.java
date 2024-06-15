package oops;
class GF
{
	int a = 10  , b=20 , c=30;	
	void Test1()
	{
		if(a>b) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
class P1 extends GF
{
	void Test2()
	{
		if(a<b) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
public class Child_1 extends P1 {	
	public static void main(String[] args) {
		Child_1 obj = new Child_1();
		obj.Test1();	
		obj.Test2();	
	}
}
