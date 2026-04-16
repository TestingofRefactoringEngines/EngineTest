class Bug {
	
	class Inner {
		String field;
	}
	
	Inner inner;
	String string;
	
	static void foo() {
		Bug b= new Bug();
		b.bar();
	}
	
	void bar() {
		inner.field= "Eclipse";
		string= "Eclipse";
	}
}