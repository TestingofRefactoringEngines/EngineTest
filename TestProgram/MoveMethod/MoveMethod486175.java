class A{
    public B b = new B();
    static void staticMethod(){}
    void moveMe(){b.m(); staticMethod();}
}

class B{
    void m(){}
}