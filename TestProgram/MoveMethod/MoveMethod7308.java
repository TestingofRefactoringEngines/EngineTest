class OriginalClass {
TargetClass t;
public static class StaticInnerClass {
public static void staticInnerMethod() {
}
}

//move method
public void originalMethod() {
    StaticInnerClass.staticInnerMethod();
}
}

// TargetClass.java
class TargetClass {
}