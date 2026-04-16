class A {
  public static class B {
    @SuppressWarnings("unused")
    private final String a, b;
    public B(String a1, String b1) {
      a = a1;
      b = b1;
    }
    public String getA() {
      return a;
    }
    public String getB() {
      return b;
    }
  }
}