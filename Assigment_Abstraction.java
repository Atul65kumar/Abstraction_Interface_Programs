package Abstraction;
abstract class shopping
{
	abstract void discount();
	abstract void rupees();
	static void paid()
	{
		System.out.println("This is paid Concrete method under the Abstract class");
	}
	void sell()
	{
		System.out.println("This is non static method named Sell under Parent class ");
	}
}

public class Assigment_Abstraction extends shopping
{
	static void extrapay()
	{
		System.out.println("This is extra pay method under Child class");
	}

	public static void main(String[] args) 
	{
		paid();
		extrapay();
		Assigment_Abstraction a1 = new Assigment_Abstraction();
		a1.sell();
		a1.rupees();
		a1.discount();	
	}
	@Override
	void discount()
	{
		System.out.println("This is discount abstract method which is overridden from Parent class");
	}
	@Override
	void rupees() 
	{
		System.out.println("This is rupees abstract method which is overridden from Parent class");		
	}

}
