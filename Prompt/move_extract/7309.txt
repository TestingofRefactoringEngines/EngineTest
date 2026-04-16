class OriginalClass {
TargetClass c;
interface InnerInterface {
void innerMethod();
}
// move method
public void myMethod() {
InnerInterface inner = new InnerInterface() {
@OverRide
public void innerMethod() {
// Some logic here
}
};
//Dependence on instantiation and invocation of static internal interfaces
inner.innerMethod();
}
}
// TargetClass.java
class TargetClass {
}