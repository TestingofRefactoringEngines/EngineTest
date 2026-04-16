class A {
    public void foo() {

    }

    public void bar() {
        foo();
    }
}

class B extends A {
    public void foo() {

    }

    public void bar() {
        foo();
        super.foo();
    }
}