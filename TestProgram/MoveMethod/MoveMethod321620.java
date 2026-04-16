class X {
    void run() {
        x();
        y();
    }
    private static void x() {}
    
    static class Y {
        static void y() {}
    }
}
