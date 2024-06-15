package poly;
import java.util.Scanner;
public class Login {	
	Login()
	{
		int a=90 , b= 30;
		if(a<b)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	
	Login(int a , int b)
	{
		if(a<b)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		Login obj = new Login();
		Login obj2 = new Login(a , b);
		
	}

}
