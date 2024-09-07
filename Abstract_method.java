package Abstraction;
abstract class Amazon //abstract class
{
	abstract void login(); //abstract method
	abstract void registration(); //abstract method
} //exposing to 3rd organization

public class Abstract_method extends Amazon
{
	static void logout() //concrete method
	{
		System.out.println("This is logout Concrete method");
	}
	static void resetpassword()//concrete method
	{
		System.out.println("This is ResetPassword Concrete method");
	}
	public static void main(String[] args) 
	{
		logout();
		resetpassword();
		Abstract_method a1 = new Abstract_method();
		a1.login();
		a1.registration();
		
	}
	@Override
	void login() 
	{
		System.out.println("This is login Abstract overridden method");
	}
	@Override
	void registration()
	{
		System.out.println("This is Registration Abstract overridden method");
	}
}
