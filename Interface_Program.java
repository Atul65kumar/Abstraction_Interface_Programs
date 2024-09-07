package Interface;
interface Amazon
{
	void add(); // There methods are abstract but we do not use abstract keyword in Interface Programs
	void subtract();
}
public class Interface_Program implements Amazon
{
	public static void main(String[] args)
	{	
		Interface_Program i1 = new Interface_Program();
		i1.add();
		i1.subtract();
	}
	@Override
	public void add() 
	{
		System.out.println("This is add method");
	}
	@Override
	public void subtract()
	{
		System.out.println("This is subtract method");

	}
}
//Abstract class - Abstract method can have both abstract methods as well as concrete methods