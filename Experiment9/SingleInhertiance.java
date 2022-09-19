class Parent
{
	public Parent()
	{
		System.out.println("Hello From Parent");
	}
	public void toBeOverriden()
	{
		System.out.println("Hello");
	}
}
class Child extends Parent
{
	public Child()
	{
		System.out.println("Hello from Child");
	}
	public void toBeOverriden()
	{
		System.out.println("Hi");
	}
}
class SingleInheritance
{
	public static void main(String args[])
	{
		Parent p = new Child();
		p.toBeOverriden();
	}
}
