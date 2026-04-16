class ExtractVariableSample {

  public static void main(String[] args) {
    Collection<String> strings = new ArrayList<>();
    new Object() {
      public void foo(String s) {
        System.out.println(s.hashCode());
      }
    };
    for (String s : strings) {
      System.out.println(s.hashCode());
    }
  }
}