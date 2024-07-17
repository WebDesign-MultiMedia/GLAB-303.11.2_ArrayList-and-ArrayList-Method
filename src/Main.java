import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creating ArryaList String
        List<String> animals = new ArrayList<>();

        //Adding new El to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        //Adding an El at  a particular index in an ArrayList
        animals.add(2, "Julio");
        animals.add(5, "Accenture");
        System.out.println(animals);

    }
}