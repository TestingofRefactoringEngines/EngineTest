class OrginalClass {
public void f() {}
}
class OtherClass extends OrginalClass{
public void c() {
// extract local variable: super
super.f();
}
}