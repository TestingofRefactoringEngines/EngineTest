 enum CopyOfHelperType {
	SETUP, TEARDOWN;

	static class AnnotationInvoker {
		private CopyOfHelperType type;

		public AnnotationInvoker(CopyOfHelperType type) {
			this.type = type;
		}

		void invoke(Object theInstance) throws IllegalAccessException, Throwable {
		}		
	}
	
	public void invokeTheAnnotation(final Object theInstance) throws Throwable,
IllegalAccessException {
		new AnnotationInvoker(this).invoke(theInstance);
	}
}