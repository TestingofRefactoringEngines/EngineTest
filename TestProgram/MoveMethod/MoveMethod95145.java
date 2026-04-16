class Exposer<T> {
	class Inner {
		T foo;
	}
	
	T foo() {
		Inner inner = new Inner();
		return inner.foo;
	}
}