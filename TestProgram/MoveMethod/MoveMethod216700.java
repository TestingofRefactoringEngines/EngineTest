Class A {
	static int getRecursive() {
		getRecursive();
	}
}
Class B {
	static int getRecursive() {
		A.getRecursive();
	}
}