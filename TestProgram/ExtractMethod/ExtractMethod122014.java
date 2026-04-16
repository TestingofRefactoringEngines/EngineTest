 class A extends JComponent {

  private void f() {
    Color c = Color.RED;
    setBackground(c);
  }

  private class B extends JComponent {
    void g() {
      Color c = Color.RED;
      setBackground(c);
    }
  }
}