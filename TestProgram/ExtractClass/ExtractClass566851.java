record R() {// select R and Refactor->Extract Interface
	private void foo(Object o) {
		if (o instanceof R) {
			System.out.println("hello");
		}
	}

}