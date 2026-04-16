class Foo {

    public int x;
    
    public class Inner {
        public int y;
        
        public void foo() { 
            y = x + 1;
        }
    }
}