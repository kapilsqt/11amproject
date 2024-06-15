package day1testng;

import org.testng.annotations.Test;

public class TestApp {
		
	@Test(dependsOnMethods = "Register")
	void Login()
	{
		System.out.println("Login");
	}
	
	@Test
	void Register()
	{
		System.out.println("Register");
	}

}
