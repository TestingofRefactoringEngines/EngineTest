class A{
  void foo(Object x) {
        if (x instanceof String) x = getSubstring(x); //red code. Cast to String expected
        if (x instanceof String) x = getSubstring((String) x);
    }

    private String getSubstring(String x) {
        return ((String)x).substring(1);
    }
}