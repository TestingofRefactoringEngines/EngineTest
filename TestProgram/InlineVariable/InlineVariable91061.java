class Main {
    void asd() {
        final String p = "aa";
        Runnable r = () -> System.out.println(p);
        System.out.println(p);
        new Thread(r).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.asd();
    }
}    