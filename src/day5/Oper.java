package day5;

public class Oper {
	
	public static void main(String[] args) {
		
		int a = 10 , b=30, c=90;
		
		if(a<b && b>c)
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}		
		
		System.out.println(!(a!=b));
	}
}
