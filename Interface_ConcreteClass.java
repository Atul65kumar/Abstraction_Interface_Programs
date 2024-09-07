package Interface;

interface GrandParent 
{
	void method1();
	void method2();
}
class Parent_class implements GrandParent 
{
	static void method3()
	{
		System.out.println("Method 3");
	}
	void method4() 
	{
		System.out.println("Method 4");
	}
	@Override
	public void method1() 
	{
		System.out.println("Overridden Method 1");
	}
	@Override
	public void method2()
	{
		System.out.println("Overridden Method 2");
	}
}
public class Interface_ConcreteClass extends Parent_class 
{
	public static void main(String[] args) 
	{
		method3();
		Interface_ConcreteClass i1 = new Interface_ConcreteClass();
		i1.method1();
		i1.method2();
		i1.method4();	
	}
}
