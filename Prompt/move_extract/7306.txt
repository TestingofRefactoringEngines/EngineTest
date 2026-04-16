class TargetClass {
}

class SourceClass {
TargetClass target;
//move method
public void callMethod() {
anotherMethod();
}

private void anotherMethod() {
    System.out.println("Another method in TargetClass");
}
}