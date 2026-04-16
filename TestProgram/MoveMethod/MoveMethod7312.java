class SourceClass {

TargetClass target;

public SourceClass(TargetClass target) {
this.target = target;
}

private final void methodToMove(TargetClass target) {
// Method implementation
this.target = target;
}
}

interface TargetClass {
void methodInInterface();
}