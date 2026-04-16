class Foo {

    static void foo() {
    }

    static class Bar {
        void foo() {
            Foo.foo();
        }
    }
}

class Baz {
}