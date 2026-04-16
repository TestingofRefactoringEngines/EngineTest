class Parent<T> {
    T p; // push field down to 'Child' - warning - OK
    public void foo(T p) { // push method down to 'Child' - no warning - not OK
        System.out.println("a");
    }
}

class Child extends Parent {
    Object p;
    public void foo(Object p) {
        System.out.println("b");
    }
}