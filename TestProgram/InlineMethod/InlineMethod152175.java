 class A {
    void foo() {}
}

 class B extends A {
    @Override //becomes erroneous after inlining
    void foo() {}

    void err() {
        super.foo(); //inline the method
    }
}