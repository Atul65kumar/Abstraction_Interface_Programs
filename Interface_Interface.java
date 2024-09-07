package Interface;
interface A
{
	void add();
	void sub();
}
interface B
{
	void mul();
	void div();
}
public class Interface_Interface implements A,B //also, called Multiple level inheritance
{

	public static void main(String[] args) 
	{
		Interface_Interface i1 = new Interface_Interface();
		i1.add();
		i1.div();
		i1.sub();
		i1.mul();
	}

	@Override
	public void mul() 
	{
		System.out.println(Math.multiplyExact(10, 20));
	}

	@Override
	public void div() 
	{
		System.out.println(Math.floorDiv(10, 20));
	}

	@Override
	public void add()
	{
		System.out.println(Math.addExact(10, 20));
	}

	@Override
	public void sub() {
		System.out.println(Math.subtractExact(10, 20));
	}
}
