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
	int attendance;
	int rollNo;
	double result;
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
	int sum(int[] arr)
	{
		int sum = 0;
		for(int num : arr)
		{
			sum += num;
		}
		return sum;
	}
	double percentage(int[] arr, int total)
	{
		return (sum(arr) / total);
	}
	public void setResult(int[] marks)
	{
		result = percentage(marks, 500);
	}
	public void study(int hours)
	{
		System.out.println(name + "Has studies for " + hours + "hours");
	}
	public double getResult()
	{
		return result;
	}
}

// Representative		Student
//            \			 /
// 		       \        /
//              \      /
//         MusicRepresentative
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
// Representative		Student
//            \			 /
// 		       \        /
//              \      /
//         SportsRepresentative
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
class MultipleInheritance
{
	public static void main(String args[])
	{
		SportsRepresentative sr = new SportsRepresentative("Aum Kulkarni", 36, 2, "D6AD");
		MusicRepresentative mr = new MusicRepresentative("Aum Kulkarni", 36, 2, "D6AD");
		int marks[] = new int[]{50, 70, 90, 80, 60};
	}
}
