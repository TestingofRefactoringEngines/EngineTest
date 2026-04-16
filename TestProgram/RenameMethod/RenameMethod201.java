import java.util.ArrayList;
import java.util.List;
class CodeElement {
    private String className;
    private String methodName;

    public CodeElement(String className, String methodName) {
        this.className = className;
        this.methodName = methodName;
    }

    public String getClassName() {
        return className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public String toString() {
        return "CodeElement{className='" + className + "', methodName='" + methodName + "'}";
    }
}
class RenameMethodProcessor {
    private List<CodeElement> codeElements;

    public RenameMethodProcessor() {
        this.codeElements = new ArrayList<>();
    }
    public void addCodeElement(CodeElement element) {
        codeElements.add(element);
    }
    public List<CodeElement> batchFindNewOccurrences(String oldMethodName, String newMethodName) {
        List<CodeElement> newOccurrences = new ArrayList<>();
        for (CodeElement element : codeElements) {
            if (element.getMethodName().equals(oldMethodName)) {
                element.setMethodName(newMethodName);
                newOccurrences.add(element);
            }
        }
        return newOccurrences;
    }
}

public class Main {
    public static void main(String[] args) {
        RenameMethodProcessor processor = new RenameMethodProcessor();
        processor.addCodeElement(new CodeElement("ClassA", "oldMethod"));
        processor.addCodeElement(new CodeElement("ClassB", "oldMethod"));
        processor.addCodeElement(new CodeElement("ClassC", "anotherMethod"));

        String oldMethodName = "oldMethod";
        String newMethodName = "newMethod";
        List<CodeElement> newOccurrences = processor.batchFindNewOccurrences(oldMethodName, newMethodName);

        System.out.println("New occurrences after renaming:");
        for (CodeElement element : newOccurrences) {
            System.out.println(element);
        }
    }
}    