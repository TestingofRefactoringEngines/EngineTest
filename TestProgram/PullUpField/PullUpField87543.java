interface Bar<T> { }
 interface Base<T> { }

 class Foo<T,U> implements Base<U> {
    void foo(Bar<U> bar) { }
}