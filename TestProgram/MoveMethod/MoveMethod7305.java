class SourceClass {
private int value;
TargetClass c;
public void setValue(int value) {
this.value = value;
}
// move method "dependentMethod()" to TargetClass
public void dependentMethod() {
System.out.println("Dependent method: " + value);
}
}

class TargetClass {
public void callDependentMethod() {
SourceClass source = new SourceClass();
source.dependentMethod(); // DependentMethod() depends on the value attribute in the Source Class
}
}