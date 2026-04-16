class A {
  public B b;
    private long m(long l) {
      return 0;
    }
  public long m(int i) {
    return 1;
  }
}
class B extends A {
  public long test() {
    return super.m(2);
  }
}