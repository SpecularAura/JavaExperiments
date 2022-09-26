interface Representative
{
	void annnounce(String str);
	void inform(String str);
	
}

class Student
{
	String name;
	String division;
	int year;
	int rollNo;
	int result;
	public Student()
	{
		name = null;
		rollNo = 0;
		year = 0;
		result = 0;
		division = null;
	}
	public Student(String name, int rollNo, int year, String division)
	{
		this.name   = name;
		this.rollNo = rollNo;
		this.year = year;
		this.division = division;
	}
	public void setResult(int[] marks)
	{
	}
	public void study()
	{
		
	}
	public int getResult()
	{
		return result;
	}
}
class MusicRepresentative extends Student implements Representative
{
	public MusicRepresentative(String name, int rollNo, int year, String division)
	{
		super(name, rollNo, year, division);
		
	}
	public MusicRepresentative()
	{
		super();
	}
	public void annnounce(String str)
	{
		System.out.println("The Music Council announcement: " + str);
	}
	public void inform(String str)
	{
		System.out.println(name + " passed a message: " + str);
	}
}
class SportsRepresentative extends Student implements Representative
{
	public SportsRepresentative(String name, int rollNo, int year, String division)
	{
		super(name, rollNo, year, division);
		
	}
	public SportsRepresentative()
	{
		super();
	}
	public void annnounce(String str)
	{
		System.out.println("The Music Council announcement: " + str);
	}
	public void inform(String str)
	{
		System.out.println(name + " passed a message: " + str);
	}
}