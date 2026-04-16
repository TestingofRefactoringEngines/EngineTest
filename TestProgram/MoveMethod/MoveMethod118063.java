class C {
}
class A {
	protected static void foo(int args) {}
	protected static void foo(int args, int moreArgs) {}
	private void bar() {
		foo(5);
		foo(5, 5);
	}
}