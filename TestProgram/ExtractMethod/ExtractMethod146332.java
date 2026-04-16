class A{
private void foo() {
    if (false) return;
   // <selection>
try {}
    finally {
      while (true) {
        break;
      }
    }
//</selection>
  }
}