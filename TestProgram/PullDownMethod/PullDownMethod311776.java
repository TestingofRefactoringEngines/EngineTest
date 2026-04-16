class Foo {
  public static void foo() {} // push me down

  void m() {
    class FooExt extends Foo { }
  }
}