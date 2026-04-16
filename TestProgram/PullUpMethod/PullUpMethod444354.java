class PullUpBaz implements PullUpToInterfaceBug.Foo {

	public void b() {
		List<Object> l = null;
	}
}
class PullUpToInterfaceBug {

	interface Foo {
	}

	static class Bar implements Foo {

		/** baz it! */
		void baz(final String s) {
		}
	}
}