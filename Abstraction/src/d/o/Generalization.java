package d.o;

class Person
{
	int age;
	String name;
}
class Student extends Person
 {
	 String college_name;
	 double marks;
	 
	 public Student (String college_name, double marks)
	 {
		 this.college_name=college_name;
		 this.marks=marks;
	 }
 }
 
class Employee extends Person
 {
	 String company_name;
	 double salary;
	 
	 public Employee(String company_name,double salary)
	 {
		 this.company_name=company_name;
		 this.salary=salary;
	 }
 }

class Access
{
	public void test(Person p)
	{
		System.out.println(p.age);
		System.out.println(p.name);
		
		Student s=(Student) p;
		System.out.println(s.college_name);
		System.out.println(s.marks);
	}
}
 
public class Generalization
{
	public static void main(String[] args) 
	{
		Access s=new Access();
		s.test(new Student("Harsh",95));
		
	}
}


