 interface JSam {
    void bar(String p);
}

interface JsamImpl extends JSam {
    void foo();
}

class User {
    void test() {
        JSam jSam = (String p) -> {};

        (new JSam() {
            public void bar(String p) {}
        }).bar("");
    }
}