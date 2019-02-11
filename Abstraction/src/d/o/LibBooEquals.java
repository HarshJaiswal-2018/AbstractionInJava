package d.o;

public class LibBooEquals
{
	public static void main(String[] args) 
	{
		Student112 s1=new Student112(1,"Harsh");
		Student112 s2=new Student112(18,"HarshJaiswal");
		System.out.println(s2.equals(s1));
	}
}

class Student112
{
	int id;
	String name;
	Student112(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public boolean equals(Object arg)
	{
		Student112 s=(Student112)arg;
		return this.id == s.id;
	}
}