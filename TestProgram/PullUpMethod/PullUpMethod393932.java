class C {
	protected class I1 {
		
	}
	protected class I2 extends I1 {
		protected void foo() {
			
		}
	}
	void test(I2 i) {
		i.foo();
	}
}
