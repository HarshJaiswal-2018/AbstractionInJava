package d.o;

public class LibToString 
{
	public static void main(String[] args)
	{
		Student18 s=new Student18(1,"Harsh");
		System.out.println(s);
	}
}

class Student18
{
	int id;
	String name;
	
	Student18(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return "Id: "+id+"\nName: "+name;
	}
}
