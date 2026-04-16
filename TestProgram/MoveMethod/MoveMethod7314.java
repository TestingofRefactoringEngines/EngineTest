class SourceClass{
private TargetClass target;
public SourceClass(TargetClass target) {
this.target = target;
}
// move method
public void moveMethod(TargetClass parameter) {
((TargetClass) target.abstractField).methodWithSameName();
}
}
interface TargetClass {
Object abstractField = null;
void methodWithSameName();
}