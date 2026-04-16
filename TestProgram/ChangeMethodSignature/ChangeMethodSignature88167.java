class Test {
}
enum TestEnum {
  a {
    @Override
    int getValue() {
      return 0;
    }
  };
  abstract int getValue();
}