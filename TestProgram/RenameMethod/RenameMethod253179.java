class CollectionUtils {
    public static <T> List<T> of(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }
}    