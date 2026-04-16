class RunnableExample {
    public static void main(String[] args) {
        Runnable x = () -> {
            int hello = 9;
            System.out.println(hello);
            ++hello;
            System.out.println(hello);
        };
        Thread thread = new Thread(x);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}    