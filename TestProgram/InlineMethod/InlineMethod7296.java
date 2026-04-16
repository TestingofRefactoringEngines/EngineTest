class OriginalClass {
public void originalMethod() throws IOException {
}
}
class OtherClass1 {
public void callerMethod(){
OriginalClass obj = new OriginalClass();
// inline method "originalMethod()"
try {
obj.originalMethod();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}