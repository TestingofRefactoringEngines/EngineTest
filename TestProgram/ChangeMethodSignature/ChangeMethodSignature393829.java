class ChangeMethodSignatureBug {

    public ChangeMethodSignatureBug(Object obj) {
    }

    public void m() {
        new ChangeMethodSignatureBug(new Object() {
            public void a(Object par1, Object par2) {
            }
        });
    }
}