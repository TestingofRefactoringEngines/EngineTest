class A {
	public static int i;

	public static int getI() {         // APPLY INLINE HERE
		return i;
	}
}

 enum B {
	m(A.getI());
	
	B(int j){		
	}
}
