class A {}
class B extends A {
  public void m() {} // pull me up and make abstract

  void n() {
    new A();
  }
}