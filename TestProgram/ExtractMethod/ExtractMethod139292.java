class Example  {
    void foo(int value) {
        class Local {
            void bar() {
                Runnable runnable = () -> {
                    System.out.println(value);
                };
            }
        }
    }
}