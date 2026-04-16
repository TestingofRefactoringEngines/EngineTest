class A {

  static class Inner {
     String a;
  }
}
 class B {

 Object o= new A.Inner().a;
}