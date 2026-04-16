class MainClass {
    public static void main(String[] args) {
        InnerStaticClass inner = new InnerStaticClass();
        int result = inner.calculate();
        System.out.println(result);
    }
    static class InnerStaticClass {
        public int calculate() {
            return 10 + 20;
        }
    }
} 