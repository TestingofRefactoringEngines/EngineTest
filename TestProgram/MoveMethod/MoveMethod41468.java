class A {
	Second s;
	public void print() {
		s.foo(s);
		s.bar();
		
	}
}
class Second {
	public void foo(Second s) {
		s.bar();
	}

	public void bar() {
	}
}