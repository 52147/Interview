package extendsvsimplement;
// A class can extend a class and can implement any number of interfaces simultaneously.

// Defining the interface
interface First{
	// abstract method
	void methodFirst();
}

// defining a class
class Second{
	
	// defining a method
	public void methodSecond() {}
}

// class which extends the class Second and implements the interface First
public class Third extends Second implements First{
	
	public void methodFirst() {}
	
	

}
