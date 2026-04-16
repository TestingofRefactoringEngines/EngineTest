class JavaClass {
    static String readFirstLineFromFile() throws IOException {
        try (BufferedReader br = createReader("any")) {
            return br<caret>.readLine();
        }
    }

    private static BufferedReader createReader(String path) {
        try {
            return new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            // for example purposes #createReader shouldn't throw any checked exception
            throw new RuntimeException(e);
        }
    }
}