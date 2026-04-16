interface Aaa {}

interface Bbb extends Aaa {
    void foo() default {
        System.out.println("Bbb");
    }
}