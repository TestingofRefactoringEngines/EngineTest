class A{
 private int f(boolean b1, boolean b2) {
    int n = 0;
    int i = 0;
    // Extract Method from here
    if (b1)
      i = 1;
    if (b2)
      n = n + i;
    // to here
    return n;
  }
}