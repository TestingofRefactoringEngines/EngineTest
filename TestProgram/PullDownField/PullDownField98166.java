class A {
    public int f;
    
    class B extends A {
        public void method1(){
            int aVal = 0;
            super.f = 0;
        }
    }
}
