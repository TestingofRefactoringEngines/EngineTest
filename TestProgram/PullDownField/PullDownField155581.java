class Parent<T> {
    void foo(List<? extends T> p) {} // push method down and keep abstract
}

class Child extends Parent {
}