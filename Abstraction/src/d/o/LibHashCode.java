package d.o;

public class LibHashCode 
{
	public static void main(String[] args) 
	{
		Student12 s1=new Student12(1,"Harsh");
		System.out.println(s1.hashCode());
		
		Student12 s2=new Student12(18,"HarshJaiswal");
		System.out.println(s2.hashCode());
	}
}

class Student12
{
	int id;
	String name;
	Student12(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public int hashCode()
	{
		return id;
	}
}