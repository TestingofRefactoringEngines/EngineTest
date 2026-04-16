class Test {
  public void doTest() {
    String text = "xxx";
    Runnable runnable = () -> Test.this.toVoid(text.length() - 1);
  }

  private void toVoid(Object o) {
  }
}