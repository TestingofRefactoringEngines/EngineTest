class Foo {
	private Bar _bar;

	public void foo() {
		_bar.bar();
	}
}
class Bar {
	public void bar() {}
	void x(Foo f) {
		f.foo();
	}
}