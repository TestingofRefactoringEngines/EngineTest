class Foo {
	private static final class Bar {
		private Class baz() {
			return getClass();
		}
	}

	private void bar() {
		new Bar();
	}
}
