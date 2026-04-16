 class BaseInner {}

 class Outer {
    public int x = 0;
    public void foo(){};

    public class Inner extends BaseInner {
        void innerMethod() { // PULL this method UP
            System.out.println(Outer.this.x);
            Outer.this.foo();
        }
    }
}