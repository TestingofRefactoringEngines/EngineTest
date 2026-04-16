 class Action {
    public void acting(String s)  {
        System.out.println(s);
    }
}


 class Client {
    public static void consumer(String val, IFunc func) {
        func.func(val);
    }

    public static void main(String[] args) {
        Action a = new Action();
        consumer("hello", a::acting);
    }
}