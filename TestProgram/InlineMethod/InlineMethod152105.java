 class B {
    void foo() {
        String tmp = bar();
//        tmp = bar();
        System.out.println("that's a bar()");
    }

    String bar() {
        return "blah";
    }
}