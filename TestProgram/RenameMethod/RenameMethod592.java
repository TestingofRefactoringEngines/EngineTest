class ExampleTest {

    public void testMethod() {
        SomeDependencyClass dependency = new SomeDependencyClass();
        dependency.doSomething();
    }

    public static void main(String[] args) {
        ExampleTest test = new ExampleTest();
        test.testMethod();
    }
}    