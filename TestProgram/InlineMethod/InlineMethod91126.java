 class Sample {
    public void foo() {
        Runnable r = () -> bar();
    }

    private void bar() {
        System.out.println("hello");
    }
}