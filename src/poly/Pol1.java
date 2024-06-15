package poly;
import java.util.Scanner;
public class Pol1 {	
	//default method
	void Test()
	{
		System.out.println("Def method");
	}
	//argument passing
	void Test(int a)
	{
		System.out.println(a);
	}
	void Test(double a)
	{
		System.out.println(a);
	}
	void Test(int a , int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Pol1 obj = new Pol1();
		obj.Test(a);
		obj.Test(a,b);
	}
}
