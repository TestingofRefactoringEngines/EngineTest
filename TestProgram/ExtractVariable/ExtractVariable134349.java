 class Foo {
  public Runnable getMessage(final Bar bar) {
    if (bar.getMessage() == null) {
      System.out.println("no message");
    }
    return new Runnable() {
      @Override
      public void run() {
        System.out.println(bar.getMessage());
      }
    };
  }
}

 class Bar {
  public String getMessage() {
    return "Hello";
  }
}