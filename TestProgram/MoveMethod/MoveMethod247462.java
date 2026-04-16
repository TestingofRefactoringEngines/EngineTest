import java.util.ArrayList;
import java.util.List;
class TestRefactorMove {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("AAA");
        list1.add("BBB");
        List<String> list2 = lowerMembers(list1);
        System.out.println("Before: " + list1.toString());
        System.out.println("After:  " + list2.toString());
    }

    public static List<String> lowerMembers(List<String> list) {
        List<String> lower = new ArrayList<>();
        for (String s : list) {
            lower.add(s.toLowerCase());
        }
        return lower;
    }
}    

class SomethingElse {
}