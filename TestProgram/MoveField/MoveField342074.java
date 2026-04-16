class A {
	public void foo(B b) {
		Inner<String> i;
	}
}
class B {
}
class Outer {
	public static class Inner<E> {}
}