interface I {
    default void foo() { // push method down
        System.out.println("I");
    }
}

class C implements I {
    @Override
    public void foo() { 
        System.out.println("C");
    }
}