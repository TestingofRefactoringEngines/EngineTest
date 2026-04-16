 class JavaClass {
    String bar() {
        return "bar";
    }

    String baz(boolean condition) {
        if (condition)
            return bar<caret>();

        return "default";
    }
}