import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample3 {
    public static void main(String[] args){

        List<String> topCompanies = new ArrayList<>();

        // Checking if an Array is empty
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        // Size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " companies int he world");
        System.out.println(topCompanies);
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        //Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondCompany);
        System.out.println("Last Company in the list: " + lastCompany);

        // Modify the El at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("\nModified top companies list: " + topCompanies);

    }
}
