package StringPack;

public class StringBuilder1 
{
	public static void main(String[] args) 
	{
		StringBuilder s=new StringBuilder("jspider");
		StringBuilder s1=new StringBuilder("jspider");
		
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
		
		// Methods of strng Builder Class
		System.out.println();
		System.out.println();
		
		System.out.println("OUTPUTS USING METHODS OF STRINGBUILDER CLASS");
		s.append('s');
		System.out.println(s);
		
		s.setCharAt(0,'q');
		System.out.println(s);
		
		s.insert(3,'p');
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		
	}

}
