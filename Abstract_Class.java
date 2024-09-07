package Abstraction;
abstract class Grand_Parent   //abstract class
{
	abstract void add();
	abstract void subtraction();
	static void multiply()
	{
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
}

class Parent extends Grand_Parent //concrete class
{
	static void division()
	{
		int a=10;
		int b=20;
		System.out.println(b/a);
}
	void add() {
		System.out.println("This is Add abstract method");
		
	}
	 void subtraction() {
		System.out.println("This is Substraction abstract method");
		}
	}
public class Abstract_Class extends Parent //concrete class
{
	public static void main(String[] args) 
	{
		multiply();
		division();
		Abstract_Class a1 = new Abstract_Class();
		a1.add();
		a1.subtraction();
	}
}

