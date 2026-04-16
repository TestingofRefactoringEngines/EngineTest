class Test {
    Runnable r = () -> {};
    void foo() {
        r.run();
    }
}