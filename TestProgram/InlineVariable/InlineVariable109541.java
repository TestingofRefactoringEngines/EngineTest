class C {
  void m() throws Exception {
    try (AutoCloseable inlineMe = null) {
      try (AutoCloseable r2 = inlineMe) {
        System.out.println(inlineMe + ", " + r2);
      }
    }
  }
}