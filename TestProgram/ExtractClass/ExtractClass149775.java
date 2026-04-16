class ExistingSuper {
    void method() {
        // do something
    }
}
 class Subclass extends ExistingSuper {
    @Override
    void method() {
        super.method();
    }
}
