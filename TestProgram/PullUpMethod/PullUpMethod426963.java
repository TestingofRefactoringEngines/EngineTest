class Square implements Shape {

	public Integer getArea(@NonNull Integer length) {
		return new Integer(length * length);
	}
}
