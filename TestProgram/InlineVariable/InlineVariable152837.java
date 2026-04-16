 class ConflictingInterfaces {
    interface A {}
    interface B {}

    class C implements A, B {}

    void print(A a) {
        System.out.println(a);
    }

    void print(B a) {
        System.out.println(a);
    }

    void test() {
        C one = new C();
        A a = one;
        B b = one;

        print(a); // inline a
        print(b); // inline b
    }
}