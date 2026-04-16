interface Foo {
    void setFoo(int foo);
}

class Bar implements Foo {
    int foo;

    @Override
    public void setFoo(int foo) {
        this.foo = foo;
    }
}