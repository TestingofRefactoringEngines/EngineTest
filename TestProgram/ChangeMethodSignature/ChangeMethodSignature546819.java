class RefactorWithVarArgsBug {

    public static void main(String[] args) {
        RefactorWithVarArgsBug o = new RefactorWithVarArgsBug(true);
    }

    public RefactorWithVarArgsBug(boolean a, String... strings) {

    }
}