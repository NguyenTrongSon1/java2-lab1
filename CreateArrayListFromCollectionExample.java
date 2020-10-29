package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> FirstFivePrimeNumber = new ArrayList<>();
        FirstFivePrimeNumber.add(2);
        FirstFivePrimeNumber.add(3);
        FirstFivePrimeNumber.add(5);
        FirstFivePrimeNumber.add(7);
        FirstFivePrimeNumber.add(11);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(FirstFivePrimeNumber);
        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        firstTenPrimeNumbers.add(13);
        firstTenPrimeNumbers.add(17);
        firstTenPrimeNumbers.add(19);
        firstTenPrimeNumbers.add(23);
        firstTenPrimeNumbers.add(29);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);

    }
}
