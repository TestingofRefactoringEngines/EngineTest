class NewClass extends SuperClass {
    String s;
               <-- **blank line inserted here**
    int x;
    double y;

    public NewClass() {
        // This y does something.
        x = 99;
        y = 99.456;
        s = "Hello World!";   
    }
   
}
