class OriginalClass {
TargetClass c;
private OriginalClass() {
// Some logic here
}
public void methodUsingPrivateConstructor() {
// due to dependency on instantiation of private constructors
OriginalClass instance = new OriginalClass();
}
}
class TargetClass{
}