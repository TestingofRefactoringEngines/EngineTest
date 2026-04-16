 class TestCase{
	public void main() {
		class T {
			public T() {}
		}
		/*]*/foo();/*[*/
	}
	
	public void foo() {
		class T {
			T t;
			public T() {}
		}
	}
}