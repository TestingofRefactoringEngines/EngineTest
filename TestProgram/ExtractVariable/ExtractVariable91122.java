class A{
public void foo() {
    final boolean b = f.getName().endsWith(".java");    // f is not resolved
    FileFilter java = f -> b;
}
}