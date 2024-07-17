import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElementsFromArrayList {
    public static void main(String[] args){

        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);

        System.out.println("\n");
        //Remove the El at index '5'
        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);
        programmingLanguages.remove(1);
        programmingLanguages.add(1, "Julio was here ");
        programmingLanguages.add(4,"Testing testing");
        System.out.println(programmingLanguages);

        System.out.println("\n");
        //Remove first occurence of given EL from AList
        //(The Remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemoved = programmingLanguages.remove("Python");
        System.out.println("After remove (\"Python\"): " + programmingLanguages);


        //Remove All the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();

        scriptingLanguages.add("C");
        scriptingLanguages.add("Kotlin");
        scriptingLanguages.add("Ruby");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("\nAfter removaAll(scriptingLanguage): " + programmingLanguages);


        //Remove all element from the ArrayList
        programmingLanguages.clear();
        System.out.println("\nClear(): " + programmingLanguages + " <- Empty Array.");


    }
}
