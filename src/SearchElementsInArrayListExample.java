import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Julio");
        names.add("I");
        names.add("Am");
        names.add("From");
        names.add("The");
        names.add("Bronx");

        // Checking if an Arraylist contains a given element
        System.out.println("\nDoes names array contain \" Am\"? : " + names.contains("Am"));

        //IndecOf();
        System.out.println("\nindexOf \"Julio\" : " + names.indexOf("Julio"));
        System.out.println("\nindex of \"Bronx\" : " + names.indexOf("Bronx"));

        //LastIndexOf();
        System.out.println("\nLast index of \"The\" : " + names.lastIndexOf("The"));
        System.out.println("\nLAst oindex of \"Who am i? \" : " + names.lastIndexOf("Who am i?"));


    }
}
