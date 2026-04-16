abstract class Superclass {
    public int i;
    protected class Inner {
        void go() {
        	i = 1;
        }
    }
    public abstract void go(Inner param);
}
class Subclass extends Superclass {
	public void go(Inner param) {}
}
