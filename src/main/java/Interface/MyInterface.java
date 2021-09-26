package Interface;

public interface MyInterface {
	
	/*
	What is the difference between an Abstract class and
	Interface?
	1. Abstract classes may have some executable methods and methods left
	unimplemented. Interfaces contain no implementation code.
	2. An class can implement any number of interfaces, but subclass at most one abstract
	class.
	3. An abstract class can have nonabstract methods. All methods of an interface are
	abstract.
	4. An abstract class can have instance variables. An interface cannot.
	5. An abstract class can define constructor. An interface cannot.
	6. An abstract class can have any visibility: public, protected, private or none
	(package). An interface's visibility must be public or none (package).
	7. An abstract class inherits from Object and includes methods such as clone() and
	equals().*/
	
	int i=5;
	String myDetails(String name) throws Exception;
	
	String myDetails1(String name);

}

