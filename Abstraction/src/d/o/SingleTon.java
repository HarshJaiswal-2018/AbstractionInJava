package d.o;

public class SingleTon
{
	public static void main(String[] args) 
	{
		Demo21 d= Demo21.getObject();
		System.out.println(d);
		
		Demo21 d1=Demo21.getObject();
		System.out.println(d1);
	}
}

class Demo21
{
	private static Demo21 d=null;
	
	private Demo21()
	{
		
	}
	
	public static Demo21 getObject()
	{
		if(d==null)
		{
			d=new Demo21();
		}
		return d;
	}
}
