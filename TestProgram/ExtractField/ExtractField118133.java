class ClassA {
    public static int staticMethod() {
        return 10;
    }
}

class Main {
    public static void main(String[] args) {
        int abc = ClassA.staticMethod();
        System.out.println(abc);
    }
}    