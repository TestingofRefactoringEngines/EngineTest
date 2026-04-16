import java.io.StringReader;

class X {
    
    Object f() {
        final StringReader reader = new StringReader(""); // extract this line
        return reader;
    }
}