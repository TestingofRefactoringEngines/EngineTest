public void log(Level level, String message, String... parameters) {
		String formattedMessage = MessageFormat.format(message, (Object[])parameters);
		System.out.println("Logging "+message+" with "+Arrays.asList(parameters));
		LogManager.getLogManager().getLogger(Foo.class.getName()).log(level, formattedMessage);
	}