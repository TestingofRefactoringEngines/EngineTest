class A{
static public void setUp(Object test) throws Exception {
    List<Method> befores= getTestMethods(test.getClass(), Before.class);
    for (Method before : befores)
      before.invoke(test);
  }
}
