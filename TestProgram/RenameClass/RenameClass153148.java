class Foo {
    class Baz {}
    
    void test(Baz bar) {
        
    }

    void test1() {
        Baz bar = new Baz();
    }

    void test2() {
        List<Baz> bars = new ArrayList<>();
        bars.forEach(bar -> System.out.println(bar));
    }
}