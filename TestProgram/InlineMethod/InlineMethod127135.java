 class CallToSimpleGetter {
    private String someString = "";

    public void execute() {
        getFirst();
    }

    public String getFirst() {
        return someString;
    }
}