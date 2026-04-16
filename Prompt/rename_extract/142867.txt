class SubSon {
    public void doMyOwn() {}
}
class GrandSon extends SubSon {
    @Override public void doMyOwn() { super.doMyOwn(); }
} 