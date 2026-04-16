 class ChangeClassSignatureAddParameter {

    public void test( Object object ) {
        if ( object instanceof MyClass ) {
            MyClass myClass = ( MyClass ) object;
        }
    }

    public class MyClass {

    }

}