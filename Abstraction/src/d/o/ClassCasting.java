package d.o;

public class ClassCasting 
{
	public static void main(String[] args) 
	{
		SuperClass d= (SuperClass) new SubClass();    // UPCASTING
		System.out.println(d.y);
		d.test();
		//d.m1();
		
		SubClass s=(SubClass)d;     //DOWNCASTING
		System.out.println(s.x);
		System.out.println(s.y);
		
		s.test();
		s.m1();
	}
}
