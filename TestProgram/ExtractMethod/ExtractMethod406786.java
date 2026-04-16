@FunctionalInterface
public interface I1 {
	int foo(int a);
}

interface I2 {
	I1 i1= (a) -> {
		int b= 10; // Exception on extracting to method
		return a + b;
	};
}

interface I3 {
	default int foo () {
		int a= 10; // Exception on extracting to method
		return a;
	}
	
	static int bar() {
		int a= 10; // Exception on extracting to method
		return a;
	}
}