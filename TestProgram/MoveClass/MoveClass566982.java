@SuppressWarnings("preview")
record R(int i) {
	R {
		System.out.println("Compact Constructor");
	}
}

class X {
}