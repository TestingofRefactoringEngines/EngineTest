class Issue {
    public static void filterMap() {
        new HashMap<Long, Set<Integer>>()
                .entrySet()
                .stream()
                .collect(toMap(Entry::getKey, Entry::getValue));
    }
}

class WithMethod {
    public static void main(String[] args) {
        Issue.filterMap();
    }
}