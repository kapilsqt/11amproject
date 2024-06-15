package encp;
import java.util.Scanner;
public class Encp {		
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String name = sc.next();		
		HideData obj = new HideData();		
		obj.setA(a);
		obj.setB(b);
		obj.setName(name);		
		int x  = obj.getA();
		int y  = obj.getB();		
		if(x<y)
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}		
		String name_b = obj.getName();
		System.out.println(name_b);
	}
}
