class Bar {
	private final class Inner {
		public void add() {
			// Bar.this.hashCode();
			addTo(Bar.this);
		}
		
		void addTo(Bar map) {
			
		}
	}
}
