class Base {
   public void foo(int count) {}
}
class A extends Base {
    @Override
    public void foo(int count) {} // change signature
}