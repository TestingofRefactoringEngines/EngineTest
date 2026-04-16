class PushDownBug1 {

    static abstract class C {
        // Invoke "Push Down..." on "m"
        abstract void m();
    }

    static final C F = new C() {
        @Override
        void m() {
        }
    };
}
