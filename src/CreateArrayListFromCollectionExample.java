import java.util.ArrayList;
import  java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args){

            List<Integer> firstFivePrimeNum = new ArrayList<>();
            firstFivePrimeNum.add(2);
            firstFivePrimeNum.add(3);
            firstFivePrimeNum.add(5);
            firstFivePrimeNum.add(7);
            firstFivePrimeNum.add(11);

            //Creating an ArrayList from another collection
        List<Integer> firstTenPrimeNum = new ArrayList<>(firstFivePrimeNum);

        List<Integer> nextFivePrimeNum = new ArrayList<>();
        nextFivePrimeNum.add(13);
        nextFivePrimeNum.add(17);
        nextFivePrimeNum.add(19);
        nextFivePrimeNum.add(23);
        nextFivePrimeNum.add(29);

        // Adding an entire collection to an ArrayList
        firstTenPrimeNum.addAll(nextFivePrimeNum);

        System.out.println(firstTenPrimeNum);
    }
}
