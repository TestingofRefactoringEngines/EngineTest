interface Task  {
    void doit();
}

class SuperClient extends Client {
    public static void main(String[] args) {
        Task t = () -> System.out.println("hello"); // inline 't'
        Runner r = t::doit;
        r.run();
    }
}