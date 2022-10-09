package samplepackage;
public class Class1
{
	public Class1()
	{
		System.out.println("Hello From Class1 from samplepackage");
	
	}
}

public class Class2
{
	public Class2()
	{
		System.out.println("Hello From Class2 from samplepackage");
	
	}
}

public class Class3
{
	public Class3()
	{
		System.out.println("Hello From Class3 from samplepackage");
	
	}
}

import samplepackage.Class1;
class SampleClass
{
	public static void main(String args[])
	{
		samplepackage.Class1 c1 = new samplepackage.Class1();
		samplepackage.Class2 c2 = new samplepackage.Class2();
		samplepackage.Class3 c3 = new samplepackage.Class3();
	}
}