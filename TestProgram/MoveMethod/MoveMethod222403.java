class A {
    public Runnable create() {
        return new Runnable() {
            public void run() {
            }
        };
    }
}
class B {

    public Runnable create() {
        return new Runnable() {
            () {
                <init>();
            }

            public void run() {
            }
        };
    }
}