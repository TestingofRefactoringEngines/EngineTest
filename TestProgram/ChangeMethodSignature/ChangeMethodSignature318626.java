class {
// Original method
void doSomething(int x, String... args) { /* ... */ }
doSomething(0, "foo", "bar");
doSomething(0, new String[]{"one", "two"});

// Change signature: String... -> String[]
void doSomething(int x, String[] args) { /* ... */ }
doSomething(0, "foo", "bar");               // Incorrect
doSomething(0, new String[]{"one", "two"}); // Correct

// Change signature: String... -> String[], reorder
void doSomething(String[] args, int x) { /* ... */ }
doSomething(new String[]{"foo", "bar"}, 0);               // Correct
doSomething(new String[]{new String[]{"one", "two"}}, 0); // Incorrect
}