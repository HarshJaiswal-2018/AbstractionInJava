package d.o;

abstract public class Demo
{
	abstract void m1();
}


/* Key POINTS:

ABSTRACTION is Bsically the concept of method OVERRIDDING

1) If the METHOD is ABSTRACT then the class has to be ABTACRT though it is not necessary otherwise
2) We cannot create OBJECTS of Abstract class
3) We can define Constructors in abstarct class

4) Abstarct keyword should not be combined with keywords like 1)FINAL,2)Static and 3)Private
5) Final, static and private variables cannot be abstarct

6) We can define static as well as non-static variables

7) As such there is NO PURE ABSTRACTION since the classes by default inherits OBJECT CLASS 
8) in order to achieve pure abstraction we use INTERFACE */