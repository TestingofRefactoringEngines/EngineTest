class A{
    public static void print() {
        List<Integer> someNumbers = A.returnAllNumbers(A::alwaysTrue);
    }

    private static List<Integer> returnAllNumbers(Predicate<Integer> predicate) {
        return new ArrayList<>();
    }

    public static boolean alwaysTrue(int a) {
        return true;
    }
}