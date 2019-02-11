package d.o;

public interface Demo1 
{
	static final int x=10; // Declarartion and initialization here itself since there cannot be any static block 
	void m1();
}

/* INTERFACE in Java is primarily done to include MULTIPLE INHERITANCE which is not used in Java using multiple interfaces

1) We can only declare STATIC and FINAL variable inside interfaces.
2) there cannot be any concrete method and hence there is no constructor possible
3) Default access specifier is public 
4) it follows Overridding so a subclass has a permission to increase the access specifier but it cannot be reduced */
