interface A {
    /**
     *  push this method down to B
     */
    void foo();
}

interface B extends A {}