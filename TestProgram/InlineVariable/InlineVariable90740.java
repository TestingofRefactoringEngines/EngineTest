class A{
    public void testInlineRefactoring() {
        int[] array = new int[10];
        int index = computeIndex();
        array[index] = 22;
    }

    private int computeIndex() {
        return 0;
    }
}