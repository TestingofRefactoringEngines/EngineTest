class InlineMethodTest{
public void main() {
class T {
public T() {}
}
inlineMethod();
}
// inline method
public void inlineMethod() {
class T {
T t;
public T() {}
}
}
}