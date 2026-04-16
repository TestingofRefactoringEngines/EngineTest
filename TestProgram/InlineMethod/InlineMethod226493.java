class A {
    public static void main(String[] args) {
        String message = getMessage();
        System.out.println(message);
    }

    public static String getMessage() {
        return "Hello World!";
    }
}

class ATest {

    @Test
    public void testMain() {
        String message = A.getMessage();
        assertEquals(message, "Hello World!");
    }
}