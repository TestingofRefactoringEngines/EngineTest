import java.io.File;
import java.io.FileFilter;

public class FileFilterExample {
    public static void main(String[] args) {
        FileFilter java = f -> f.getName().endsWith(".java");
        Class<? extends FileFilter> filterClass = java.getClass();
        System.out.println("The class of the FileFilter is: " + filterClass.getName());
        File directory = new File(".");
        if (directory.isDirectory()) {
            File[] javaFiles = directory.listFiles(java);
            if (javaFiles != null) {
                System.out.println("Java files in the directory:");
                for (File file : javaFiles) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}    