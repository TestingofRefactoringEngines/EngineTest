class A {
	static class B<T> {
		
	}
	
	private <T> B<T> foo() {
		return new B<T>();
	}
}