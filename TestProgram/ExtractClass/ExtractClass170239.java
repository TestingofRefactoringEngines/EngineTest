class ClassA extends FilterReader {
  public ClassA(Reader in) {   
    super(in);
  }

  @Override
  public int read(char[] cbuf, int off, int len) throws IOException {
    return super.read(cbuf, off, len);
  }
}