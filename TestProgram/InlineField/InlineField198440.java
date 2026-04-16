class K {
    void m() {
        class Local {
            void locally() {}
        }
        new Local().locally();
    }
}