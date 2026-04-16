class SubDeprecation  {
	/**
	 * @see Other#foo()
	 */
	public void foo() {
		System.out.println("foo");
	}
	
	void m() {
		foo();
	}
}