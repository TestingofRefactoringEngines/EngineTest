class A{
    private void withStream(Stream<Object> stream) {
        String leg = "";
        stream.forEach(o -> new StringBuilder().append(leg).append("123"));
    }
}