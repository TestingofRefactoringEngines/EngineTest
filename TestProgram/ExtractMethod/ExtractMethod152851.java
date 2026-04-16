 class EmoDaddy {
    protected int daddyField = 1;
    protected int daddyMethod() { return daddyField; }
} 
 class LambdaEmo extends EmoDaddy {
    private int ownField = 2;
    private int ownMethod() { return ownField; }
    public void context() {
        queue(() -> System.out.println(ownField + ownMethod()));
        queue(() -> System.out.println(this.ownField + this.ownMethod()));
        queue(() -> System.out.println(super.daddyField + super.daddyMethod()));
    }
    public void queue(Runnable runnable) { runnable.run(); }
} 