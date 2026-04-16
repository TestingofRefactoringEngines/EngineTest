class H {
    public static void foo() {}
    public static void foo(String s) {}
}
class Usage {
  void bar() {
    foo();
  }
}