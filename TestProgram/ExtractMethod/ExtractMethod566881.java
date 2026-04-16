class X {
	private void foo(Object o) {
		if (o instanceof X x) { // select the entire o instanceof X x
			System.out.println(x.toString());
			x.foo(null);
		}

	}
} 