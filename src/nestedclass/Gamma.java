package nestedclass;
// extends a non-static inner class from outside an enclosing instance
class Alpha {
	class Beta {
	}
}

public class Gamma extends Alpha.Beta {
	// important to get the constructor right or else the whole thing fails
	Gamma(Alpha alpha) {
		alpha.super();
	}
}
