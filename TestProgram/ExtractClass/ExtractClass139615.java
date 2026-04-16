interface Bar<T, U> {
    T method1();
    U method2(T t);
}

class Foo {
    void foo(Bar<String, Integer> bar) {
        bar.method1();
    }
}