package StringPack;

public class StringMain
{
	public static void main(String[] args) 
	{
		String s = "jspiders";
		String s1 = "jspiders";
		String s2 = new String("jspiders");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s2.toString());
		
		System.out.println("SubString: "+s.substring(1,3));
		System.out.println("Concatenated String: "+s.concat("qspiders"));
		System.out.println("Lower Case: "+s.toLowerCase());
		System.out.println("Upper Case: "+s.toUpperCase());
		System.out.println("Replaced String: "+s.replace('j','q'));
		System.out.println("Replaced string: "+s.replaceAll("jspiders", "qspidrs"));
		System.out.println("Length of the string: "+s.length());
	}

}
