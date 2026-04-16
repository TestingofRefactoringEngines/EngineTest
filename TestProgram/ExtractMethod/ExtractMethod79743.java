class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int a = 1;
        main.test(a);
    }


    private void test(Object a) {
        System.out.println("" + (Object)a);
    }
}    