package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> ProgrammingLanguages = new ArrayList<>();
        ProgrammingLanguages.add("C");
        ProgrammingLanguages.add("C++");
        ProgrammingLanguages.add("Java");
        ProgrammingLanguages.add("Kotlin");
        ProgrammingLanguages.add("Python");
        ProgrammingLanguages.add("Perl");
        ProgrammingLanguages.add("Ruby");

        System.out.println("Initial List: " + ProgrammingLanguages);
        ProgrammingLanguages.remove(5);
        System.out.println("after remove(5): " + ProgrammingLanguages);

        boolean isRemove = ProgrammingLanguages.remove("Kotlin");
        System.out.println("after remove(\"Kotlin\"): " + ProgrammingLanguages);

        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        ProgrammingLanguages.removeAll(scriptingLanguages);
        System.out.println("after removeAll(sriptingLanguages): " + ProgrammingLanguages);
        
        ProgrammingLanguages.removeIf(n -> (n.charAt(0) == 'J'));

        System.out.println("after removing all elements that start with \"c\": " + ProgrammingLanguages);

        ProgrammingLanguages.clear();
        System.out.println("after clear(): " + ProgrammingLanguages);




    }
}
