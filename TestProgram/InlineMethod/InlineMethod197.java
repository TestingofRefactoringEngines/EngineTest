class Main {
	public static String format (String... input) {
		return "";
	}
	public static void main(String[] args) {
		int value = 0;
		String message = switch (value) {
			case 0 -> format("");
			default -> "";
		};
	}
}