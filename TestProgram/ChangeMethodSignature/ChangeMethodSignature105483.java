class Foo {
    final int bar;
    final HashSet<String> hashSet; // Invoke the quick fix on this line

    Foo(int bar) {
        super();
        this.bar = bar;
    }
}

class Bar {
    public static void main(String[] args) {
        new Foo(1);
    }
}