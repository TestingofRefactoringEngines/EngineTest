class RefactoringLambda {

    public static void main(String[] args) {
        Consumer<I> c = i -> {};
    }

    public static final class I {}
}