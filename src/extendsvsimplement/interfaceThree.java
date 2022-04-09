package extendsvsimplement;
// An interface can extend any number of interfaces at a time.

interface interfaceOne{
	void methodOne();
}

interface interfaceTwo{
	void methodTwo();
}

// interface extendin both the defined interfaces
interface interfaceThree extends interfaceOne, interfaceTwo{

}
