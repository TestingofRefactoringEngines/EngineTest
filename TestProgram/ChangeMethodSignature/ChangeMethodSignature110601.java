class ClassA {
    public String methodA() {
        return null;
    }
}

public class ClassB {
    private ClassA classA = new ClassA();

    public String methodB(int var1, String var2) {
 return classA.methodA()
;
    }
}

class ClassC {
    private ClassB classB = new ClassB();

    public void methodC(String string) {
        int var1 = 1;
        String var2 = "c";
        classB.methodB(var1, var2);
    }
}