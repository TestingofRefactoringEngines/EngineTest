class A {

	protected void foo(String s) {
		System.out.println("A.foo()");
	}

	protected void foo(Integer i) {
		System.out.println("A.foo()");
	}
}
class B1 extends A {

	public void bar1() {
		foo(null);
	}
}
class B2 extends A {

	public void bar2() {
		foo(null);
	}
}