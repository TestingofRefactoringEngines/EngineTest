class SubGeneric<E extends Number> extends Generic<E> {
	private E field2;
	Number number;
	
	/**
	 * bar
	 * @return
	 */
	public final E getField2() {
		return field2;
	}
	
	/**
	 * bar
	 * @return
	 */
	public final Number getNumber() {
		return number;
	}
}