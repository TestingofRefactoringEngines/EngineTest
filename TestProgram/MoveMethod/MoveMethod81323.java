class Source {
  void usage() {
    Target.foo(1);
    foo("one");
  }

  private static void foo(String x){}
}
class Target {
  public static void foo(int x){}
}